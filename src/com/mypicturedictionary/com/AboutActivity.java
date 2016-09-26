package com.mypicturedictionary.com;

import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class AboutActivity extends DashBoardActivity {
	//Atribut
	private TextView txtAbout; 
	
	// Method
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.activity_about);
		setHeader("About", true, true);  
	
		txtAbout = (TextView) findViewById(R.id.txtAbout);
		txtAbout.setText("My Picture Dictionary is a vocabulary recognition applications english." +
				"These applications are the dictionary features and mini-games. There dictionary english " +
				"vocabulary with Indonesian translation and there are images that facilitate the introduction " +
				"of vocabulary.\n\n" +
				"Mini games are quiz guess the picture so that applications become more interactive.\n\n" +
				"This application is suitable for all ages and devoted to the children of primary school students.");
	}
	  
}