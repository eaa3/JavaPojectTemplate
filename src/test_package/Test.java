package test_package;

import somepackage.*;
import another_package.AnotherClass;

public class Test {

	public static void main(String args[]){
		AnotherClass obj = new AnotherClass();

		System.out.println("Hello World! Computation(*) = " + SomeClass.multiply(5,5));
		System.out.println("Hello World! Computation(+) = " + obj.add(9,8));


	}
	

}