package oops;

public class accessbirdaction  extends bird implements flyable{

	@Override
	public void fly() {
		System.out.println("Bird flys");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		accessbirdaction ba = new accessbirdaction();
		ba.eat();
		ba.fly();
		
	}
	
	

}
