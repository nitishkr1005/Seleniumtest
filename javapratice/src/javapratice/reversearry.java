package javapratice;

import java.util.Scanner;

public class reversearry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter the name to be reverse = ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String reverse = "";
		for(int i=name.length()-1;i>=0;i--) {
			reverse += name.charAt(i);
			
		}
		
		System.out.print("Reverse in name is = " + reverse);
		sc.close();
	}

}
