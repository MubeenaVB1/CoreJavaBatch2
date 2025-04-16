package aggregation;

public class Student {
	
	String name;
	int rollNo;
	Address address;
	
	Student(String name, int rollNo,Address address){
		this.name=name;
		this.rollNo=rollNo;
		this.address=address;
	}
	
	public void print() {
		System.out.println("student name :"+name);
		System.out.println("student roll no :"+rollNo);
		System.out.println("pin :"+address.pin);
		System.out.println("houseName :"+address.houseName);
		System.out.println("street name :"+address.streetName);
	}

	public static void main(String[] args) {
		Address a = new Address(1234,"Akkulam","Trivandrum");
		Student s = new Student("Anu",23,a);
		s.print();
		
		System.out.println("----------------");
		
		Address a1 = new Address(567,"thodupuzha","idukki");
		Student s1 = new Student("Mubeena",34,a1);
		s1.print();
	}

}
