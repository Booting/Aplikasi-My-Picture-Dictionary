package com.mypicturedictionary.model;

public class Dictionary {
	private String Id   	 = "";
	private String Jenis     = "";
	private String Kategori  = "";
	private String English   = "";
	private String Indonesia = "";
	private String Image 	 = "";
	private String Sound 	 = "";

	/**
	 * 
	 * @param Id
	 */
	public void setId(String Id) {
		this.Id = Id;
	}

	public String getId() {
		return Id;
	}
	
	/**
	 * 
	 * @param Jenis
	 */
	public void setJenis(String Jenis) {
		this.Jenis = Jenis;
	}

	public String getJenis() {
		return Jenis;
	}

	/**
	 * 
	 * @param Kategori
	 */
	public void setKategori(String Kategori) {
		this.Kategori = Kategori;
	}

	public String getKategori() {
		return Kategori;
	}

	/**
	 * 
	 * @param English
	 */
	public void setEnglish(String English) {
		this.English = English;
	}

	public String getEnglish() {
		return English;
	}
	
	/**
	 * 
	 * @param Indonesia
	 */
	public void setIndonesia(String Indonesia) {
		this.Indonesia = Indonesia;
	}

	public String getIndonesia() {
		return Indonesia;
	}

	/**
	 * 
	 * @param Image
	 */
	public void setImage(String Image) {
		this.Image = Image;
	}

	public String getImage() {
		return Image;
	}
	
	/**
	 * 
	 * @param Sound
	 */
	public void setSound(String Sound) {
		this.Sound = Sound;
	}

	public String getSound() {
		return Sound;
	}
	
	@Override
	public String toString() {
		return "Id: " + getId() + 
			   "; Kategori: " + getKategori() +
			   "; English: " + getEnglish() +
			   "; Indonesia: " + getIndonesia() +
			   "; Image: " + getImage() +
			   "; Sound: " + getSound();
	}
}