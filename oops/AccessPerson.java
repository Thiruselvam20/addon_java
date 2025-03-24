package oops;



public class AccessPerson {



	public static void main(String[] args) {

		Person originalconstructor = new Person("Sachin", 27);

		

	Person copiedconstructor = new Person(originalconstructor);//object dependencies

	

	System.out.println("Original constructor:");

	originalconstructor.displayInfo();

	

	System.out.println("Copies constructor:");

	copiedconstructor.displayInfo();

	}

}