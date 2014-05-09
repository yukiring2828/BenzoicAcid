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
		int[]a=new int[6];
		int i=100000,count=0;
		while(i>0){
			a[count]=n/i;
			n%=i;
			i/=10;
			count++;
		}
		String num="";
		num=marugoto(a[0],a[1],a[2]);
		if(a[0]+a[1]+a[2]!=0)num+="thousand ";
		num+=marugoto(a[3],a[4],a[5]);
		if(flag)num="zero ";
		return num ;
	}
	static String marugoto(int a,int b,int c){
		if(a+b+c==0)return "";
		String num="";
		int x=b*10+c;
		if(a!=0)num=num+oneplace(a)+"hundred ";
		if(x>19)num+=tenplace(b);
		if(x>19&&c!=0)num+=oneplace(c);
		if(x<20&&x>0)num+=oneplace(x);
		return num;
	}
	
	static String oneplace(int n){
		String numbers[]={
				"zero ",
				"one ",
				"two ",
				"three ",
				"four ",
				"five ",
				"six ",
				"seven ",
				"eight ",
				"nine ",
				"ten ",
				"eleven ",
				"twelve ",
				"thrirteen ",
				"fourteen ",
				"fifteen ",
				"sixteen ",
				"seventeen ",
				"eighteen ",
				"nineteen "
		};
		return numbers[n];
	}
	
	static String tenplace(int n){
		n=n-2;
		String numbers[]={
				"twenty ",
				"thirty ",
				"forty ",
				"fifty ",
				"sixty ",
				"seventy ",
				"eighty ",
				"ninety ",
				
		};
		return numbers[n];
	}
	
	
}
