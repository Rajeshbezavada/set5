import java.util.*;
import java.lang.*;
import java.io.*;
class PrintDigits
{
	public static void printDigits51(int num) {
    if (num >= 10) {
        printDigits51(num / 10);
    }
    System.out.print(num % 10);
    System.out.print("\t");
}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		PrintDigits51 obj=new PrintDigits51();
		obj.printDigits51(num);
	}
}
