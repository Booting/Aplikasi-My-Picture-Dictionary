package com.mypicturedictionary.adapter;

import java.util.ArrayList;
import com.mypicturedictionary.com.R;
import com.mypicturedictionary.model.Dictionary;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class DictionaryAdapter extends BaseAdapter {
	private ArrayList<Dictionary> listDictionary = null;
	private static LayoutInflater inflater = null;

	public DictionaryAdapter(Activity activity) {
		inflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public void updateListDictionary(ArrayList<Dictionary> newListDictionary) {
		this.listDictionary = newListDictionary;
	}

	@Override
	public int getCount() {
		return this.listDictionary.size();
	}

	@Override
	public Dictionary getItem(int position) {
		return this.listDictionary.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	
	@Override
	public View getView(int position, View view, ViewGroup viewGroup) {
		View vi = view;
		if (vi == null) {
			vi = inflater.inflate(R.layout.list_item, null);
		}

		Dictionary psn = this.listDictionary.get(position);

		TextView txtImage     = (TextView) vi.findViewById(R.id.txtImage);
		TextView txtSound     = (TextView) vi.findViewById(R.id.txtSound);
		TextView txtIndonesia = (TextView) vi.findViewById(R.id.txtIndonesia);
		TextView txtEnglish   = (TextView) vi.findViewById(R.id.txtEnglish);
		TextView txtId        = (TextView) vi.findViewById(R.id.txtId);

		txtImage.setText(psn.getImage());
		txtSound.setText(psn.getSound());
		txtIndonesia.setText(psn.getIndonesia());
		txtEnglish.setText("- " + psn.getIndonesia() + " ( " + psn.getEnglish() + " )");
		txtId.setText(psn.getId());
		
		return vi;
	}
}