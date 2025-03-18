package programs;

public class variable {
	int a=25; //instance variable
	static int b=50; //static variable
	
	
	public static int print() {
		int mark = 94;
		return mark;
	}
	
	void display() {
		int d = 20;//local variable
		System.out.println("variable inside display" +d);
	}
	public static void main(String[] args) {
		variable obj1=new variable();
		System.out.println("Value of a="+obj1.a);
		obj1.display();		
		System.out.println(b);
		System.out.println(print());
		variable2 obj2 =new variable2();
		obj2.show();
		obj2.students();
		
	}

}
