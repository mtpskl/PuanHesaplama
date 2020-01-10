public class odev_puanlari_hesaplama {

	public static int puan(int say, int tr, int sos) {
		return say * 3 + tr * 2 + sos * 1;
	}

	public static void main(String[] args) {

		String SayisalCA = "ACBEEDBCAEECDBBAEBCDEBEDBACCAB";
		String SozelCA = "ABCECBACEBCEDBACDBECADECCCBEDA";

		String AliTuzcuSaC = "ACBE DBCA ECDBBAEBEDCBEDBACCAB";
		String AliTuzcuSoC = "AABCCBACEBCEDDACDBECEEEC CBEDA";
		int AliTuzcuDSSay = 0;
		int AliTuzcuDST = 0;
		int AliTuzcuDSSos = 0;

		String VeliYazSaC = "ADBEEDBCAEEC BBAEBCDEBEDBACDAB";
		String VeliYazSoC = "ABDDCBACEBCED ACDBECADECCCCCDA";
		int VeliYazDSSay = 0;
		int VeliYazDST = 0;
		int VeliYazDSSos = 0;

		System.out.println("Ali Tuzcu: ");
		for (int i = 0; i < 30; i++) {
			if (AliTuzcuSaC.charAt(i) == SayisalCA.charAt(i)) {
				AliTuzcuDSSay++;
			}
		}
		System.out.println("Sayisal dogru sayisi: " + AliTuzcuDSSay);

		for (int i = 0; i < 20; i++) {
			if (AliTuzcuSoC.charAt(i) == SozelCA.charAt(i)) {
				AliTuzcuDST++;
			}
		}
		System.out.println("Turkce dogru sayisi: " + AliTuzcuDST);

		for (int i = 20; i < 30; i++) {
			if (AliTuzcuSoC.charAt(i) == SozelCA.charAt(i)) {
				AliTuzcuDSSos++;
			}
		}
		System.out.println("Sosyal dogru sayisi: " + AliTuzcuDSSos);

		int AliTuzcuSayPuan = puan(AliTuzcuDSSay, AliTuzcuDST, AliTuzcuDSSos);
		System.out.println("Puani: " + AliTuzcuSayPuan);
		System.out.println(" ");

		System.out.println("Veli Yaz: ");
		for (int i = 0; i < 30; i++) {
			if (VeliYazSaC.charAt(i) == SayisalCA.charAt(i)) {
				VeliYazDSSay++;
			}
		}
		System.out.println("Sayisal dogru sayisi: " + VeliYazDSSay);

		for (int i = 0; i < 20; i++) {
			if (VeliYazSoC.charAt(i) == SozelCA.charAt(i)) {
				VeliYazDST++;
			}
		}
		System.out.println("Turkce dogru sayisi: " + VeliYazDST);

		for (int i = 20; i < 30; i++) {
			if (VeliYazSoC.charAt(i) == SozelCA.charAt(i)) {
				VeliYazDSSos++;
			}
		}
		System.out.println("Sosyal dogru sayisi: " + VeliYazDSSos);

		int VeliYazSayPuan = puan(VeliYazDSSay, VeliYazDST, VeliYazDSSos);
		System.out.println("Puani: " + VeliYazSayPuan);
	}
}

