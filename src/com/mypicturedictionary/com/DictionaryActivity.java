package com.mypicturedictionary.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class DictionaryActivity extends DashBoardActivity {
	public static String Jenis;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.activity_dictionary);
		setHeader("Dictionary", true, true);    
	}
	
	/**
     * Animal button click handler
     * @param v
     */
    public void btnAnimalClick(View v) {
    	Jenis = "Animal";
    	startActivity( new Intent( getApplicationContext(), KategoriActivity.class ) );
		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    }
    
    /**
     * Plant button click handler
     * @param v
     */
    public void btnPlantClick(View v) {
    	Jenis = "FoodDrink";
    	startActivity( new Intent( getApplicationContext(), KategoriActivity.class ) );
		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    }
    
    /**
     * Number button click handler
     * @param v
     */
    public void btnNumberClick(View v) {
    	Jenis = "Number";
    	startActivity( new Intent( getApplicationContext(), KategoriActivity.class ) );
		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    }
    
    /**
     * Transportation button click handler
     * @param v
     */
    public void btnTransportationClick(View v) {
    	Jenis = "Transportasi";
    	startActivity( new Intent( getApplicationContext(), KategoriActivity.class ) );
		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    }
    
    /**
     * Color button click handler
     * @param v
     */
    public void btnColorClick(View v) {
    	Jenis = "Color";
    	startActivity( new Intent( getApplicationContext(), KategoriActivity.class ) );
		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    }
    
}