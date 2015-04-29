package yolBilgisayari;

public class Menu {
	
	
	
	public void acilisMenusu(){
		
		System.out.println("------------------------");
		System.out.println("***** HOÞ GELDÝNÝZ *****");
		System.out.println("------------------------");
		System.out.println("******* " + Araba.arabaOzellik + " *******");
	}
	
	public void programMenusu(){
		
		System.out.println("------------------------");
		System.out.println("1 - Ýþlemler");
		System.out.println("2 - Yol Bilgisayarý");
		System.out.println("3 - Çýkýþ");
		System.out.println("------------------------");
	}
	
	public void islemlerMenusu(){
		
		System.out.println("------------------------");
		System.out.println("1 - Aracý sür");
		System.out.println("2 - Benzin al");
		System.out.println("3 - Yerel kilometre bilgisi(Trip) sýfýrla");
		System.out.println("4 - Ana menüye dön");
		System.out.println("------------------------");
	}
	
	public void yolBilgisayariMenusu(){
		
		System.out.println("------------------------");
		System.out.println("1 - Genel kilometre göster");
		System.out.println("2 - Yerel Kilometre (Trip) göster");
		System.out.println("3 - Ortalama hýz");
		System.out.println("4 - Ortalama yakýt tüketimi");
		System.out.println("5 - Depodaki Yakýt");
		System.out.println("6 - Menzil");
		System.out.println("7 - Ana Menüye Dön");
		System.out.println("------------------------");
	}
}
