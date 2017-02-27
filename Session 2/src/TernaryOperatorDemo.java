import java.util.Scanner;

public class TernaryOperatorDemo {
	public static void main(String[] args) {
		Scanner ageScanner = new Scanner(System.in);
		int age = ageScanner.nextInt();
		
		String isElligible=age>=18?"Yes":"No"; //if(age>=18) "Yes" else "No" 
		
		System.out.println(isElligible);

	}
}
