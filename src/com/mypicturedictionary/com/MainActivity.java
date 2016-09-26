package com.mypicturedictionary.com;

import com.mypicturedictionary.database.DictionaryDB;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Window;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;

public class MainActivity extends Activity {
    private DictionaryDB DictionaryDB = null;
	private SQLiteDatabase db = null;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		new MyFetchTask().execute();
	}
	
    public class MyFetchTask extends AsyncTask<Void, Void, Void> {
	    @Override
	    protected void onPreExecute() {
	        // TODO Auto-generated method stub
	        super.onPreExecute();
	    }

	    @Override
	    protected Void doInBackground(Void... params) {
	        // TODO Auto-generated method stub
	    	DictionaryDB = new DictionaryDB(getApplicationContext());
			db = DictionaryDB.getWritableDatabase();
			DictionaryDB.createTable(db, getBaseContext());
			DictionaryDB.generateData(db);
			
	        return null;
	    }

	    @Override
	    protected void onPostExecute(Void result) {
	        // TODO Auto-generated method stub
	        super.onPostExecute(result);

	        startActivity( new Intent( getApplicationContext(), HomeActivity.class ) );
    		overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );

            // close this activity
            finish();
	    }
	}
}