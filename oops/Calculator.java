package oops;

public class Calculator {
       //by changing the number of arguments
	public int add(int a,int b) {
		return a+b;
		
	}
	public int add(int a,int b, int c) {
		return a+b+c;
}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(5, 10));
		System.out.println(calc.add(2,6, 16));
				}
}
