package javapratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Uniquewords {
	public static void main(String[] args) {
		 String s = "I Love India I live in India";

	        // Convert the string to lowercase and remove spaces to handle case sensitivity and space
	        s = s.toLowerCase().replace(" ", "");
	        // Maps to keep track of character frequency
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        List<Character> uniqueChars = new ArrayList<>();
	        List<Character> repeatedChars = new ArrayList<>();
	        // Counting the frequency of each character
	        for (char c : s.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() == 1) {
	                uniqueChars.add(entry.getKey());
	            } else {
	               repeatedChars.add(entry.getKey());
	        }}
	        System.out.println("Unique Characters: " + uniqueChars);
	        System.out.println("Repeated Characters: " + repeatedChars);
	    }
}
