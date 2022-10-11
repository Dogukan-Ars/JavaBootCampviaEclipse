package overriding; //Final metodu ile public final double hesapla yaparsak, diğer inherit edilmiş classlar bu metodu override edemez.

public class BaseCreditManager {
	public double hesapla(double tutar) {
		return tutar*1.18;
	}
}
