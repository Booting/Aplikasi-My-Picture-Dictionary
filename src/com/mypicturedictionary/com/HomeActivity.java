package com.mypicturedictionary.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class HomeActivity extends DashBoardActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.activity_home);
		setHeader("Home", true, true);  
		
		if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
	}
	
	/**
     * Enter button click handler
     * @param v
     */
    public void btnEnterClick(View v) {
    	startActivity( new Intent( getApplicationContext(), MenuActivity.class ) );
		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    }
 
}