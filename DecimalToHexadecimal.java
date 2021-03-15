package Assignment01;

import java.util.Scanner;
public class DecimalToHexadecimal {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.print("for n =" + " ");
		int number = input.nextInt();
		
		String hexvalue =  dec2hex(number);
		
		System.out.println("return value =>" + " " + hexvalue);
		
		input.close();
	}
	
	public static String dec2hex(int n) {
		int rem = 0;
		String dechex="";
		char [] hex={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	 
	    while(n>0){
	       rem=n%16; 
	       dechex=hex[rem]+dechex; 
	       n=n/16;
	     }
		return dechex;

	}
}
