package yolBilgisayari;

public class Araba {

	

	public final static String arabaOzellik = "MERCEDES";
	private final double maxHiz = 160;
	private final double maxDepo = 100;
	private double depo = 0;
	private double harcananYakitMiktari = 0;
	private double genelKM = 0;
	private double yerelKM = 0;
	private double ortHiz = 0;
	private double surulmeZamani = 0;

	public Araba() {

	}

	/**
	 * Getter ve Setter
	 */

	public double getMaxDepo() {
		return maxDepo;
	}

	public double getMaxHiz() {
		return maxHiz;
	}

	public double getDepo() {
		return depo;
	}

	public double getGenelKM() {
		return genelKM;
	}

	public double getYerelKM() {
		return yerelKM;
	}

	public double getOrtHiz() {
		return ortHiz;
	}

	/**
	 * Methodlar
	 */

	public boolean yakitAl(double lt) {
		if (lt <= maxDepo && lt > 0 && lt <= (maxDepo - depo)) {
			depo += lt;

			return true;
		}

		return false;
	}

	public boolean arabayiSur(double hiz, double km) {
		if (depo > 0) {
			if (hiz > 0 && km > 0) {
				double bznMiktar = harcanacakYakitMiktariHesapla(hiz, km);
				if (bznMiktar > 0 && bznMiktar < depo) {
					yerelKM += km;
					genelKM += yerelKM;
					surulmeZamani += km / hiz;
					ortHizHesapla();

					depo -= bznMiktar;
					harcananYakitMiktari += bznMiktar;

					return true;
				}
			}
		}

		return false;
	}

	private void ortHizHesapla() {
		ortHiz = yerelKM / surulmeZamani;
	}

	private double harcanacakYakitMiktariHesapla(double hiz, double km) {
		double miktar = 0;

		if (hiz > 0 && hiz <= 50) {
			miktar = (km * 15) / 100;
		} else if (hiz > 50 && hiz <= 75) {
			miktar = (km * 9) / 100;
		} else if (hiz > 75 && hiz <= 110) {
			miktar = (km * 6) / 100;
		} else if (hiz > 110) {
			miktar = (km * 12) / 100;
		} else {
			miktar = 0;
		}

		return miktar;
	}

	/**
	 * Yol Bilgisayari
	 */

	public void yerelKmSifirla() {
		yerelKM = 0;
	}

	public double genelKmGoster() {
		return genelKM;
	}

	public double yerelKmGoster() {
		return yerelKM;
	}

	public double ortHizGoster() {
		return ortHiz;
	}

	public double ortYakitTuketimiGoster() {
		return (100 * harcananYakitMiktari) / yerelKM;
	}

	public double kalanYakitMiktariGoster() {
		return depo;
	}

	public double kalanMenzilGoster() {
		return (100 * depo) / harcanacakYakitMiktariHesapla(ortHiz, 100);
	}
}