
public class BreakAndContinueDemo {
	public static void main(String[] args) {
		int number = 1;
		while (number <= 20) {

			if (number % 5 == 0 && number != 5){
				System.out.println(number);
				break;
			}
			System.out.println("Looping..");
			number++;
			
			if(number%2==1)
				continue;
			System.out.println("-->>"+number);
			
			
		}
		System.out.println("End of Program");
	}
}


/*
a &&  b = >  True / False



a		b		a && b
true	true	true
true	false	false
false	true	false
false	false	false	


number =2

number%5==0  &&  number != 5

2%5==0 ==>  2==0
2!=5  

 


*/