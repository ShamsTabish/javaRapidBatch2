
public class DetaTypeDemo {
	public static void main(String[] args) {
		int age;
//		age21=31;
		
		int maxAge=50;
		
		int minAge=18, votingAge, number;
		
		float percentageOfMarks=92.2334f;
		
		
		String name="Acadgild";

		
		int marks=345;
		
		//8 byte		//4 bytes
//		percentageOfMarks=marks;
		
		//4byte     8byte
		marks=(int)percentageOfMarks;
		
		System.out.println("percentageOfMarks: "+percentageOfMarks);
		System.out.println("marks: "+marks);
		
		
		// Assignment Operators
		marks+=1;// marks=marks + 1
		System.out.println("marks: "+marks);
		
		marks*=2;//marks= marks * 2
		
		System.out.println("marks: "+marks);
		
		
		add(20,34);
		
		byte a=-4;
		System.out.println("a : "+(a>>>1));
		
	}
	
	
	static int add(Integer a,Integer b){
		return a+b;
	}
}
