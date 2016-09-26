package com.mypicturedictionary.database;

import java.util.ArrayList;
import com.mypicturedictionary.model.Dictionary;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;

/**
 * @author  Daniel FJP Napitupulu
 * @email   if09033@gmail.com
 * @website http://booting09.com
 */
public class DictionaryDB extends SQLiteOpenHelper {
	private Context context = null;
	private SQLiteDatabase database = null;
	private static final String DATABASE_NAME = "dbDictionary";
	private static final String CONTACT_NAME  = "ahb_m_Dictionary";
	
	public static final String KEY_ID        = "Id";
	public static final String KEY_Jenis     = "Jenis";
	public static final String KEY_Kategori  = "Kategori";
	public static final String KEY_English   = "English";
	public static final String KEY_Indonesia = "Indonesia";
	public static final String KEY_Image     = "Image";
	public static final String KEY_Sound 	 = "Sound";
	
	public DictionaryDB(Context context) {
		super(context, DATABASE_NAME, null, 1);
	}
	
	public void createTable(SQLiteDatabase db, Context context) {
		this.context = context;
		database = this.context.openOrCreateDatabase(DATABASE_NAME, SQLiteDatabase.CREATE_IF_NECESSARY, null);
		String sqlCreate = "CREATE TABLE IF NOT EXISTS " + CONTACT_NAME + " ("
				+ KEY_ID + " int(11) PRIMARY KEY," 
				+ KEY_Jenis + " varchar(50)," 
				+ KEY_Kategori + " varchar(50),"
				+ KEY_English + " text,"
				+ KEY_Indonesia + " text,"
				+ KEY_Image + " text,"
				+ KEY_Sound + " text" + ");";
		DBUtil.createTable(database, CONTACT_NAME, sqlCreate); 
	}

	// TODO generateData to SQLite
	public void generateData(SQLiteDatabase db){
		ContentValues cv = new ContentValues();
		cv.put(KEY_ID, 1);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Land");
		cv.put(KEY_English, "Tiger");
		cv.put(KEY_Indonesia, "Harimau");
		cv.put(KEY_Image, "harimau");
		cv.put(KEY_Sound, "harimau");
		db.insert(CONTACT_NAME, KEY_ID, cv);
		
		cv.put(KEY_ID, 2);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Land");
		cv.put(KEY_English, "Wolf");
		cv.put(KEY_Indonesia, "Serigala");
		cv.put(KEY_Image, "serigala");
		cv.put(KEY_Sound, "serigala");
		db.insert(CONTACT_NAME, KEY_ID, cv);
		
		cv.put(KEY_ID, 3);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Land");
		cv.put(KEY_English, "Deer");
		cv.put(KEY_Indonesia, "Rusa");
		cv.put(KEY_Image, "rusa");
		cv.put(KEY_Sound, "rusa");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 4);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Land");
		cv.put(KEY_English, "Elephant");
		cv.put(KEY_Indonesia, "Gajah");
		cv.put(KEY_Image, "gajah");
		cv.put(KEY_Sound, "gajah");
		db.insert(CONTACT_NAME, KEY_ID, cv);
		
