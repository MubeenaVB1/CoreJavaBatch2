package abstractionExample;

public class AstractionChildClass extends AbstractionParentClass{
	
	public void print() {
		System.out.println("from child class");
	}

	public static void main(String[] args) {
		AbstractionParentClass a = new AstractionChildClass();//upcasting
		a.print();
		a.run();
	}	
}
