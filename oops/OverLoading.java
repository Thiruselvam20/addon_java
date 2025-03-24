package oops;

public class OverLoading {
	int c;
	public void add(int a,int b) {
		c=a+b;
		System.out.println("Value of c:"+c);
		
	}
	public void add(float a, int b) {
		float c= a+b;
		System.out.println("value of c:"+c);
	}
	public void add(float a, double b) {
		double c= a+b;//local variable
		System.out.println("value of c:"+c);
	}
	
	public static void main(String[] args) {
		OverLoading over = new OverLoading();
		over.add(25, 15);
		over.add(52.2f,54);
		over.add(10.54f, 32.3256f);
	}
	
}
