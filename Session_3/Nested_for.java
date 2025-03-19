package Session_3;
 import java.util.Scanner;

public class Nested_for {
public static void main(String[] args) {
	int row=5;
	int col=5;
    //pyramid pattern
	for(int i=1;i<=row;i++) {
		for(int j=1;j<=row-i;j++) {
			System.out.print(" ");
			}
		
		for (int k = 1; k <= (2 * i - 1); k++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	//right angle triangle pattern
	for(int i=1;i<=5;i++) {
		for(int j=1;j<i+1;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println();
	int num =6;
	for(int i=0;i<=num;i++) {
		for(int j=1;j<=num-i;j++){
			System.out.print("* ");
			
		}
		System.out.println();
	}
		
	
	//Diamond pattern 
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter no.of rows:");
	int rows = sc.nextInt();
	
	//Top half of diamond
	
		for(int i=1;i<=rows;i++) {
			//leading spaces
			for(int j=i;j<rows;j++) {
				System.out.print(" ");
				
			}
			//print *
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//bottom half of diamond
		
			for(int i=rows-1;i>=1;i--) {
				//leading spaces
				for(int j=rows;j>i;j--) {
					System.out.print(" ");
					
				}
				//print *
				for(int k=1;k<=(2*i-1);k++) {
					System.out.print("*");
				}
				System.out.println();
			}
	
}
}
