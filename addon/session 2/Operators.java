package programs;

public class Operators {
	public static void main(String[] args) {
		int a = 7, b = 95;
		System.out.println("---Arithmetic---");
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		System.out.println("Modolus"+(a%b));
		
		System.out.println("---Relational---");
		System.out.println("Equal to: "+(a==b));
		System.out.println("Not Equal to: "+(a!=b));
		System.out.println("Greater than: "+(a>b));
		System.out.println("less than Equal to: "+(a<=b));
		
		System.out.println("---Logical---");
		boolean Condition1=true,Condition2=false;
		System.out.println("Logical AND: "+(Condition1&&Condition2));
		System.out.println("Logical OR: "+(Condition1||Condition2));
		System.out.println("Logical NOT: "+(!Condition2));
		 
		System.out.println("Unary");
		System.out.println("Increment: "+(a++));
		System.out.println("A value: "+a);
		System.out.println("Inecrement: "+(++a));
		System.out.println("Negation"+(~b));
		System.out.println("value of b: "+b);
		System.out.println("Decrement: "+(b--));
		System.out.println("Decrement: "+(--b));
		
		System.out.println("Assignment");
		a+=5;
		System.out.println("A="+a);
		
		System.out.println("Ternary");
		String result=(a>b)?"a is big than b":"b is big than a";
		System.out.println("Final answer: "+result);
		
		
	}
	

}
