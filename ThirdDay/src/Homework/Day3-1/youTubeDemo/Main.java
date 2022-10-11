package youTubeDemo;

public class Main {

	public static void main(String[] args) {
		// IoC container SEARCH*****
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
		
		
		/* Sonar qube SEARCH*****
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();
		Customer customer = new Customer();		
		customer.id = 1;		
		customer.city = "Ankara";

		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save();
		customerManager.delete();

		Company company = new Company();
		company.taxNumber = "100000";
		company.companyName = "Arçelik";
		company.id = 100;
		
		CustomerManager customerManager2 = new CustomerManager(new Person());

		Person person = new Person();
		person.nationalIdentity = "12345678910";
		person.firstName = "Engin";
		person.lastName = "Demiroğ";
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company() */
	}

}
