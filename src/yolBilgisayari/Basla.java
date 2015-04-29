package yolBilgisayari;

import java.util.Scanner;

public class Basla {

	/**
	 
	 */

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Araba arb = new Araba();
		Menu menu = new Menu();
		int programMenusuSecim;
		int islemlerMenusuSecim;
		int yolbilgisiyarMenusuSecim;
		boolean flag = true;

		do {
			menu.acilisMenusu();
			menu.programMenusu();
			programMenusuSecim = scn.nextInt();

			switch (programMenusuSecim) {
			case 1: {
				boolean flag2 = true;
				do {
					menu.islemlerMenusu();
					islemlerMenusuSecim = scn.nextInt();
					switch (islemlerMenusuSecim) {
					case 1: {
						if (arb.getDepo() > 0) {
							System.out.println("------------------------");
							System.out
									.println("ARACIN HIZ M�KTARINI G�R�N�Z (Km/Sa): ");
							System.out.println("------------------------");
							double hiz = scn.nextDouble();
							System.out.println("------------------------");
							System.out
									.println("ARACIN G�DECE�� YOL M�KTARINI G�R�N�Z (Km): ");
							System.out.println("------------------------");
							double km = scn.nextDouble();
							System.out.println("------------------------");
							if (hiz > 0 && hiz <= arb.getMaxHiz() && km > 0) {
								if (!arb.arabayiSur(hiz, km)) {
									System.out
											.println("G�R�LEN DE�ERLER ���N YETERL� YAKITINIZ YOK! - L�TFEN TEKRAR DENEY�N�Z");
								} else {
									System.out
											.println("ARA� G�DECE�� YERE ULA�TI.");
								}
							} else {
								System.out
										.println("ARACIN MAX HIZ KAPAS�TES�N� A�TINIZ! - TEKRAR DENEY�N�Z");
							}
						} else {
							System.out.println("------------------------");
							System.out
									.println("DEPONUZDA YAKIT YOK! - LUTFEN YAKIT ALINIZ");
						}
						break;
					}
					case 2: {
						System.out.println("------------------------");
						System.out
								.println("YAKIT M�KTARINI G�R�N�Z (Max 100 Lt)");
						System.out.println("------------------------");
						double benzin = scn.nextDouble();
						System.out.println("------------------------");

						if (benzin > 0 && benzin <= arb.getMaxDepo()) {
							if (!arb.yakitAl(benzin)) {
								System.out
										.println("YAKIT M�KTARINI HATALI G�RD�N�Z! - L�TFEN TEKRAR DENEY�N�Z");
								System.out.println("------------------------");
								System.out
										.println("DEPONUZA BULUNAN BO� M�KTAR: "
												+ (arb.getMaxDepo() - arb
														.getDepo()) + " Lt");
							} else {
								if (arb.getDepo() == arb.getMaxDepo()) {
									System.out.println("DEPONUZA " + benzin
											+ " Lt" + " YAKIT ALDINIZ");
									System.out
											.println("------------------------");
									System.out.println("DEPONUZ TAM DOLU.");
								} else {
									System.out.println("DEPONUZA " + benzin
											+ " Lt" + " YAKIT ALDINIZ");
								}
							}
						} else {
							System.out
									.println("YAKIT M�KTARINI HATALI G�RD�N�Z! - L�TFEN TEKRAR DENEY�N�Z");
						}
						break;
					}
					case 3: {
						System.out.println("------------------------");
						arb.yerelKmSifirla();
						System.out.println("YEREL KM SIFIRLANDI.");
						break;
					}
					case 4: {
						flag2 = false;
						break;
					}

					default:
						System.out.println("------------------------");
						System.out
								.println("HATALI TU�LAMA YAPTINIZ! - TEKRAR DENEY�N�Z");
						break;
					}
				} while (flag2);

				break;
			}
			case 2: {
				boolean flag3 = true;

				do {
					menu.yolBilgisayariMenusu();
					yolbilgisiyarMenusuSecim = scn.nextInt();
					//System.out.println("------------------------");
					switch (yolbilgisiyarMenusuSecim) {
					case 1: {
						System.out.println("------------------------");
						System.out.println("GENEL KM B�LG�S�: "
								+ arb.genelKmGoster() + " Km");
						break;
					}
					case 2: {
						System.out.println("------------------------");
						System.out.println("YEREL KM B�LG�S�: "
								+ arb.yerelKmGoster() + " Km");
						break;
					}
					case 3: {
						System.out.println("------------------------");
						System.out.println("ORTALAMA HIZ B�LG�S�: "
								+ arb.ortHizGoster() + " Km/Sa");
						break;
					}
					case 4: {
						System.out.println("------------------------");
						System.out.println("ORTALAMA YAKIT T�KET�M�: "
								+ arb.ortYakitTuketimiGoster() + " Lt");
						break;
					}
					case 5: {
						System.out.println("------------------------");
						System.out.println("DEPODA KALAN YAKIT M�KTARI: "
								+ arb.kalanYakitMiktariGoster() + " Lt");
						break;
					}
					case 6: {
						System.out.println("------------------------");
						System.out.println("MENZ�L B�LG�S�: "
								+ arb.kalanMenzilGoster() + " Km");
						break;
					}
					case 7: {
						flag3 = false;
						break;
					}
					default:
						System.out.println("------------------------");
						System.out
						.println("HATALI TU�LAMA YAPTINIZ! - TEKRAR DENEY�N�Z");
						break;
					}
				} while (flag3);
				break;
			}
			case 3: {
				System.exit(0);
				break;
			}

			default:
				System.out.println("------------------------");
				System.out
				.println("HATALI TU�LAMA YAPTINIZ! - TEKRAR DENEY�N�Z");
				break;
			}
		} while (flag);

		scn.close();
	}
}