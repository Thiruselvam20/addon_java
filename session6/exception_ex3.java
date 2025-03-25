package session6;

public class exception_ex3 {
	
	static void validateAge(int age) {
		if(age<18) {
			throw new IllegalArgumentException("Age must be 18 or above");
		}else {
			System.out.println("Age is valid");
		}
	}
	public static void main(String[] args) {
		try {
			validateAge(10);
		}catch(IllegalArgumentException e) {
			System.out.println("Caught an exception"+e.getMessage());
		}
	}

}
