package Assignment01;

import java.util.Scanner;

public class CurrencyInWords {
	
	public static final String empty = "";
	public static final String[] onetonineteen = {empty, "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ","Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
	public static final String[] twentytoninety = {empty, empty, "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("for amount" + " = ");
		int money = input.nextInt();
		
		String convertamount = amountInWords(money);
		
		System.out.println("it prints" + " " + convertamount +"taka.");
		
		input.close();
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
