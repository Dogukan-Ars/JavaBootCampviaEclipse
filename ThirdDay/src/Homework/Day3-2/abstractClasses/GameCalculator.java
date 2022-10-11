package abstractClasses;

public abstract class GameCalculator { // Abstract yaptığımız zaman kim implement ederse etsin hesapla metodunu
										// kullanır ancak zorunlu olarak kendi hesaplasını yazması gerekmekte...
	public abstract void hesapla();

	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
