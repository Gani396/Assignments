package three;

public class Main {
	
	public static void main(String[] args) {
		bank b1 = new Savingaccount();
		BankImpl b = new BankImpl(b1);
		System.out.println("Method of Saving account");
		b.output();
		bank b2 = new CurrentAccount();
		BankImpl b3 = new BankImpl(b2);
		System.out.println("Method of Currentaccount");
		b3.output();
	}

}
