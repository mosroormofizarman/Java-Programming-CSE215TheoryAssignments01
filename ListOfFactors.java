package Assignment01;

import java.util.Scanner;

public class ListOfFactors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
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
		input.close();
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

}
