
public class ClassObjectDemo {
	public static void main(String[] args) {
		
		int localVariable;
//		System.out.println(localVariable);
		
		Account sudarshansAccount = new Account(1, 20000);
//		sudarshansAccount.balance+=30000000;
//		sudarshansAccount.balance-=30000;
		
		System.out.println(sudarshansAccount);
		
		
		Account satyamsAccount=new Account(2, 100000);
		satyamsAccount.withdraw(50000);
		System.out.println(satyamsAccount);
		
		
		Account kamalsAccount=new Account(3, 30000);
		System.out.println(kamalsAccount);
		
//		System.out.println(Account.bankBalance);
	}
}

class Account {
	private int balance;
	private int accountNumber;

	private static int bankBalance;
	
	public Account(int accountNumber, int amount) {
		int balance;
		this.balance = amount;
		this.accountNumber = accountNumber;
		bankBalance+=amount;
	}
	
	public int withdraw(int amount){
		bankBalance-=amount;
		
		return balance-=amount;
	}

	@Override
	public String toString() {
		return "==> Account [AccountNumber: "+accountNumber+"\tbalance=" + balance + "]  Bank's Balance = "+bankBalance;
	}
}