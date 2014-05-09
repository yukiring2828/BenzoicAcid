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
		int[]a=new int[5];
		int i=10000,count=0;
		while(i>0){
			a[count]=n/i;
			n%=i;
			i/=10;
			count++;
		}
		int x=a[4]+a[3]*10;
		int y=a[0]+a[1]*10;
		String num="";
		/*
		if(y>19 && a[1]!=0)num+=oneplace(a[1])+"thausand";//20à»è„ÇÃ1ÇÃà 
		if(y<20&&y>0)num+=oneplace(y)+"thausand";
		if(a[2]!=0)num=num+oneplace(a[2])+"hundred";
		if(x>19)num+=tenplace(a[3]);
		if(x>19 && a[4]!=0)num+=oneplace(a[4]);//20à»è„ÇÃ1ÇÃà 
		if(x<20&&x>0)num+=oneplace(x);//20à»â∫ÇÃÇ∆Ç´ÇÃèàóù
		*/
		num=marugoto(a[2],a[3],a[4]);
		if(flag)num="zero";
		return num ;
	}
	static String marugoto(int a,int b,int c){
		
	String num="";
		
		int x=b*10+c;
		
		if(a!=0)num=num+oneplace(a)+"hundred";
		if(x>19)num+=tenplace(b);
		if(x>19&&c!=0)num+=oneplace(c);
		if(x<20&&x>0)num+=oneplace(x);
		return num;
		/*
		if(n/100!=0){num+=oneplace(n/100)+"hundred";
		n=n%100;
		}
		if(n>19)num+=tenplace(n);
		*/
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
