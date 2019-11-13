package deneme;

public class OyunTest {
	
	
	public static void main(String[] args) {
		ZAR zar = new ZAR();
		int z1 = zar.zarAt();
		int z2 = zar.zarAt();
		int t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0, t7 = 0, t8 = 0, t9 = 0, t10 = 0, t11 = 0;
		
		if(z1 == z2 && (z1 % 2) == 0 && (z2 % 2) == 0) {
			System.out.printf("Gelen Sayilar = "+ z1 + z2, "Oyun Sonlandirildi.");
		}
		
		while(z1 != z2 || (z1 % 2) == 0 || (z2 % 2) == 0) {
			z1 = zar.zarAt();
			z2 = zar.zarAt();
			if(z1 == z2 && (z1 % 2) == 0 && (z2 % 2) == 0) {
				System.out.printf("Gelen Sayilar = "+ z1+ "-" + z2+ "\tOyun Sonlandirildi.");
				break;
			}
			else {
				switch(z1 + z2) {
				case 2: t2++;break;
				case 3: t3++;break;
				case 4: t4++;break;
				case 5: t5++;break;
				case 6:	t6++;break;
				case 7: t7++;break;
				case 8:	t8++;break;
				case 9:	t9++;break;
				case 10:	t10++;break;
				case 11:	t11++;break;
				}
				System.out.println("\nSayilar = "+z1+"-"+z2+"\tToplam = "+ (z1+z2));
			}
		}
		System.out.println("\nToplamin 2 gelme sayisi = "+t2+"\nToplamin 3 gelme sayisi = "+t3+"\nToplamin 4 gelme sayisi = "+t4+"\nToplamin 5 gelme sayisi = "+t5 +"\nToplamin 6 gelme sayisi = "+ t6 +"\nToplamin 7 gelme sayisi = "+t7 +"\nToplamin 8 gelme sayisi = "+t8 +"\nToplamin 9 gelme sayisi = "+t9 +"\nToplamin 10 gelme sayisi = "+t10 +"\nToplamin 11 gelme sayisi = "+t11);
	}
}
