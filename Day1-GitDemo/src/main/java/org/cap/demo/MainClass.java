package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		greet();
		SalesCalss class1 = new SalesCalss();
		class1.show();
		MoneyClass class2 = new MoneyClass();
		class2.displsy();
	}
	
	public static void greet() {
		
		System.out.println("Welcome!!");
		for(int i = 0; i < 4; i++) {
			System.out.println("Hello");
		}
	}

}
