package Session_3;
import java.util.Arrays;
public class Array_methods {
	public static void main(String[] args) {
		//Length of the array
		int[]num = {10,20,14,48,60};
		System.out.println("length of num: "+num.length);
		
		
		//1.copying an array
	    int[] source= {1,2,3,4,5};
	    int[] destination= new int[5];
	
	   //2.copy array
	    System.arraycopy(source, 0,destination,0,source.length);
	    for(int i : destination) {
	    	System.out.print(i+", ");
	    }System.out.println();
	   //3.array sort
	    int[]b = {12,8,6,45,17};
	    Arrays.sort(b);
	    System.out.println(Arrays.toString(b));
	    
	    //4.Array fill
	    int[] d = new int[5];
	    Arrays.fill(d, 1);//fill the array d by 1 to all index
	    //filling values to specific index
	    Arrays.fill(d, 1,4,2);//index from 1 to 4(n-1)-->index 1,2,3 to fill by 2
	    System.out.println(Arrays.toString(d));
	    
}
}