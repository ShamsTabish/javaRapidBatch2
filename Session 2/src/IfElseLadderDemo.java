import java.util.Scanner;

public class IfElseLadderDemo {
	public static void main(String[] args) {
		Scanner marksReader = new Scanner(System.in);

		int marks = marksReader.nextInt();

		if (marks < 40)
			System.out.println("Sorry, you couldn't clear.");
		else if (marks < 60) {
			if (marks < 50)
				System.out.println("Congrats, you scored scond class");
			else
				System.out.println("Congrats, you scored Higher scond class");
		} else if (marks < 75) {
			System.out.println("Awesome, You scored 1st class");
		} else if (marks <= 100)
			System.out.println("Excellent, Thats a distinction..");
		else
			System.out.println("Invalid Marks");

	}
}
