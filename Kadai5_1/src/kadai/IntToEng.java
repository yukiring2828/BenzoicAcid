package kadai;

import java.util.*;


public class IntToEng {
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int input=sc.nextInt();
		System.out.println(translateEng(input));			
	}
	static String translateEng(int n){
		return "";
	}
	
	static String oneplace(int n){
		String numbers[]={
				"zero",
				"one",
				"two",
				"three",
				"four",
				"five",
				"six",
				"seven",
				"eight",
				"nine"
		};
		return numbers[n];
	}
	
}
