package youTubeDemo;

public class CarCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Car credit calculated");		
	}
}
