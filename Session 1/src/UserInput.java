import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner inputReader=new Scanner(System.in);
		String name=inputReader.nextLine();
		int age=inputReader.nextInt();

		
		System.out.println("Age: "+age);
		
		System.out.println("Name is :" +name);
	}
}
