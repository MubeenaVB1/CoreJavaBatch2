package accessModifiers;

public class PrentClass {
	
	public void print() {
		System.out.println("from parent class in in package access modifier");
	}
	
	public static void main(String args[]) {
		PrentClass p = new PrentClass();
		p.print();
	}

}
