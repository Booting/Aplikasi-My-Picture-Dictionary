package com.mypicturedictionary.com;

import java.util.Random;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RadioButton; 
import android.widget.Toast;

public class PlayGamesActivity extends DashBoardActivity {
	private RadioButton choiseA, choiseB, choiseC, choiseD;
	private String random;
	private int idx;
	private int bab   = 0;
	private int nilai = 0;
	private ImageView txtImage;
	private String level = MiniGamesActivity.level;
	
	String[] animal;
	String[] animalThumb;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.activity_play_games);
		setHeader("Play Games", true, true);    
		
		txtImage = (ImageView) findViewById(R.id.txtImage); 
		choiseA  = (RadioButton) findViewById(R.id.choiseA);
		choiseB  = (RadioButton) findViewById(R.id.choiseB);
		choiseC  = (RadioButton) findViewById(R.id.choiseC);
		choiseD  = (RadioButton) findViewById(R.id.choiseD);
		
		if (level.equals("satu")) {
			animal 	    = new String[] { "Tiger", "Wolf", "Deer", "Elephant", "Rhinoceros", "Eagle", "Crow", "Bats", "Dragonfly", "Owl", "Shark", "Lobster", "Octopus", "Whale", "Starfish" };
			animalThumb = new String[] { "harimau", "serigala", "rusa", "gajah", "badak", "elang", "gagak", "kelelawar", "capung", "burung_hantu", "hiu", "udang", "gurita", "ikan_paus", "bintang_laut" };
		} else if (level.equals("dua")) {
			animal 	    = new String[] { "Car", "Motorcycle", "Pedicab", "Train", "Bicycle", "Boat", "Sloop", "Yacht", "Ship", "Canoe", "Helicopter", "Aircraft", "Air Balloon", "Apollo Plane", "Jet" };
			animalThumb = new String[] { "mobil", "motor", "becak", "kereta", "sepeda", "perahu", "sekoci", "kapal_pesiar", "bahtera", "sampan", "helikopter", "pesawat", "balon_udara", "pesawat_apollo", "pesawat_jet" };
		} else if (level.equals("tiga")) {
			animal      = new String[] { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
			animalThumb = new String[] { "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan" };
		}
		
		play();
	}
	
	public void play() {
		if (bab == 5) {
			Toast.makeText(getBaseContext(), "Score : " + nilai, Toast.LENGTH_LONG).show();
			startActivity( new Intent( getApplicationContext(), MiniGamesActivity.class ) );
			overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
			finish();
		} else {
			random();
			
			// Set text to choise A, B, C & D
			int pilihan = 1 + (int) (Math.random() * (( 4 - 1 )) + 1); 
			
			if (pilihan == 1) {
				choiseA.setText(random);
				if (idx==0) {
					choiseB.setText(animal[idx+1]);
					choiseC.setText(animal[idx+2]);
					choiseD.setText(animal[idx+3]);
				} else if ((idx==(animal.length-1)) || (idx==(animal.length-2)) || (idx==(animal.length-3))) {
					choiseB.setText(animal[idx-1]);
					choiseC.setText(animal[idx-2]);
					choiseD.setText(animal[idx-3]);
				} else {
					choiseB.setText(animal[idx+1]);
					choiseC.setText(animal[idx+2]);
					choiseD.setText(animal[idx+3]);
				}
			} else if (pilihan == 2) {
				choiseB.setText(random);
				if (idx==0) {
					choiseA.setText(animal[idx+1]);
					choiseC.setText(animal[idx+2]);
					choiseD.setText(animal[idx+3]);
				} else if ((idx==(animal.length-1)) || (idx==(animal.length-2)) || (idx==(animal.length-3))) {
					choiseA.setText(animal[idx-1]);
					choiseC.setText(animal[idx-2]);
					choiseD.setText(animal[idx-3]);
				} else {
					choiseA.setText(animal[idx+1]);
					choiseC.setText(animal[idx+2]);
					choiseD.setText(animal[idx+3]);
				}
			} else if (pilihan == 3) {
				choiseC.setText(random);
				if (idx==0) {
					choiseB.setText(animal[idx+1]);
					choiseA.setText(animal[idx+2]);
					choiseD.setText(animal[idx+3]);
				} else if ((idx==(animal.length-1)) || (idx==(animal.length-2)) || (idx==(animal.length-3))) {
					choiseB.setText(animal[idx-1]);
					choiseA.setText(animal[idx-2]);
					choiseD.setText(animal[idx-3]);
				} else {
					choiseB.setText(animal[idx+1]);
					choiseA.setText(animal[idx+2]);
					choiseD.setText(animal[idx+3]);
				}
			} else if (pilihan == 4) {
				choiseD.setText(random);
				if (idx==0) {
					choiseB.setText(animal[idx+1]);
					choiseC.setText(animal[idx+2]);
					choiseA.setText(animal[idx+3]);
				} else if ((idx==(animal.length-1)) || (idx==(animal.length-2)) || (idx==(animal.length-3))) {
					choiseB.setText(animal[idx-1]);
					choiseC.setText(animal[idx-2]);
					choiseA.setText(animal[idx-3]);
				} else {
					choiseB.setText(animal[idx+1]);
					choiseC.setText(animal[idx+2]);
					choiseA.setText(animal[idx+3]);
				}
			}
		}
	}
	
	public void random() {
		idx    = new Random().nextInt(animal.length);
		random = (animal[idx]);
		
		String PACKAGE_NAME = getApplicationContext().getPackageName();
		int imgId = getResources().getIdentifier(PACKAGE_NAME+":drawable/"+(animalThumb[idx]) , null, null);
		txtImage.setImageBitmap(BitmapFactory.decodeResource(getResources(),imgId));
	}
	
	public void btnAnswerClick(View v) {
		if (choiseA.isChecked()) {
			if (choiseA.getText().toString().equals(random)) {
				nilai = nilai + 1;
			}
		}
		
		if (choiseB.isChecked()) {
			if (choiseB.getText().toString().equals(random)) {
				nilai = nilai + 1;
			}
		}
		
		if (choiseC.isChecked()) {
			if (choiseC.getText().toString().equals(random)) {
				nilai = nilai + 1;
			}
		}
		
		if (choiseD.isChecked()) {
			if (choiseD.getText().toString().equals(random)) {
				nilai = nilai + 1;
			}
		}
		
		bab = bab + 1;
		play();
	}
	
}