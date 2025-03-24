package oops;

public class WrapperClass {
	public static void main(String[] args) {
		//converting primitive to wrapper class
		int a=Integer.valueOf(50);
		Integer intobj = 50;
		Character charobj = 'A';
		
		Double doubobj = 25.568794;
		
		System.out.println(intobj);
		System.out.println(charobj);
		System.out.println(doubobj);
		
		System.out.println("-----------------------------");
		
		
		//utility method from Wrapper class
		int parseInt = Integer.parseInt("123");
		double parseDouble = Double.parseDouble("25.35261525");
		boolean parseBoolean = Boolean.parseBoolean("true");
	}
	
}
