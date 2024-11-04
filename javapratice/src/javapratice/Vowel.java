package javapratice;

public class Vowel {

public static void main(String[] args) {
	String s = "nitish";
	int count = 0;
		for(int i=0;i <= s.length()-1;i++) {
			char ch = s.charAt(i);
			if(ch =='a'||ch=='e'||ch == 'i'||ch== 'o'||ch =='u'  ) {
				System.out.println("Vowel Present in String = " + ch );
				count++;
}}
		System.out.println("Number of Vowel in String = " + count );}}
