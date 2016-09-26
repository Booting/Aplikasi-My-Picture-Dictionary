package com.mypicturedictionary.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MenuActivity extends DashBoardActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.activity_menu);
		setHeader("Menu", true, true);    
	}
	
	/**
     * Dictionary button click handler
     * @param v
     */
    public void btnDictionaryClick(View v) {
    	startActivity( new Intent( getApplicationContext(), DictionaryActivity.class ) );
		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    }
    
    /**
     * MiniGames button click handler
     * @param v
     */
    public void btnMiniGamesClick(View v) {
    	startActivity( new Intent( getApplicationContext(), MiniGamesActivity.class ) );
		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    }
 
    /**
     * Setting button click handler
     * @param v
     */
    public void btnSettingClick(View v) {
    	startActivity( new Intent( getApplicationContext(), SettingActivity.class ) );
		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    }
    
}