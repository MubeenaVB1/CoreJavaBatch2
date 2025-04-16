package inheritanceExample2;

public class InterfaceClass implements InterfaceExample{

	public static void main(String[] args) {
		InterfaceExample i = new InterfaceClass();
				i.run();
				i.print();

	}

	@Override
	public void run() {
		System.out.println("from run method in child class");
		
	}

	@Override
	public void print() {
		System.out.println("from print method in child class");
		
	}

}
