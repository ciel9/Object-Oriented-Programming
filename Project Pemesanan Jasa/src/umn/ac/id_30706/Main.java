package umn.ac.id_30706;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static ArrayList<Celebgram> celebgrams = new ArrayList<Celebgram>();
	static ArrayList<Aktor> aktors = new ArrayList<Aktor>();
	static ArrayList<Baliho> balihos = new ArrayList<Baliho>();
	static ArrayList<Majalah> majalahs = new ArrayList<Majalah>();
	static ArrayList<Order> orders = new ArrayList<Order>();
	
	public static void listData() {

			aktors.add(new Aktor("A1","Chris Evans", 30, 170, 60, 100000, "Captains America Lovers"));
			aktors.add(new Aktor("A2","Robert Downey JR", 31, 171, 61, 120000, "Ironman Lovers"));
			aktors.add(new Aktor("A3","Chris Hemsworth", 32, 172, 62, 140000, "Thor Lovers"));

			celebgrams.add(new Celebgram("C1","Awkarin", 25, 165, 45, 100000, "Instagram", "Furnitur"));
			celebgrams.add(new Celebgram("C2","Anya Geraldine", 26, 166, 46, 120000, "Twitter", "Makanan"));
			celebgrams.add(new Celebgram("C3","Devina Aurel", 27, 167, 47, 140000, "Youtube", "Tanaman"));

			balihos.add(new Baliho("B1","Baliho Jakarta Pusat", 6, "Jakarta Pusat"));
			balihos.add(new Baliho("B2","Baliho Jakarta Barat", 8, "Jakarta Barat"));
			balihos.add(new Baliho("B3","Baliho Jakarta Utara", 9, "Jakarta Utara"));

			majalahs.add(new Majalah("M1","Home Decor", 15, "Halaman 2", "Furnitur"));
			majalahs.add(new Majalah("M2","Sedap", 18, "Halaman 3", "Makanan"));
			majalahs.add(new Majalah("M3","Otomotif", 21, "Halaman 4", "Tanaman"));
	}
	
	public static void pilihanMenu() {
		System.out.println("==============================");
		System.out.println("  Wemen Marketing Agent  ");
		System.out.println("==============================");
		System.out.println("1. Penambahan Media");
		System.out.println("2. Penyewaan Media");
		System.out.println("3. Check Employement / Rental");
		System.out.println("4. Credits");
		System.out.println("5. Exit");
		System.out.println("==============================");
		System.out.print("Pilih Menu (1-5) : ");
	}
	
	public static void addNewMenuMedia() {
		System.out.println("==============================");
		System.out.println("  Wemen Marketing Agent  ");
		System.out.println("==============================");
		System.out.println("1. Celebgram");
		System.out.println("2. Majalah");
		System.out.println("==============================");
		System.out.print("Pilih Media (1-2) : ");
	}
	
	public static void jenisKategori() {
		System.out.println("==============================");
		System.out.println("  Wemen Marketing Agent  ");
		System.out.println("==============================");
		System.out.println("1. Furnitur");
		System.out.println("2. Makanan");
		System.out.println("3. Tanaman");
		System.out.println("4. Otomotif");
		System.out.println("5. Musik");
		System.out.println("==============================");
		System.out.print("Pilih Kategori (1-5) : ");
	}

	public static void Credits() {
			System.out.println("==============================");
			System.out.println("  Wemen Marketing Agent  ");
			System.out.println("==============================");
			System.out.println("Nama : Yohana Cindy Elsanjaya ");
			System.out.println("NIM  : 00000030706");
	}

	public static void listOrderMedia() {
		System.out.println("==============================");
		System.out.println("  Wemen Marketing Agent  ");
		System.out.println("==============================");
		System.out.println("1. Aktor");
		System.out.println("2. Celebgram");
		System.out.println("3. Majalah");
		System.out.println("4. Baliho");
		System.out.println("==============================");
		System.out.print("Pilih Media (1-4) : ");
	}

	public static void tampilkanBaliho() {
		for(Baliho item: balihos) {
			System.out.println("No    : " + item.getID());
			System.out.println("Nama  : " + item.getNama());
			System.out.println("Luas  : " + item.getLuas());
			System.out.println("Letak : " + item.getLetak());
			System.out.println("Harga : " + item.getLuas()*3000000);
			System.out.println("==============================");
		}
	}
	
	public static void tampilkanMajalah() {
		for(Majalah item: majalahs) {
			System.out.println("No     : " + item.getID());
			System.out.println("Nama   : " + item.getNama());
			System.out.println("Luas   : " + item.getLuas());
			System.out.println("Letak  : " + item.getLetak());
			System.out.println("Bidang : " + item.getBidang());
			System.out.println("Harga  : " + item.getLuas()*50000);
			System.out.println("==============================");
		}
	}
	
	public static void tampilkanAktor() {
		for(Aktor item: aktors) {
			System.out.println("No            : " + item.getID());
			System.out.println("Nama          : " + item.getNama());
			System.out.println("Umur          : " + item.getUmur());
			System.out.println("Tinggi Badan  : " + item.getTinggiBadan());
			System.out.println("Berat Badan   : " + item.getBeratBadan());
			System.out.println("Fans          : " + item.getFans());
			System.out.println("Fans Club     : " + item.getFansClub());
			System.out.println("Harga         : " + item.getFans() * 2000);
			System.out.println("==============================");
		}
	}
	
	public static void tampilkanCelebgram() {
		for(Celebgram item: celebgrams) {
			System.out.println("No            : " + item.getID());
			System.out.println("Nama          : " + item.getNama());
			System.out.println("Umur          : " + item.getUmur());
			System.out.println("Tinggi Badan  : " + item.getTinggiBadan());
			System.out.println("Berat Badan   : " + item.getBeratBadan());
			System.out.println("Followers     : " + item.getFollowers());
			System.out.println("Social Media  : " + item.getAkunMedia());
			System.out.println("Bidang        : " + item.getBidang());
			System.out.println("Harga         : " + item.getFollowers() * 1000);
			System.out.println("==============================");
		}
	}

	public static void sewaMedia() {
		Scanner s = new Scanner(System.in);
		int opsiKategori, jangkawaktu, opsiOrderMedia, uang;
		String tanggal, mediaId;
		jenisKategori();
		opsiKategori = s.nextInt();
		switch(opsiKategori) {
		case 1:
			s.nextLine();
			System.out.print("Tanggal Mulai (DDMMYYYY) : ");
			tanggal = s.nextLine();
			System.out.print("Banyak Hari Penyewaan    : ");
			jangkawaktu = s.nextInt();
			listOrderMedia();
			opsiOrderMedia = s.nextInt();
			if(opsiOrderMedia == 1) {
				tampilkanAktor();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Aktor item: aktors) {
					Aktor dataAktor = (Aktor) item;
					if(mediaId.equals(item.getID())) {
						System.out.println("Harga Sewa  : " + ((dataAktor.getFans()*2000)*jangkawaktu));
						System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
						uang = s.nextInt();
						if(uang != ((dataAktor.getFans()*2000)*jangkawaktu) || uang < ((dataAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
						}else if(uang == ((dataAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(dataAktor.getNama(), ((dataAktor.getFans()*2000)*jangkawaktu)), "Aktor", tanggal, jangkawaktu));
						}
						break;
					}
				}
			}else if(opsiOrderMedia == 2) {
				tampilkanCelebgram();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Celebgram item: celebgrams) {
					Celebgram dataCeleb = (Celebgram) item;
					if(mediaId.equals(dataCeleb.getID())) {
						if(dataCeleb.getBidang().equals("Furnitur")) {
							System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)) || uang < (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataCeleb.getNama(), (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))), "Celebgram", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga Sewa : " + ((dataCeleb.getFollowers()*1000)*jangkawaktu));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != (((dataCeleb.getFollowers()*1000)*jangkawaktu)) || uang < (((dataCeleb.getFollowers()*1000)*jangkawaktu))) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == ((dataCeleb.getFollowers()*1000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataCeleb.getNama(), ((dataCeleb.getFollowers()*1000)*jangkawaktu)), "Celebgram", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(opsiOrderMedia == 3) {
				tampilkanMajalah();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Majalah item: majalahs) {
					Majalah dataMajalah = (Majalah) item;
					if(mediaId.equals(dataMajalah.getID())) {
						if(dataMajalah.getBidang().equals("Furnitur")) {
							System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)) || uang < (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataMajalah.getNama(), (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))), "Majalah", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + ((dataMajalah.getLuas()*50000)*jangkawaktu));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != ((dataMajalah.getLuas()*50000)*jangkawaktu) || uang < ((dataMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == ((dataMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataMajalah.getNama(), ((dataMajalah.getLuas()*50000)*jangkawaktu)), "Majalah", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(opsiOrderMedia == 4) {
				tampilkanBaliho();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Baliho item: balihos) {
					Baliho dataBaliho = (Baliho) item;
					if(mediaId.equals(dataBaliho.getID())) {
						System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + ((dataBaliho.getLuas()*3000000)*jangkawaktu));
						System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
						uang = s.nextInt();
						if(uang != ((dataBaliho.getLuas()*3000000)*jangkawaktu) || uang < ((dataBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
						}else if(uang == ((dataBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(dataBaliho.getNama(), ((dataBaliho.getLuas()*3000000)*jangkawaktu)), "Baliho", tanggal, jangkawaktu));
						}
					break;
					}
				}
			}
			break;
		case 2:
			s.nextLine();
			System.out.print("Tanggal Mulai (DDMMYYYY) : ");
			tanggal = s.nextLine();
			System.out.print("Banyak Hari Penyewaan    : ");
			jangkawaktu = s.nextInt();
			listOrderMedia();
			opsiOrderMedia = s.nextInt();
			if(opsiOrderMedia == 1) {
				tampilkanAktor();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Aktor item: aktors) {
					Aktor dataAktor = (Aktor) item;
					if(mediaId.equals(item.getID())) {
						System.out.println("Harga Sewa  : " + ((dataAktor.getFans()*2000)*jangkawaktu));
						System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
						uang = s.nextInt();
						if(uang != ((dataAktor.getFans()*2000)*jangkawaktu) || uang < ((dataAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
						}else if(uang == ((dataAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(dataAktor.getNama(), ((dataAktor.getFans()*2000)*jangkawaktu)), "Aktor", tanggal, jangkawaktu));
						}
						break;
					}
				}
			}else if(opsiOrderMedia == 2) {
				tampilkanCelebgram();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Celebgram item: celebgrams) {
					Celebgram dataCeleb = (Celebgram) item;
					if(mediaId.equals(dataCeleb.getID())) {
						if(dataCeleb.getBidang().equals("Makanan")) {
							System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)) || uang < (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataCeleb.getNama(), (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))), "Celebgram", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga Sewa : " + ((dataCeleb.getFollowers()*1000)*jangkawaktu));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != (((dataCeleb.getFollowers()*1000)*jangkawaktu)) || uang < (((dataCeleb.getFollowers()*1000)*jangkawaktu))) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == ((dataCeleb.getFollowers()*1000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataCeleb.getNama(), ((dataCeleb.getFollowers()*1000)*jangkawaktu)), "Celebgram", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(opsiOrderMedia == 3) {
				tampilkanMajalah();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Majalah item: majalahs) {
					Majalah dataMajalah = (Majalah) item;
					if(mediaId.equals(dataMajalah.getID())) {
						if(dataMajalah.getBidang().equals("Makanan")) {
							System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)) || uang < (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataMajalah.getNama(), (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))), "Majalah", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + ((dataMajalah.getLuas()*50000)*jangkawaktu));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != ((dataMajalah.getLuas()*50000)*jangkawaktu) || uang < ((dataMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == ((dataMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataMajalah.getNama(), ((dataMajalah.getLuas()*50000)*jangkawaktu)), "Majalah", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(opsiOrderMedia == 4) {
				tampilkanBaliho();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Baliho item: balihos) {
					Baliho dataBaliho = (Baliho) item;
					if(mediaId.equals(dataBaliho.getID())) {
						System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + ((dataBaliho.getLuas()*3000000)*jangkawaktu));
						System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
						uang = s.nextInt();
						if(uang != ((dataBaliho.getLuas()*3000000)*jangkawaktu) || uang < ((dataBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
						}else if(uang == ((dataBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(dataBaliho.getNama(), ((dataBaliho.getLuas()*3000000)*jangkawaktu)), "Baliho", tanggal, jangkawaktu));
						}
					break;
					}
				}
			}
			break;
		case 3:
			s.nextLine();
			System.out.print("Tanggal Mulai (DDMMYYYY) : ");
			tanggal = s.nextLine();
			System.out.print("Banyak Hari Penyewaan    : ");
			jangkawaktu = s.nextInt();
			listOrderMedia();
			opsiOrderMedia = s.nextInt();
			if(opsiOrderMedia == 1) {
				tampilkanAktor();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Aktor item: aktors) {
					Aktor dataAktor = (Aktor) item;
					if(mediaId.equals(item.getID())) {
						System.out.println("Harga Sewa  : " + ((dataAktor.getFans()*2000)*jangkawaktu));
						System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
						uang = s.nextInt();
						if(uang != ((dataAktor.getFans()*2000)*jangkawaktu) || uang < ((dataAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
						}else if(uang == ((dataAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(dataAktor.getNama(), ((dataAktor.getFans()*2000)*jangkawaktu)), "Aktor", tanggal, jangkawaktu));
						}
						break;
					}
				}
			}else if(opsiOrderMedia == 2) {
				tampilkanCelebgram();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Celebgram item: celebgrams) {
					Celebgram dataCeleb = (Celebgram) item;
					if(mediaId.equals(dataCeleb.getID())) {
						if(dataCeleb.getBidang().equals("Tanaman")) {
							System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)) || uang < (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataCeleb.getNama(), (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))), "Celebgram", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga Sewa : " + ((dataCeleb.getFollowers()*1000)*jangkawaktu));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != (((dataCeleb.getFollowers()*1000)*jangkawaktu)) || uang < (((dataCeleb.getFollowers()*1000)*jangkawaktu))) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == ((dataCeleb.getFollowers()*1000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataCeleb.getNama(), ((dataCeleb.getFollowers()*1000)*jangkawaktu)), "Celebgram", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(opsiOrderMedia == 3) {
				tampilkanMajalah();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Majalah item: majalahs) {
					Majalah dataMajalah = (Majalah) item;
					if(mediaId.equals(dataMajalah.getID())) {
						if(dataMajalah.getBidang().equals("Tanaman")) {
							System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)) || uang < (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataMajalah.getNama(), (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))), "Majalah", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + ((dataMajalah.getLuas()*50000)*jangkawaktu));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != ((dataMajalah.getLuas()*50000)*jangkawaktu) || uang < ((dataMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == ((dataMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataMajalah.getNama(), ((dataMajalah.getLuas()*50000)*jangkawaktu)), "Majalah", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(opsiOrderMedia == 4) {
				tampilkanBaliho();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Baliho item: balihos) {
					Baliho dataBaliho = (Baliho) item;
					if(mediaId.equals(dataBaliho.getID())) {
						System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + ((dataBaliho.getLuas()*3000000)*jangkawaktu));
						System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
						uang = s.nextInt();
						if(uang != ((dataBaliho.getLuas()*3000000)*jangkawaktu) || uang < ((dataBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
						}else if(uang == ((dataBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(dataBaliho.getNama(), ((dataBaliho.getLuas()*3000000)*jangkawaktu)), "Baliho", tanggal, jangkawaktu));
						}
					break;
					}
				}
			}
			break;
		case 4:
			s.nextLine();
			System.out.print("Tanggal Mulai (DDMMYYYY) : ");
			tanggal = s.nextLine();
			System.out.print("Banyak Hari Penyewaan    : ");
			jangkawaktu = s.nextInt();
			listOrderMedia();
			opsiOrderMedia = s.nextInt();
			if(opsiOrderMedia == 1) {
				tampilkanAktor();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Aktor item: aktors) {
					Aktor dataAktor = (Aktor) item;
					if(mediaId.equals(item.getID())) {
						System.out.println("Harga Sewa  : " + ((dataAktor.getFans()*2000)*jangkawaktu));
						System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
						uang = s.nextInt();
						if(uang != ((dataAktor.getFans()*2000)*jangkawaktu) || uang < ((dataAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
						}else if(uang == ((dataAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(dataAktor.getNama(), ((dataAktor.getFans()*2000)*jangkawaktu)), "Aktor", tanggal, jangkawaktu));
						}
						break;
					}
				}
			}else if(opsiOrderMedia == 2) {
				tampilkanCelebgram();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Celebgram item: celebgrams) {
					Celebgram dataCeleb = (Celebgram) item;
					if(mediaId.equals(dataCeleb.getID())) {
						if(dataCeleb.getBidang().equals("Otomotif")) {
							System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)) || uang < (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataCeleb.getNama(), (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))), "Celebgram", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga Sewa : " + ((dataCeleb.getFollowers()*1000)*jangkawaktu));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != (((dataCeleb.getFollowers()*1000)*jangkawaktu)) || uang < (((dataCeleb.getFollowers()*1000)*jangkawaktu))) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == ((dataCeleb.getFollowers()*1000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataCeleb.getNama(), ((dataCeleb.getFollowers()*1000)*jangkawaktu)), "Celebgram", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(opsiOrderMedia == 3) {
				tampilkanMajalah();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Majalah item: majalahs) {
					Majalah dataMajalah = (Majalah) item;
					if(mediaId.equals(dataMajalah.getID())) {
						if(dataMajalah.getBidang().equals("Otomotif")) {
							System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)) || uang < (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataMajalah.getNama(), (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))), "Majalah", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + ((dataMajalah.getLuas()*50000)*jangkawaktu));
							System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
							uang = s.nextInt();
							if(uang != ((dataMajalah.getLuas()*50000)*jangkawaktu) || uang < ((dataMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
							}else if(uang == ((dataMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(dataMajalah.getNama(), ((dataMajalah.getLuas()*50000)*jangkawaktu)), "Majalah", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(opsiOrderMedia == 4) {
				tampilkanBaliho();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				mediaId = s.nextLine();
				for(Baliho item: balihos) {
					Baliho dataBaliho = (Baliho) item;
					if(mediaId.equals(dataBaliho.getID())) {
						System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + ((dataBaliho.getLuas()*3000000)*jangkawaktu));
						System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
						uang = s.nextInt();
						if(uang != ((dataBaliho.getLuas()*3000000)*jangkawaktu) || uang < ((dataBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
						}else if(uang == ((dataBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(dataBaliho.getNama(), ((dataBaliho.getLuas()*3000000)*jangkawaktu)), "Baliho", tanggal, jangkawaktu));
						}
					break;
					}
				}
			}
			break;
		case 5:
		s.nextLine();
		System.out.print("Tanggal Mulai (DDMMYYYY) : ");
		tanggal = s.nextLine();
		System.out.print("Banyak Hari Penyewaan    : ");
		jangkawaktu = s.nextInt();
		listOrderMedia();
		opsiOrderMedia = s.nextInt();
		if(opsiOrderMedia == 1) {
			tampilkanAktor();
			s.nextLine();
			System.out.print("Masukan ID Media : ");
			mediaId = s.nextLine();
			for(Aktor item: aktors) {
				Aktor dataAktor = (Aktor) item;
				if(mediaId.equals(item.getID())) {
					System.out.println("Harga Sewa  : " + ((dataAktor.getFans()*2000)*jangkawaktu));
					System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
					uang = s.nextInt();
					if(uang != ((dataAktor.getFans()*2000)*jangkawaktu) || uang < ((dataAktor.getFans()*2000)*jangkawaktu)) {
						System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
					}else if(uang == ((dataAktor.getFans()*2000)*jangkawaktu)) {
						System.out.println("Pemesanan Berhasil dipesan");
						orders.add(new Order(new MediaPromosi(dataAktor.getNama(), ((dataAktor.getFans()*2000)*jangkawaktu)), "Aktor", tanggal, jangkawaktu));
					}
					break;
				}
			}
		}else if(opsiOrderMedia == 2) {
			tampilkanCelebgram();
			s.nextLine();
			System.out.print("Masukan ID Media : ");
			mediaId = s.nextLine();
			for(Celebgram item: celebgrams) {
				Celebgram dataCeleb = (Celebgram) item;
				if(mediaId.equals(dataCeleb.getID())) {
					if(dataCeleb.getBidang().equals("Musik")) {
						System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)));
						System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
						uang = s.nextInt();
						if(uang != (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)) || uang < (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
							System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
						}else if(uang == (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(dataCeleb.getNama(), (((dataCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))), "Celebgram", tanggal, jangkawaktu));
						}
					}else {
						System.out.println("Harga Sewa : " + ((dataCeleb.getFollowers()*1000)*jangkawaktu));
						System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
						uang = s.nextInt();
						if(uang != (((dataCeleb.getFollowers()*1000)*jangkawaktu)) || uang < (((dataCeleb.getFollowers()*1000)*jangkawaktu))) {
							System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
						}else if(uang == ((dataCeleb.getFollowers()*1000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(dataCeleb.getNama(), ((dataCeleb.getFollowers()*1000)*jangkawaktu)), "Celebgram", tanggal, jangkawaktu));
						}
					}
					break;
				}
			}
		}else if(opsiOrderMedia == 3) {
			tampilkanMajalah();
			s.nextLine();
			System.out.print("Masukan ID Media : ");
			mediaId = s.nextLine();
			for(Majalah item: majalahs) {
				Majalah dataMajalah = (Majalah) item;
				if(mediaId.equals(dataMajalah.getID())) {
					if(dataMajalah.getBidang().equals("Musik")) {
						System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)));
						System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
						uang = s.nextInt();
						if(uang != (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)) || uang < (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
							System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
						}else if(uang == (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(dataMajalah.getNama(), (((dataMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))), "Majalah", tanggal, jangkawaktu));
						}
					}else {
						System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + ((dataMajalah.getLuas()*50000)*jangkawaktu));
						System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
						uang = s.nextInt();
						if(uang != ((dataMajalah.getLuas()*50000)*jangkawaktu) || uang < ((dataMajalah.getLuas()*50000)*jangkawaktu)) {
							System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
						}else if(uang == ((dataMajalah.getLuas()*50000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(dataMajalah.getNama(), ((dataMajalah.getLuas()*50000)*jangkawaktu)), "Majalah", tanggal, jangkawaktu));
						}
					}
					break;
				}
			}
		}else if(opsiOrderMedia == 4) {
			tampilkanBaliho();
			s.nextLine();
			System.out.print("Masukan ID Media : ");
			mediaId = s.nextLine();
			for(Baliho item: balihos) {
				Baliho dataBaliho = (Baliho) item;
				if(mediaId.equals(dataBaliho.getID())) {
					System.out.println("Jumlah Uang Sesuai Dengan Kategori yang Dipilih : " + ((dataBaliho.getLuas()*3000000)*jangkawaktu));
					System.out.print("Masukan Uang Sesuai dengan Harga Sewa : ");
					uang = s.nextInt();
					if(uang != ((dataBaliho.getLuas()*3000000)*jangkawaktu) || uang < ((dataBaliho.getLuas()*3000000)*jangkawaktu)) {
						System.out.println("Jumlah Uang yang Dimasukkan Tidak Sesuai dengan Total !");
					}else if(uang == ((dataBaliho.getLuas()*3000000)*jangkawaktu)) {
						System.out.println("Pemesanan Berhasil dipesan");
						orders.add(new Order(new MediaPromosi(dataBaliho.getNama(), ((dataBaliho.getLuas()*3000000)*jangkawaktu)), "Baliho", tanggal, jangkawaktu));
					}
				break;
				}
			}
		}
		break;
		}
	}

	public static void addMedia() {
			int opsiMedia, opsiKategori, umur, tinggibadan, beratbadan, followers, luas;
			String nama, akunmedia, letak, id;
			Scanner s = new Scanner(System.in);
			addNewMenuMedia();
			opsiMedia = s.nextInt();
			if(opsiMedia == 1) {
				jenisKategori();
				opsiKategori = s.nextInt();
				s.nextLine();
				if(opsiKategori == 1) {
					System.out.print("Masukan ID               : ");
					id = s.nextLine();
					System.out.print("Masukan Nama             : ");
					nama = s.nextLine();
					System.out.print("Masukan Umur             : ");
					umur = s.nextInt();
					System.out.print("Masukan Tinggi Badan     : ");
					tinggibadan = s.nextInt();
					System.out.print("Masukan Berat Badan      : ");
					beratbadan = s.nextInt();
					System.out.print("Masukan Jumlah Followers : ");
					followers = s.nextInt();
					System.out.print("Masukan Social Media     : ");
					akunmedia = s.next();
					s.nextLine();
					celebgrams.add(new Celebgram(id, nama, umur, tinggibadan, beratbadan, followers, akunmedia, "Furnitur"));
					System.out.println("Media Baru Telah ditambahkan");
				}else if(opsiKategori == 2) {
					System.out.print("Masukan ID               : ");
					id = s.nextLine();
					System.out.print("Masukan Nama             : ");
					nama = s.nextLine();
					System.out.print("Masukan Umur             : ");
					umur = s.nextInt();
					System.out.print("Masukan Tinggi Badan     : ");
					tinggibadan = s.nextInt();
					System.out.print("Masukan Berat Badan      : ");
					beratbadan = s.nextInt();
					System.out.print("Masukan Jumlah Followers : ");
					followers = s.nextInt();
					System.out.print("Masukan Social Media     : ");
					akunmedia = s.next();
					s.nextLine();
					celebgrams.add(new Celebgram(id, nama, umur, tinggibadan, beratbadan, followers, akunmedia, "Makanan"));
					System.out.println("Media Baru Telah ditambahkan");
				}else if(opsiKategori == 3) {
					System.out.print("Masukan ID               : ");
					id = s.nextLine();
					System.out.print("Masukan Nama             : ");
					nama = s.nextLine();
					System.out.print("Masukan Umur             : ");
					umur = s.nextInt();
					System.out.print("Masukan Tinggi Badan     : ");
					tinggibadan = s.nextInt();
					System.out.print("Masukan Berat Badan      : ");
					beratbadan = s.nextInt();
					System.out.print("Masukan Jumlah Followers : ");
					followers = s.nextInt();
					System.out.print("Masukan Social Media     : ");
					akunmedia = s.next();
					s.nextLine();
					celebgrams.add(new Celebgram(id, nama, umur, tinggibadan, beratbadan, followers, akunmedia, "Tanaman"));
					System.out.println("Media Baru Telah ditambahkan");
				}else if(opsiKategori == 4) {
					System.out.print("Masukan ID               : ");
					id = s.nextLine();
					System.out.print("Masukan Nama             : ");
					nama = s.nextLine();
					System.out.print("Masukan Umur             : ");
					umur = s.nextInt();
					System.out.print("Masukan Tinggi Badan     : ");
					tinggibadan = s.nextInt();
					System.out.print("Masukan Berat Badan      : ");
					beratbadan = s.nextInt();
					System.out.print("Masukan Jumlah Followers : ");
					followers = s.nextInt();
					System.out.print("Masukan Social Media     : ");
					akunmedia = s.next();
					s.nextLine();
					celebgrams.add(new Celebgram(id, nama, umur, tinggibadan, beratbadan, followers, akunmedia, "Otomotif"));
					System.out.println("Media Baru Telah ditambahkan");
				}else if(opsiKategori == 5){
					System.out.print("Masukan ID               : ");
					id = s.nextLine();
					System.out.print("Masukan Nama             : ");
					nama = s.nextLine();
					System.out.print("Masukan Umur             : ");
					umur = s.nextInt();
					System.out.print("Masukan Tinggi Badan     : ");
					tinggibadan = s.nextInt();
					System.out.print("Masukan Berat Badan      : ");
					beratbadan = s.nextInt();
					System.out.print("Masukan Jumlah Followers : ");
					followers = s.nextInt();
					System.out.print("Masukan Social Media     : ");
					akunmedia = s.next();
					s.nextLine();
					celebgrams.add(new Celebgram(id, nama, umur, tinggibadan, beratbadan, followers, akunmedia, "Musik"));
					System.out.println("Media Baru Telah ditambahkan");
				}
			}else if(opsiMedia == 2) {
				jenisKategori();
				opsiKategori = s.nextInt();
				s.nextLine();
				if(opsiKategori == 1) {
					System.out.print("Masukan ID               : ");
					id = s.nextLine();
					System.out.print("Masukan Nama             : ");
					nama = s.nextLine();
					System.out.print("Masukan Luas             : ");
					luas = s.nextInt();
					System.out.print("Masukan Letak Majalah    : ");
					s.nextLine();
					letak = s.nextLine();
					majalahs.add(new Majalah(id, nama, luas, letak, "Furnitur"));
					System.out.println("Media Baru Telah ditambahkan");
				}else if(opsiKategori == 2) {
					System.out.print("Masukan ID               : ");
					id = s.nextLine();
					System.out.print("Masukan Nama             : ");
					nama = s.nextLine();
					System.out.print("Masukan Luas             : ");
					luas = s.nextInt();
					System.out.print("Masukan Letak Majalah    : ");
					s.nextLine();
					letak = s.nextLine();
					majalahs.add(new Majalah(id, nama, luas, letak, "Makanan"));
					System.out.println("Media Baru Telah ditambahkan");
				}else if(opsiKategori == 3) {
					System.out.print("Masukan ID               : ");
					id = s.nextLine();
					System.out.print("Masukan Nama             : ");
					nama = s.nextLine();
					System.out.print("Masukan Luas             : ");
					luas = s.nextInt();
					System.out.print("Masukan Letak Majalah    : ");
					s.nextLine();
					letak = s.nextLine();
					majalahs.add(new Majalah(id, nama, luas, letak, "Tanaman"));
					System.out.println("Media Baru Telah ditambahkan");
				}else if(opsiKategori == 4) {
					System.out.print("Masukan ID               : ");
					id = s.nextLine();
					System.out.print("Masukan Nama             : ");
					nama = s.nextLine();
					System.out.print("Masukan Luas             : ");
					luas = s.nextInt();
					System.out.print("Masukan Letak Majalah    : ");
					s.nextLine();
					letak = s.nextLine();
					majalahs.add(new Majalah(id, nama, luas, letak, "Otomotif"));
					System.out.println("Media Baru Telah ditambahkan");
				}else if(opsiKategori == 5) {
					System.out.print("Masukan ID               : ");
					id = s.nextLine();
					System.out.print("Masukan Nama             : ");
					nama = s.nextLine();
					System.out.print("Masukan Luas             : ");
					luas = s.nextInt();
					System.out.print("Masukan Letak Majalah    : ");
					s.nextLine();
					letak = s.nextLine();
					majalahs.add(new Majalah(id, nama, luas, letak, "Musik"));
					System.out.println("Media Baru Telah ditambahkan");
				}
			}
		}
	

	public static void tampilkanOrder() {
		int no = 1;
		System.out.println("==============================");
		System.out.println("  Wemen Marketing Agent  ");
		System.out.println("==============================");
		for(Order dataOrder: orders) {
			System.out.println("No          : " + no);
			System.out.println("Media       : " + dataOrder.getBidang());
			System.out.println("Nama        : " + dataOrder.getMediaPromosi().getNama());
			System.out.println("Tanggal     : " + dataOrder.getTanggal());
			System.out.println("Durasi Sewa : " + dataOrder.getJangkaWaktu());
			System.out.println("Harga       : " + dataOrder.getMediaPromosi().getHarga());
			System.out.println("==============================");
			no++;
		}
	}

	public static void selesaikanOrder() {
			Scanner s = new Scanner(System.in);
			int pilihan;
			
			if(orders.isEmpty()) {
				System.out.println("Anda BELUM memesan media!");
				return;
			}
			
			tampilkanOrder();
			
			System.out.print("Pilih ID yang akan dibatalkan: ");
			pilihan = s.nextInt();
			pilihan = pilihan - 1;
			
			Order batalkan = orders.get(pilihan);
			
			if(batalkan.getMediaPromosi().getNama().contains("DIBATALKAN")) {
				System.out.println("Pesanan ini SUDAH DIBATALKAN!");
				return;
			}
			
			if(batalkan.getTanggal().equals("03062020")) {
				System.out.println("TIDAK BISA BATAL KARENA TANGGAL INI TANGGAL UJIAN");
				return;
			}
			
			batalkan.closeOrder(batalkan.getMediaPromosi().getNama());
			System.out.println("Pesanan Berhasil Dibatalkan !!");

		}
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int pilihan;
		listData();
		while(true) {
			pilihanMenu();
			pilihan = s.nextInt();
			switch(pilihan) {
			case 1:
				addMedia();
				break;
			case 2:
				sewaMedia();
				break;
			case 3:
				selesaikanOrder();
				break;
			case 4:
				Credits();
				break;
			case 5:
				System.exit(0);
				break;
			}
		}
	}

}
