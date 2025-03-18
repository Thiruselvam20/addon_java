package programs;

public class Pudhusu {
public static void main(String[] args) {
int a=5;
int c= 7;
System.out.println(c);

int b=3;//binary 5-->0101, 3-->0011
System.out.println("Bitwise AND "+(a&b));
System.out.println("Bitwise OR "+(a|b));
System.out.println("Bitwise XOR "+(a^b));
System.out.println("Bitwise NOT "+(~a));
/*
 * AND
 * 0101
 * 0011
 * ----
 * 0001 --->1
 * ----
 * OR
 * 0101
 * 0011
 * ----
 * 0111 --->7
 * ----
 * 
 * XOR
 * 0101
 * 0011
 * ----
 * 0110--->6
 * ----
 * 
 * NOT--->(n+1)
 * 0101
 * 0011
 * ----------
 * 0110--->6
 * 
 * Final answer---> -6
 * 
 *---------
 * 
 */

}

}



