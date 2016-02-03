package test_package2;

import somepackage.*;
import another_package.AnotherClass;

public class Test3 {

	public static void main(String args[]){
		AnotherClass obj = new AnotherClass();

		System.out.println("Hello World! Computation(*+) = " + (SomeClass.multiply(5,5)+obj.add(5,1)));


	}
	

}