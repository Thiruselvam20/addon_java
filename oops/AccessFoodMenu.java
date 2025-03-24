package oops;

public class AccessFoodMenu  implements vegItems,nonvegItems{
	@Override
	public void fry() {
		System.out.println("mutton fry,chicken fry");
	}
	@Override
	public void breakFast() {
		System.out.println("idly,dosa,pongal etc....");
	}
	@Override
	public void lunch() {
		System.out.println("Tomato rice,curd rice,meals");
	}
	public static void main(String[] args) {
		AccessFoodMenu afm = new AccessFoodMenu();
		afm.breakFast();
		afm.lunch();
		afm.fry();
		afm.gravy();
	}

}
