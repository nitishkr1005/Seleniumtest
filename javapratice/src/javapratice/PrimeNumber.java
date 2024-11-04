package javapratice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeNumber {

    
	 public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        if (num <= 3) {
	            return true;
	        }
	        if (num % 2 == 0 || num % 3 == 0) {
	            return false;
	        }
	        int i = 5;
	        while (i * i <= num) {
	            if (num % i == 0 || num % (i + 2) == 0) {
	                return false;
	            }
	            i += 6;
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	        List<Integer> primeNumbers = new ArrayList<>();
	        for (int num = 2; num <= 50; num++) {
	            if (isPrime(num)) {
	                primeNumbers.add(num);
	            }
	        }

	        Collections.reverse(primeNumbers);
	        for (int prime : primeNumbers) {
	            System.out.println(prime);
	        }
	    }
	}