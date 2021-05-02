package umn.ac.id_30706;

import umn.ac.id_30706.MediaPromosi;

public class Aktor extends MediaPromosi {
	private int umur;
	private int tinggiBadan;
	private int beratBadan;
	private int fans;
	private String id;
	private String fansClub;
	public Aktor() {}
	
	public Aktor(String id, String name, int umur, int tinggiBadan, int beratBadan, int fans, String fansClub) {
		this.id = id;
		this.name = name;
		this.umur = umur;
		this.tinggiBadan = tinggiBadan;
		this.beratBadan = beratBadan;
		this.fans = fans;
		this.fansClub = fansClub;	
	}
	
	public int getUmur() {
		return umur;
	}
	
	public int getTinggiBadan() {
		return tinggiBadan;
	}
	
	public int getBeratBadan() {
		return beratBadan;
	}
	
	public int getFans() {
		return fans;
	}
	
	public String getFansClub() {
		return fansClub;
	}
	
	public String getID() {
		return id;
	}
}
