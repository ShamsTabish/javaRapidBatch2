import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Plase enter the Age");
		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("Great! \n You are elligible for voting ..");
			System.out.println("Happy Voting");
		}else{
			System.out.println("Sorry, you won't be able to vote..");
		}
		
		
		System.out.println("Thank you for using this system..");

	}
}
