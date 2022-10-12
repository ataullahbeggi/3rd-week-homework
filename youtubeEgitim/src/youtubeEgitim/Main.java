package youtubeEgitim;

public class Main {

	public static void main(String[] args) {
		/*CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();

		Customer customer = new Customer(); // instance creation
		customer.id = 1;
		customer.city = "Ankara";
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		
		Company company = new Company();
		company.taxNumber="100000";
		company.companyName="Arçelik";
		company.id=100;
		
		CustomerManager customerManager2 = new CustomerManager(new Person());
		
		Person person = new Person();
		person.nationalIdentity="";
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();*/
		
		
		//IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager.GiveCredit();

	}

}

//2.17.21
