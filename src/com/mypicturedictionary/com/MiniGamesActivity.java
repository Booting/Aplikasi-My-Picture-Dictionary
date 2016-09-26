package com.mypicturedictionary.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MiniGamesActivity extends DashBoardActivity {
	public static String level;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.activity_mini_games);
		setHeader("Mini Games", true, true);    
	}
	
	/**
     * Level One button click handler
     * @param v
     */
    public void btnLevelOneClick(View v) {
    	level = "satu";
    	startActivity( new Intent( getApplicationContext(), PlayGamesActivity.class ) );
		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    }
	
    /**
     * Level Two button click handler
     * @param v
     */
    public void btnLevelTwoClick(View v) {
    	level = "dua";
    	startActivity( new Intent( getApplicationContext(), PlayGamesActivity.class ) );
		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    }
    
    /**
     * Level Three button click handler
     * @param v
     */
    public void btnLevelThreeClick(View v) {
    	level = "tiga";
    	startActivity( new Intent( getApplicationContext(), PlayGamesActivity.class ) );
		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    }
 
}