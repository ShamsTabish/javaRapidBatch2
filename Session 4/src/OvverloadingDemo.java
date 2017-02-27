
public class OvverloadingDemo {
	public static void main(String[] args) {
		Math math = new Math();
		int result = math.add(10, 4);
		System.out.println(result);
		result = math.add(2, 5, 9);
		System.out.println(result);

		float fResult = math.add(2.4f, 5f);
		System.out.println(fResult);
	}
}

class Math {
	int add(int a, int b) {

		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	float add(float a, float b){
		return a+b;
	}
	
}