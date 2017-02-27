
public class OverridingDemo {
	public static void main(String[] args) {
		boolean isCreditCard=true;
		
		Account account;//=new Account();
		if(isCreditCard)
			account=new CreditCardAccount();
		else
			account=new Account();
		
		account.withdraw(1000);
		System.out.println(account.balance);
	}
}

/*final*/ class Account {
	int balance=5000;

	/*final*/ void withdraw(int amount) {
		balance -= amount;

		System.out.println("Acount Wothdraw");
	}
}

class CreditCardAccount extends Account {
	@Override
	void withdraw(int amount) {
//		super.withdraw(amount);
		balance -= amount;
		balance-=1000;
		balance -= amount * 0.20f;

	}
}