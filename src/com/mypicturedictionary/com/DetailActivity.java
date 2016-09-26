package com.mypicturedictionary.com;

import java.util.ArrayList;
import com.mypicturedictionary.adapter.DictionaryAdapter;
import com.mypicturedictionary.database.DictionaryDB;
import com.mypicturedictionary.model.Dictionary;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends DashBoardActivity {
	// ATRIBUT
	private DictionaryAdapter adapter = null;
	private DictionaryDB DictionaryDB = null;
	private SQLiteDatabase db = null;
	private ArrayList<Dictionary> listDictionary = null;
	private String Jenis    = DictionaryActivity.Jenis;
	private String Kategori = KategoriActivity.Kategori;
	private TextView txtIndonesia, txtEnglish;
	private ImageView txtImage;
	private MediaPlayer player;
	private int count;
	private int now = 0;
	private String Indonesia, English, Image, Sound;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.activity_detail);

		if (Kategori.equals("")) {
			setHeader(Jenis, true, true);
		} else {
			setHeader(Kategori, true, true);    
		}
		
		txtIndonesia = (TextView) findViewById(R.id.txtIndonesia);
		txtEnglish   = (TextView) findViewById(R.id.txtEnglish);
		txtImage     = (ImageView) findViewById(R.id.txtImage);
		
		getListDictionary();
		refreshListAdapter(Kategori, Jenis);

	}
	
	public void btnPlaySoundClick(View v) {
		if (Sound.equals("")) {
			Toast.makeText(getBaseContext(), "No Sound", Toast.LENGTH_SHORT).show();
		} else {
			PlaySound(Sound);
		}
	}

	public void PlaySound(String fileName) {
	    int sound_id = this.getResources().getIdentifier(fileName, "raw", this.getPackageName());
	    
	    try{
			if (player.isPlaying()) {
				player.stop();
				player.release();
			}
		} catch(Exception e) {
			System.out.println("Catch");
		}
	    
	    if (sound_id != 0) {
	    	System.out.println("Play");
	    	player = MediaPlayer.create(this, sound_id);
	    	player.setLooping(false); // Set looping
	    	player.setVolume(100,100); 
			player.start();
	    } else {
	    	System.out.println("Error");
	    }
	}
	
	// TODO Get data from database SQLite
	private void getListDictionary() {
		DictionaryDB = new DictionaryDB(getApplicationContext());
		adapter = new DictionaryAdapter(this);
		db = DictionaryDB.getWritableDatabase();
		DictionaryDB.createTable(db, this);
		//DictionaryDB.generateData(db);
	}
	
	// TODO We need to refresh adapter for every data update. Without it, ListView will never be refreshed
	protected void refreshListAdapter(String filterText, String filterText2) {
		listDictionary = DictionaryDB.toArray( filterText, filterText2 );
		adapter.updateListDictionary(listDictionary);
		
		if (adapter.getCount() == 0) {
			Toast.makeText(getBaseContext(), "Sorry, data " + Jenis + " from category " + Kategori + " is empty", Toast.LENGTH_LONG).show();
		} else {
			count = adapter.getCount();
			setTextImageSound(now);
		}
	}
	
	public void setTextImageSound(int i) {
		Indonesia = adapter.getItem(i).getIndonesia();
		English   = adapter.getItem(i).getEnglish();
		Image     = adapter.getItem(i).getImage();
		Sound     = adapter.getItem(i).getSound();
		
		if (Indonesia.equals("")) {
			txtIndonesia.setText("-");
		} else {
			txtIndonesia.setText(Indonesia);
		}
			
		if (English.equals("")) {
			txtEnglish.setText("-");
		} else {
			txtEnglish.setText(English);
		}
		
		if (Image.equals("")) {
			txtImage.setVisibility(View.GONE);
		} else {
			String PACKAGE_NAME = getApplicationContext().getPackageName();
			int imgId = getResources().getIdentifier(PACKAGE_NAME+":drawable/"+Image , null, null);
			txtImage.setImageBitmap(BitmapFactory.decodeResource(getResources(),imgId));
		}
	}
	
	public void btnPrevClick(View v) {
		now = now - 1;
		if (now == (-1)) {
			now = count-1;
			setTextImageSound(now);
		} else {
			setTextImageSound(now);
		}
	}
	
	public void btnNextClick(View v) {
		now = now + 1;
		if (now == (count)) {
			now = 0;
			setTextImageSound(now);
		} else {
			setTextImageSound(now);
		}
	}
	
	@Override
	protected void onDestroy() {
	    super.onDestroy();
	    if ((DictionaryDB != null)) {
	    	DictionaryDB.close();
	    }
	    if (db != null) {
	        db.close();
	    }
	}
	
}