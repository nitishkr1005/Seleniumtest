package javapratice;

import java.lang.reflect.Array;

public class maxarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] subject = {20,33,22,44,88,99,44};
		 int max = subject[0];
		for(int i = 0;i<subject.length;i++) {
			if (subject[i] > max) {
                max = subject[i]; // Update max if current element is greater
            }
		}
		Array.sort(subject);
		System.out.print("the maxium number in aray is " + max);
		System.out.print("sorted ");
	}

}
