import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		Scanner dayReader = new Scanner(System.in);
		String day = dayReader.nextLine();

		switch (day) {
		case "Monday":
			System.out.println("I'll Study Java");
			
		case "Tuesday":
			System.out.println("I'll Study Android");
			
			break;
		case "Wedday":
			System.out.println("I'll Study BigData");
			

		default:
			System.out.println("I'll Take Rest... :) .");

		}
		System.out.println("Thank you for your Time...");

	}
}
