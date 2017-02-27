
public class ConstructorDemo {
	
	public static void main(String[] args) {

		Student s1=new Student();
		System.out.println("Student 1");
		s1.printStudent();
		
		
		Student s2=new Student(1,"Ajay");
		System.out.println("Secont student");
		s2.printStudent();
		
	}
}

class Student{
	String name;
	int rollNumber;
	
	public Student() {
		name="";
		rollNumber=0;
	}
	Student(int rollNumber , String name){
		this.name=name;
		this.rollNumber=rollNumber;
		
	}
	
	void printStudent(){
		System.out.println(name+" \t "+rollNumber);
	}
	
}