		cv.put(KEY_ID, 5);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Land");
		cv.put(KEY_English, "Rhinoceros");
		cv.put(KEY_Indonesia, "Badak");
		cv.put(KEY_Image, "badak");
		cv.put(KEY_Sound, "badak");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 6);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Air");
		cv.put(KEY_English, "Eagle");
		cv.put(KEY_Indonesia, "Elang");
		cv.put(KEY_Image, "elang");
		cv.put(KEY_Sound, "elang");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 7);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Air");
		cv.put(KEY_English, "Crow");
		cv.put(KEY_Indonesia, "Gagak");
		cv.put(KEY_Image, "gagak");
		cv.put(KEY_Sound, "gagak");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 8);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Air");
		cv.put(KEY_English, "Bats");
		cv.put(KEY_Indonesia, "Kelelawar");
		cv.put(KEY_Image, "kelelawar");
		cv.put(KEY_Sound, "kelelawar");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 9);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Air");
		cv.put(KEY_English, "Dragonfly");
		cv.put(KEY_Indonesia, "Capung");
		cv.put(KEY_Image, "capung");
		cv.put(KEY_Sound, "capung");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 10);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Air");
		cv.put(KEY_English, "Owl");
		cv.put(KEY_Indonesia, "Burung Hantu");
		cv.put(KEY_Image, "burung_hantu");
		cv.put(KEY_Sound, "burung_hantu");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 11);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Sea");
		cv.put(KEY_English, "Shark");
		cv.put(KEY_Indonesia, "Hiu");
		cv.put(KEY_Image, "hiu");
		cv.put(KEY_Sound, "hiu");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 12);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Sea");
		cv.put(KEY_English, "Lobster");
		cv.put(KEY_Indonesia, "Udang");
		cv.put(KEY_Image, "udang");
		cv.put(KEY_Sound, "udang");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 13);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Sea");
		cv.put(KEY_English, "Octopus");
		cv.put(KEY_Indonesia, "Gurita");
		cv.put(KEY_Image, "gurita");
		cv.put(KEY_Sound, "gurita");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 14);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Sea");
		cv.put(KEY_English, "Whale");
		cv.put(KEY_Indonesia, "Ikan Paus");
		cv.put(KEY_Image, "ikan_paus");
		cv.put(KEY_Sound, "ikan_paus");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 15);
		cv.put(KEY_Jenis, "Animal");
		cv.put(KEY_Kategori, "Sea");
		cv.put(KEY_English, "Starfish");
		cv.put(KEY_Indonesia, "Bintang Laut");
		cv.put(KEY_Image, "bintang_laut");
		cv.put(KEY_Sound, "bintang_laut");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 16);
		cv.put(KEY_Jenis, "FoodDrink");
		cv.put(KEY_Kategori, "Food");
		cv.put(KEY_English, "Meatballs");
		cv.put(KEY_Indonesia, "Bakso");
		cv.put(KEY_Image, "bakso");
		cv.put(KEY_Sound, "bakso");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 17);
		cv.put(KEY_Jenis, "FoodDrink");
		cv.put(KEY_Kategori, "Food");
		cv.put(KEY_English, "French Fries");
		cv.put(KEY_Indonesia, "Kentang Goreng");
		cv.put(KEY_Image, "kentang_goreng");
		cv.put(KEY_Sound, "kentang_goreng");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 18);
		cv.put(KEY_Jenis, "FoodDrink");
		cv.put(KEY_Kategori, "Food");
		cv.put(KEY_English, "Noodles");
		cv.put(KEY_Indonesia, "Mie");
		cv.put(KEY_Image, "mie");
		cv.put(KEY_Sound, "mie");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 19);
		cv.put(KEY_Jenis, "FoodDrink");
		cv.put(KEY_Kategori, "Food");
		cv.put(KEY_English, "Fried Rice");
		cv.put(KEY_Indonesia, "Nasi Goreng");
		cv.put(KEY_Image, "nasi_goreng");
		cv.put(KEY_Sound, "nasi_goreng");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 21);
		cv.put(KEY_Jenis, "FoodDrink");
		cv.put(KEY_Kategori, "Food");
		cv.put(KEY_English, "Sandwich");
		cv.put(KEY_Indonesia, "Roti Isi"); 
		cv.put(KEY_Image, "roti_isi");
		cv.put(KEY_Sound, "roti_isi");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 22);
		cv.put(KEY_Jenis, "FoodDrink");
		cv.put(KEY_Kategori, "Drink");
		cv.put(KEY_English, "Mineral Water");
		cv.put(KEY_Indonesia, "Air Putih");
		cv.put(KEY_Image, "air_putih");
		cv.put(KEY_Sound, "air_putih");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 23);
		cv.put(KEY_Jenis, "FoodDrink");
		cv.put(KEY_Kategori, "Drink");
		cv.put(KEY_English, "Coffee");
		cv.put(KEY_Indonesia, "Kopi");
		cv.put(KEY_Image, "kopi");
		cv.put(KEY_Sound, "kopi");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 24);
		cv.put(KEY_Jenis, "FoodDrink");
		cv.put(KEY_Kategori, "Drink");
		cv.put(KEY_English, "Milk");
		cv.put(KEY_Indonesia, "Susu");
		cv.put(KEY_Image, "susu");
		cv.put(KEY_Sound, "susu");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 25);
		cv.put(KEY_Jenis, "FoodDrink");
		cv.put(KEY_Kategori, "Drink");
		cv.put(KEY_English, "Tea");
		cv.put(KEY_Indonesia, "Teh");
		cv.put(KEY_Image, "teh");
		cv.put(KEY_Sound, "teh");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 26);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Land");
		cv.put(KEY_English, "Car");
		cv.put(KEY_Indonesia, "Mobil");
		cv.put(KEY_Image, "mobil");
		cv.put(KEY_Sound, "mobil");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 27);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Land");
		cv.put(KEY_English, "Motorcycle");
		cv.put(KEY_Indonesia, "Motor");
		cv.put(KEY_Image, "motor");
		cv.put(KEY_Sound, "motor");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 28);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Land");
		cv.put(KEY_English, "Pedicab");
		cv.put(KEY_Indonesia, "Becak");
		cv.put(KEY_Image, "becak");
		cv.put(KEY_Sound, "becak");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 29);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Land");
		cv.put(KEY_English, "Train");
		cv.put(KEY_Indonesia, "Kereta");
		cv.put(KEY_Image, "kereta");
		cv.put(KEY_Sound, "kereta");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 30);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Land");
		cv.put(KEY_English, "Bicycle");
		cv.put(KEY_Indonesia, "Sepeda");
		cv.put(KEY_Image, "sepeda");
		cv.put(KEY_Sound, "sepeda");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 31);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Sea");
		cv.put(KEY_English, "Boat");
		cv.put(KEY_Indonesia, "Perahu");
		cv.put(KEY_Image, "perahu");
		cv.put(KEY_Sound, "perahu");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 32);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Sea");
		cv.put(KEY_English, "Sloop");
		cv.put(KEY_Indonesia, "Sekoci");
		cv.put(KEY_Image, "sekoci");
		cv.put(KEY_Sound, "sekoci");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 33);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Sea");
		cv.put(KEY_English, "Yacht");
		cv.put(KEY_Indonesia, "Kapal Pesiar");
		cv.put(KEY_Image, "kapal_pesiar");
		cv.put(KEY_Sound, "kapal_pesiar");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 34);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Sea");
		cv.put(KEY_English, "Ship");
		cv.put(KEY_Indonesia, "Bahtera");
		cv.put(KEY_Image, "bahtera");
		cv.put(KEY_Sound, "bahtera");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 35);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Sea");
		cv.put(KEY_English, "Canoe");
		cv.put(KEY_Indonesia, "Sampan");
		cv.put(KEY_Image, "sampan");
		cv.put(KEY_Sound, "sampan");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 36);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Air");
		cv.put(KEY_English, "Helicopter");
		cv.put(KEY_Indonesia, "Helikopter");
		cv.put(KEY_Image, "helikopter");
		cv.put(KEY_Sound, "helikopter");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 37);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Air");
		cv.put(KEY_English, "Aircraft");
		cv.put(KEY_Indonesia, "Pesawat");
		cv.put(KEY_Image, "pesawat");
		cv.put(KEY_Sound, "pesawat");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 38);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Air");
		cv.put(KEY_English, "Air Balloon");
		cv.put(KEY_Indonesia, "Balon Udara");
		cv.put(KEY_Image, "balon_udara");
		cv.put(KEY_Sound, "balon_udara");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 39);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Air");
		cv.put(KEY_English, "Apollo Plane");
		cv.put(KEY_Indonesia, "Pesawat Apollo");
		cv.put(KEY_Image, "pesawat_apollo");
		cv.put(KEY_Sound, "pesawat_apollo");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 40);
		cv.put(KEY_Jenis, "Transportasi");
		cv.put(KEY_Kategori, "Air");
		cv.put(KEY_English, "Jet");
		cv.put(KEY_Indonesia, "Pesawat Jet");
		cv.put(KEY_Image, "pesawat_jet");
		cv.put(KEY_Sound, "pesawat_jet");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 41);
		cv.put(KEY_Jenis, "Color");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Red");
		cv.put(KEY_Indonesia, "Merah");
		cv.put(KEY_Image, "merah");
		cv.put(KEY_Sound, "merah");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 42);
		cv.put(KEY_Jenis, "Color");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Green");
		cv.put(KEY_Indonesia, "Hijau");
		cv.put(KEY_Image, "hijau");
		cv.put(KEY_Sound, "hijau");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 43);
		cv.put(KEY_Jenis, "Color");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Blue");
		cv.put(KEY_Indonesia, "Biru");
		cv.put(KEY_Image, "biru");
		cv.put(KEY_Sound, "biru");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 44);
		cv.put(KEY_Jenis, "Color");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Yellow");
		cv.put(KEY_Indonesia, "Kuning");
		cv.put(KEY_Image, "kuning");
		cv.put(KEY_Sound, "kuning");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 45);
		cv.put(KEY_Jenis, "Color");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Black");
		cv.put(KEY_Indonesia, "Hitam");
		cv.put(KEY_Image, "hitam");
		cv.put(KEY_Sound, "hitam");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 46);
		cv.put(KEY_Jenis, "Number");
		cv.put(KEY_Kategori, ""); 
		cv.put(KEY_English, "One");
		cv.put(KEY_Indonesia, "Satu");
		cv.put(KEY_Image, "satu");
		cv.put(KEY_Sound, "satu");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 47);
		cv.put(KEY_Jenis, "Number");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Two");
		cv.put(KEY_Indonesia, "Dua");
		cv.put(KEY_Image, "dua");
		cv.put(KEY_Sound, "dua");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 48);
		cv.put(KEY_Jenis, "Number");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Three");
		cv.put(KEY_Indonesia, "Tiga");
		cv.put(KEY_Image, "tiga");
		cv.put(KEY_Sound, "tiga");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 49);
		cv.put(KEY_Jenis, "Number");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Four");
		cv.put(KEY_Indonesia, "Empat");
		cv.put(KEY_Image, "empat");
		cv.put(KEY_Sound, "empat");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 49);
		cv.put(KEY_Jenis, "Number");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Four");
		cv.put(KEY_Indonesia, "Empat");
		cv.put(KEY_Image, "empat");
		cv.put(KEY_Sound, "empat");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 50);
		cv.put(KEY_Jenis, "Number");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Five");
		cv.put(KEY_Indonesia, "Lima");
		cv.put(KEY_Image, "lima");
		cv.put(KEY_Sound, "lima");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 51);
		cv.put(KEY_Jenis, "Number");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Six");
		cv.put(KEY_Indonesia, "Enam");
		cv.put(KEY_Image, "enam");
		cv.put(KEY_Sound, "enam");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 52);
		cv.put(KEY_Jenis, "Number");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Seven");
		cv.put(KEY_Indonesia, "Tujuh");
		cv.put(KEY_Image, "tujuh");
		cv.put(KEY_Sound, "tujuh");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 53);
		cv.put(KEY_Jenis, "Number");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Eight");
		cv.put(KEY_Indonesia, "Delapan");
		cv.put(KEY_Image, "delapan");
		cv.put(KEY_Sound, "delapan");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 54);
		cv.put(KEY_Jenis, "Number");
		cv.put(KEY_Kategori, "");
		cv.put(KEY_English, "Nine");
		cv.put(KEY_Indonesia, "Sembilan");
		cv.put(KEY_Image, "sembilan");
		cv.put(KEY_Sound, "sembilan");
		db.insert(CONTACT_NAME, KEY_ID, cv);

		cv.put(KEY_ID, 55);
		cv.put(KEY_Jenis, "FoodDrink");
		cv.put(KEY_Kategori, "Drink");
		cv.put(KEY_English, "Juice");
		cv.put(KEY_Indonesia, "Jus");
		cv.put(KEY_Image, "jus_jeruk");
		cv.put(KEY_Sound, "jus");
		db.insert(CONTACT_NAME, KEY_ID, cv);
		
		cv.put(KEY_ID, 56);
		cv.put(KEY_Jenis, "FoodDrink");
		cv.put(KEY_Kategori, "Drink");
		cv.put(KEY_English, "Juice");
		cv.put(KEY_Indonesia, "Jus");
		cv.put(KEY_Image, "jus");
		cv.put(KEY_Sound, "jus");
		db.insert(CONTACT_NAME, KEY_ID, cv);
	}
	
	public ArrayList<Dictionary> toArray() {
		return this.toArray("","");
	}

	public ArrayList<Dictionary> toArray(String filterText, String filterText2) {
		Cursor cursor = null;
		ArrayList<Dictionary> allContact = null;
		
		String filterQuery = "";
		if( !filterText2.equalsIgnoreCase("") ) {
			filterQuery = " WHERE Kategori = '" + filterText + "' AND Jenis = '" + filterText2 + "'";
		}

		try {
			allContact = new ArrayList<Dictionary>();

			cursor = database.rawQuery("SELECT * FROM " + CONTACT_NAME + filterQuery, null);
			if (cursor.getCount() > 0) {
				int indexId   	   = cursor.getColumnIndex("Id");
				int indexJenis     = cursor.getColumnIndex("Jenis");
				int indexKategori  = cursor.getColumnIndex("Kategori");
				int indexEnglish   = cursor.getColumnIndex("English");
				int indexIndonesia = cursor.getColumnIndex("Indonesia");
				int indexImage     = cursor.getColumnIndex("Image");
				int indexSound     = cursor.getColumnIndex("Sound");
				cursor.moveToFirst();
				do {
					String Sound     = cursor.getString(indexSound);
					String Image     = cursor.getString(indexImage);
					String Indonesia = cursor.getString(indexIndonesia);
					String English   = cursor.getString(indexEnglish);
					String Kategori  = cursor.getString(indexKategori);
					String Jenis 	 = cursor.getString(indexJenis);
					String Id 		 = cursor.getString(indexId);

					Dictionary contact = new Dictionary();
					contact.setSound(Sound);
					contact.setImage(Image);
					contact.setIndonesia(Indonesia);
					contact.setEnglish(English);
					contact.setKategori(Kategori);
					contact.setJenis(Jenis);
					contact.setId(Id);

					allContact.add(contact);

					cursor.moveToNext();
				} while (!cursor.isAfterLast());
			}
		} finally {
			if (cursor != null) {
				cursor.close();
			}
		}
		return allContact;
	}
		
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
	}
}