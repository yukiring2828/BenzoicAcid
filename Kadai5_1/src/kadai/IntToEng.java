package kadai;

import java.util.*;


public class IntToEng {
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int input=sc.nextInt();
		System.out.println(translateEng(input));			
	}
	static String translateEng(int n){
		int cpy=n;
		boolean flag=false;
		if(n==0)flag=true;
		int[]a=new int[4];
		int i=1000,count=0;
		while(i>0){
			a[count]=n/i;
			n%=i;
			i/=10;
			count++;
		}
		int x=a[3]+a[2]*10;
		String num="";
		if(a[0]!=0)num=num+oneplace(a[0])+"thousand";
		if(a[1]!=0)num=num+oneplace(a[1])+"hundred";
		if(x>19)num+=tenplace(a[2]);
		if(x>19 && a[3]!=0)num+=oneplace(a[3]);//20ˆÈã‚Ì1‚ÌˆÊ
		if(x<20&&x>0)num+=oneplace(x);//20ˆÈ‰º‚Ì‚Æ‚«‚Ìˆ—
		if(flag)num="zero";
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
