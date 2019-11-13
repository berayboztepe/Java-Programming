package deneme;

public class OyunTest {
	
	
	public static void main(String[] args) {
		ZAR zar = new ZAR();
		int z1 = zar.zarAt();
		int z2 = zar.zarAt();
		int [] dizi = new int [12];
		
		for(int i = 0; i<12; i++) {
			dizi[i] = 0;
		}
		
		
		if(z1 == z2 && (z1 % 2) == 0 && (z2 % 2) == 0) {
			System.out.printf("Gelen Sayilar = "+ z1 + z2, "Oyun Sonlandirildi.");
		}
		
		while(z1 != z2 || (z1 % 2) != 0 || (z2 % 2) != 0) {
			int i = 0;
			z1 = zar.zarAt();
			z2 = zar.zarAt();
			if(z1 == z2 && (z1 % 2) == 0 && (z2 % 2) == 0) {
				System.out.printf("Gelen Sayilar = "+ z1+ "-" + z2+ "\tOyun Sonlandirildi.");
				break;
			}
			i = z1+z2;
			System.out.println("\nToplam = "+i+"\tSayilar = "+z1+"-"+z2);
			dizi[i]++;
		}
		for(int i = 2; i<12; i++) {
			System.out.printf("\nToplami %d olan %d tane cikti..", i, dizi[i]);
		}
		}
	
	
}
