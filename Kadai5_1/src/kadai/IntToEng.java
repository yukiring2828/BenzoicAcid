package kadai;

import java.util.*;


public class IntToEng {
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int input=sc.nextInt();
		System.out.println(translateEng(input));			
	}
	static String translateEng(int n){
		String num = "";
		int a=0;
		a=n/10;
		
		if(a>1){ num+=tenplace(a);n=n%10;}
		if(n<20&&n>0) num+=oneplace(n);
		return num ;
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
				"nine",
				"ten",
				"eleven",
				"twelve",
				"thrirteen",
				"fourteen",
				"fifteen",
				"sixteen",
				"seventeen",
				"eighteen",
				"nineteen"
		};
		return numbers[n];
	}
	
	static String tenplace(int n){
		n=n-2;
		String numbers[]={
				"twenty",
				"thirty",
				"forty",
				"fifty",
				"sixty",
				"seventy",
				"eighty",
				"ninety",
				
		};
		return numbers[n];
	}
	
	
}
