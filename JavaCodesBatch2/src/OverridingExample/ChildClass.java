package OverridingExample;

public class ChildClass extends ParentClass{
	
	
	public void display() {
		System.out.println("from child class");
	}
	
	public void print() {
		
	}

	public static void main(String[] args) {
		ChildClass p = new ChildClass();//upcasting
		p.print();

	}

}
