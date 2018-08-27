import java.util.*;
import java.lang.*;
import java.io.*;
class SumOfDigits
{
	static int getsum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
			
		}
		return sum;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(getsum(n));
	}
}
