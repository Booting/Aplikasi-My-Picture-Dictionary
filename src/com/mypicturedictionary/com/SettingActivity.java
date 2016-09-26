package com.mypicturedictionary.com;

import android.os.Bundle;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class SettingActivity extends DashBoardActivity implements OnCheckedChangeListener {
	int ii = DashBoardActivity.i;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.activity_setting);
		setHeader("Setting", true, true);  
		
		CheckBox chkSound = (CheckBox) findViewById(R.id.chkSound);
		
		if (ii == 0) {
			chkSound.setChecked(true);
		} else {
			chkSound.setChecked(false);
		}
		
		chkSound.setOnCheckedChangeListener(this);
	}
	
	@SuppressWarnings("static-access")
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) { 
		if (isChecked) { 
			StartPlayer(); 
			DashBoardActivity db = new DashBoardActivity() {};
			db.i = 0;
		} else { 
			StopPlayer();
			DashBoardActivity db = new DashBoardActivity() {};
			db.i = 1;
		} 
	}
	
}