package Assignment01;

import java.util.Scanner;

public class AssignOne {
	public static final String empty = "";
	public static final String[] onetonineteen = {empty, "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ","Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
	public static final String[] twentytoninety = {empty, empty, "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
	
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.print("for n =" + " ");
		int number = input.nextInt();
		
		String hexvalue =  dec2hex(number);
		
		System.out.println("return value =>" + " " + hexvalue);
		
		
		System.out.println();
		System.out.print("for n =" + " ");
		int num = input.nextInt();
		
		if(num==0) {
			System.out.println("it returns an infinite number of factors." );
		}
		else if(num==1) {
			System.out.println("it returns {1}");
		}
		else if(num==2) {
			System.out.println("it returns {1, 2}");
		}
		else {
			int [] result = listOfFactors(num);
			int value = range(num);
			
			System.out.print("it returns {1");
			
			for (int i = 2; i<=value; i++) {
				System.out.print(", " + result[i]);
	          }
			System.out.println("}");
		}
		

		System.out.println();
		System.out.print("for amount" + " = ");
		int money = input.nextInt();
		
		String convertamount = amountInWords(money);
		
		System.out.println("it prints" + " " + convertamount +"taka.");
		
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
	
	public static int [] listOfFactors(int n) {
		int i = 0;
		int [] arr = new int [n];
		
		int j = 1;
		while(j<=n) {
			if (n % j == 0) {
            	i += 1;
                arr[i] = j;
            }
			j++;
		}
		return arr;
	}
	
	public static int range(int n) {
		int i = 0;
	
		int j = 1;
		while(j<=n) {
			if (n % j == 0) {
            	i += 1;
            }
			j++;
		}
		return i;
	}
	
	public static String amountInWords(int amount) {
		StringBuilder arr = new StringBuilder();
		
        arr.append(getdigit(((amount / 1000) % 100), "Thousand "));
        arr.append(getdigit(((amount / 100) % 10), "Hundred "));
        
        if ((amount > 100) && (amount % 100 != 0)) {
            arr.append("and ");
        }
        arr.append(getdigit((amount % 100), ""));
 
        return arr.toString();
	}
	
	public static String getdigit(int amount, String suffix) {
        if (amount == 0) {
            return empty;
        }

        else if (amount > 19) {
            return twentytoninety[amount / 10] + onetonineteen[amount % 10] + suffix;
        }
        else {
            return onetonineteen[amount] + suffix;
        }
    }
}
