package sayiBulma;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,5,7,9};
		int aranacak = 3;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		
		if (varMi) {
			System.out.println("Aranan sayı bulundu.");
		}
		else {
			System.out.println("Aranan sayı bulunamadı.");
		}
	}

}
