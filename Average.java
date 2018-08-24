import java.util.*;
import java.lang.*;
import java.io.*;
class Average
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int avg;
		int sum=0;
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		avg=sum/n;
		System.out.println(avg);
	}
}
