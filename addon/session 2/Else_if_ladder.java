package programs;
import java.util.Scanner;

public class Else_if_ladder {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your prize");
		int price=sc.nextInt();
		if(price>=60 && price<=180) {
			System.out.println("Seat from 1 to 30");
		}else if(price>=180 && price>=250 ){
			System.out.println("Seat from 31 to 70");
		}else if(price>=250 && price>=300) {
			System.out.println("Seat from 71 to 100");
		}else {
			System.out.println("invalid");
		}
	}

}
