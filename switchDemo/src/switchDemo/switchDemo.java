package switchDemo;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'F';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz!");
			break;
		case 'B':
			System.out.println("İyi : Geçtiniz!");
			break;
		case 'C':
			System.out.println("Ortalama : Geçtiniz!");
			break;
		case 'D':
			System.out.println("Fena değil : Geçtiniz!");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız!");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");			
		}

	}

}
