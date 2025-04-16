package inheritanceExample;

public class ChildClass2 extends ParentClass{
	
	public void print() {
		System.out.println("from child class 2");
	}
	
	public static void main(String args[]) {
		ParentClass p = new ChildClass2();
		p.print();
	}

}
