package youTubeDemo;

public class ValueAndReferanceTypes {

	public static void main(String[] args) {
		
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {10,20,30};
		
		sayilar1 = sayilar2;
		
		sayilar2[0] = 1000;
		
		System.out.println(sayilar1[0]);
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 30;

		System.out.println(sayi1);
		
		

	}

}
