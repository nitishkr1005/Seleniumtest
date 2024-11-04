package javapratice;

import java.util.Scanner;

public class sum20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number for factorial = ");
		int number = sc.nextInt();
		
		long factorial = 1; // Use long to handle large results
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the factorial
        System.out.println("The factorial of " + number + " is " + factorial);
       
        

	}

}
