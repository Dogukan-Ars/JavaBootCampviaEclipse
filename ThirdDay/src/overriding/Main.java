package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] creditManagers = new BaseCreditManager[] {new TeacherCreditManager(), new TarımCreditManager(), new StudentCreditManager()};
		
		for (BaseCreditManager creditManager : creditManagers) {
			System.out.println(creditManager.hesapla(1000));
		}

	}

}
