
public class SuperDemo {

	public static void main(String[] args) {
		SportsCar car=new SportsCar();
		//car.drive("Delhi");
		car.testDrive();
	}
}

class Car{
	int speed=100;
	
	Car(){
		System.out.println("Creating a car ..");
	}
	Car(String equipment){
		System.out.println("Creating Some Car with "+equipment);
	}
	
	void drive(String toDestination){
		System.out.println("Driving to "+toDestination);
	}
}

class SportsCar extends Car{
	int speed=200;
	public SportsCar() {
//		super(" GPS");
		System.out.println("Creating a sports Car..");
	}
	void testDrive(){
		
		super.drive("Nearby Locations.."+super.speed);
	}
	
	void drive(String toDestination) {
		System.out.println("Driving the SportsCar");
		
	}
	
}