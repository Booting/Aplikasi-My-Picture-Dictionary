package com.mypicturedictionary.com;

import java.util.List;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog.Builder;

/**
 *  @author : Daniel FJP Napitupulu
 *  @Email  : if09033@gmail.com
 *  @Website: http://booting09.com
 */
public abstract class DashBoardActivity extends FragmentActivity {
	// Constant for identifying the dialog
	private static final int DIALOG_ALERT = 10; 
	Button btnHome;
	MediaPlayer player;
	public MediaPlayer mPlayer;
	public static int i = 0;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }
	
    public void setHeader(String title, boolean btnHomeVisible, boolean btnFeedbackVisible) {
    	ViewStub stub = (ViewStub) findViewById(R.id.vsHeader);
    	View inflated = stub.inflate();
          
    	TextView txtTitle = (TextView) inflated.findViewById(R.id.txtHeading);
    	txtTitle.setText(title);
    		
    	btnHome = (Button) inflated.findViewById(R.id.btnHome);
    	if(!btnHomeVisible)
    		btnHome.setVisibility(View.INVISIBLE);
    		
    	Button btnFeedback = (Button) inflated.findViewById(R.id.btnFeedback);
    	if(!btnFeedbackVisible)
    		btnFeedback.setVisibility(View.INVISIBLE);
    	
    	if (title.equals("Home")) {
    		btnHome.setText("About");
    	}
    }
    
    /**
     * Home button click handler
     * @param v
     */
    public void btnHomeClick(View v) {
    	if (btnHome.getText().toString().equals("About")) {
    		startActivity( new Intent( getApplicationContext(), AboutActivity.class ));
			overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    	} else {
	    	startActivity( new Intent( getApplicationContext(), HomeActivity.class ).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
			overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    	}
    }
    
    /**
     * Logout button click handler
     * @param v
     */
	@SuppressWarnings("deprecation")
	public void btnFeedbackClick(View v) {
    	showDialog(DIALOG_ALERT);
    }
    
	@SuppressWarnings("deprecation")
	@Override
    protected Dialog onCreateDialog(int id) {
      switch (id) {
        case DIALOG_ALERT:
        // Create out AlterDialog
        Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Anda Benar-Benar ingin keluar?");
        builder.setCancelable(true);
        builder.setPositiveButton("Ya", new OkOnClickListener());
        builder.setNegativeButton("Tidak", new CancelOnClickListener());
        AlertDialog dialog = builder.create();
        dialog.show();
       }
      return super.onCreateDialog(id);
    }

    private final class CancelOnClickListener implements DialogInterface.OnClickListener {
    	@Override
    	public void onClick(DialogInterface dialog, int which) {
    		dialog.cancel();
    	}
    }

    private final class OkOnClickListener implements DialogInterface.OnClickListener {
    	@Override
    	public void onClick(DialogInterface dialog, int which) {
    		Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
    		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    		intent.putExtra("EXIT", true);
    		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    		startActivity(intent);
    		finish();
      }
    } 
    
    // TODO Wrapper method to encapsulate getApplicationContext() that is needed for displaying Toast message
	protected void showToast(String text) {
		Toast.makeText(getApplication(), text, Toast.LENGTH_SHORT).show();
	}
	
	public void StartPlayer(){
		mPlayer = MediaPlayer.create(DashBoardActivity.this, R.raw.backsound); 
		mPlayer.setLooping(true); // Set looping 
		mPlayer.setVolume(100,100); 
		mPlayer.start();

	}
		
	public void StopPlayer(){
		if(mPlayer!=null && mPlayer.isPlaying()){//If music is playing already
			mPlayer.stop();//Stop playing the music
		}
	}
	
	public void onPause() {
		super.onPause();
	    
		Context context = getApplicationContext();
	    ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
	    List<RunningTaskInfo> taskInfo = am.getRunningTasks(1);
	    
	    if (!taskInfo.isEmpty()) {
	    	ComponentName topActivity = taskInfo.get(0).topActivity; 
	        if (!topActivity.getPackageName().equals(context.getPackageName())) {
	        	StopPlayer();
	        }
	    }
	}
	
	public void onResume() {
       super.onResume();
       if (i==0) {
    	   StartPlayer();
       } else {
    	   StopPlayer();
       }
    }
	
	public void onStop() {
		super.onStop();
		StopPlayer();
	}
}