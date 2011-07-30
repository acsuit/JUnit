package de.vogella.junit.first;

public class MyClass {

	public int multiply(int x, int y) {
		try {
			return x * y;
		}catch(Exception e){
			return x / y;
		}
	}
}