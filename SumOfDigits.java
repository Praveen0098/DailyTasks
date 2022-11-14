package dailytasks;

import java.util.Scanner;

public class SumOfDigits {

	public void sofd(int sum)
	{
		int a,b,c;
		int n=sum;
		int sod;
		if(sum<100)
		{
			b=sum%10;
			a=(sum-b)/10;
			sod=a+b;
			if(sod<10)
			{
				System.out.println("Sum of Digits= "+sod);
			}
		}
		
	}
	public static void main(String[]args)
	{
		int n;
		int a,b,c,d;
		int sum;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value");
		n=s.nextInt();
		SumOfDigits ss=new SumOfDigits();
		
		if(n<100)
		{
			b=n%10;
			a=(n-b)/10;
			
			b=b*b;
			sum=a+b;
			ss.sofd(sum);
			
			
		}
		
	}
}
