package ProtectedPackage2;

import ProtectedPackage.SuperClass;

public class SubClass extends SuperClass{
	
	public static void main(String args[]) {
		SubClass s = new SubClass();
		s.send();
	}

}
