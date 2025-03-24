package oops;



public class Person {
	private String name;
	private int age;
	
	//Regular constructor
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//copy constructor
	public Person(Person other) {
		this.name = other.name;
		this.age = other.age;
		
	}
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	//method to display person details
	public void displayInfo()	{
        System.out.println("name:"+name,"age"+age);
}
}

