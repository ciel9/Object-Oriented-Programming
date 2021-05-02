package umn.ac.id_30706;

import umn.ac.id_30706.MediaPromosi;

public class Order {
	private MediaPromosi mediaPromosi;
	private String bidang;
	private String tanggal;
	private int jangkaWaktu;
	public Order() {}
	public Order(MediaPromosi mediaPromosi, String bidang, String tanggal, int jangkaWaktu) {
		this.mediaPromosi = mediaPromosi;
		this.bidang = bidang;
		this.tanggal = tanggal;
		this.jangkaWaktu = jangkaWaktu;
	}
	
	public MediaPromosi getMediaPromosi() {
		return mediaPromosi;
	}
	
	public String getBidang() {
		return bidang;
	}
	
	public String getTanggal() {
		return tanggal;
	}
	
	public int getJangkaWaktu() {
		return jangkaWaktu;
	}
	
	public void closeOrder(String name) {
		this.mediaPromosi.setNama(name + " " + "DIBATALKAN");
	}

}
