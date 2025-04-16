package exceptionHandlingExample;

public class ExceptionHandlingExample {
	
	public static void main(String args[]) {
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("from  arithmetic exception");
		}
		catch(NullPointerException e) {
			System.out.println("from null exception");
		}
		catch(Exception e) {
			System.out.println("from exception");
		}
		
	}

}