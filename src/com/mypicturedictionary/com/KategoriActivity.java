package com.mypicturedictionary.com;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class KategoriActivity extends DashBoardActivity {
	String Jenis = DictionaryActivity.Jenis;
	public static String Kategori;
	private Button btnSatu, btnDua, btnTiga;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.activity_kategory);
		setHeader(Jenis, true, true);   
		
		btnSatu = (Button) findViewById(R.id.btnSatu);
		btnDua  = (Button) findViewById(R.id.btnDua);
		btnTiga = (Button) findViewById(R.id.btnTiga);
		
		final Drawable drawableLand  = getResources().getDrawable(R.drawable.btn_land);
		final Drawable drawableAir   = getResources().getDrawable(R.drawable.btn_air);
		final Drawable drawableSea   = getResources().getDrawable(R.drawable.btn_sea);
		final Drawable drawableFood  = getResources().getDrawable(R.drawable.btn_food);
		final Drawable drawableDrink = getResources().getDrawable(R.drawable.btn_drink);
		
	    if (Jenis.equals("Animal") || Jenis.equals("Transportasi")) {
	    	btnSatu.setCompoundDrawablesWithIntrinsicBounds(null, drawableLand , null, null);
	    	btnSatu.setText(getString(R.string.land));
	    	btnDua.setCompoundDrawablesWithIntrinsicBounds(null, drawableAir , null, null);
	    	btnDua.setText(getString(R.string.air));
	    	
	    	btnTiga.setVisibility(View.VISIBLE);
	    	btnTiga.setCompoundDrawablesWithIntrinsicBounds(null, drawableSea , null, null);
	    	btnTiga.setText(getString(R.string.sea));
	    } else if (Jenis.equals("FoodDrink")) {
	    	btnSatu.setCompoundDrawablesWithIntrinsicBounds(null, drawableFood , null, null);
	    	btnSatu.setText(getString(R.string.food));
	    	btnDua.setCompoundDrawablesWithIntrinsicBounds(null, drawableDrink , null, null);
	    	btnDua.setText(getString(R.string.drink));
	    	btnTiga.setVisibility(View.GONE);
	    } else if (Jenis.equals("Number") || Jenis.equals("Color")) {
	    	Kategori = "";
	    	finish();
	    	goDetail();
	    }
	}
	
	public void btnLandClick(View v) {
		if (Jenis.equals("FoodDrink")) {
			Kategori = "Food";
		} else {
			Kategori = "Land";
		}
		
		goDetail();
	}
	
	public void btnAirClick(View v) {
		if (Jenis.equals("FoodDrink")) {
			Kategori = "Drink";
		} else {
			Kategori = "Air";
		}
		
		goDetail();
	}
	
	public void btnSeaClick(View v) {
		Kategori  = "Sea";
		goDetail();
	}
	
	public void goDetail() {
		startActivity( new Intent( getApplicationContext(), DetailActivity.class ) );
		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
	}
	
}