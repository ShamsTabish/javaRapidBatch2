
public class BuildingBlocksOfClass {

	int a;
	
	public static void main2(String[] args) {
		
		System.out.println("Main Method");
		BuildingBlocksOfClass object1=new BuildingBlocksOfClass(20);
		
		BuildingBlocksOfClass object2=new BuildingBlocksOfClass();
		
	}
	static {
		System.out.println("This is a static Block");
	}
	
	{
		System.out.println("This is  a block of code..");
	}
	
	public  BuildingBlocksOfClass() {
		a=10;
		System.out.println("Constructor...");
	}
	BuildingBlocksOfClass(int b){
		a=b;
		System.out.println("Constructor 2 with a parameter");
	}
	
}
