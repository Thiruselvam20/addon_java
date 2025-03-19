package Session_3;

public class Multi_dimensional_array {
public static void main(String[] args) {
	int[][] a= {{2,4},{5,7},{3,0},{5,2}};
	
	for(int[]i:a) {//2D to 1D
		for(int j:i) {//1D to variable
			System.out.print(j);//print the variable
		}
		System.out.println();
	}
}
}
