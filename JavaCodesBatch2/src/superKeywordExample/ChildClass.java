package superKeywordExample;

public class ChildClass extends ParentClass{
	
	ChildClass(){
		//super();
		System.out.println("from child class constructor");
	}
	
	public static void main(String args[]) {
		ChildClass c = new ChildClass();
	}

}
