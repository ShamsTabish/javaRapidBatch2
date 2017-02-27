
public class InheritanceDemo {
	public static void main(String[] args) {
		B b=new B();
		b.printA();
		b.printB();
		
		C c=new C();
		c.printA();
	}
}

class A {
	void printA() {
		System.out.println("A");
	}
}

class B extends A {
	void printB() {
		System.out.println("B");
	}
}

class C extends A{
	
}
class D extends A{
	
}