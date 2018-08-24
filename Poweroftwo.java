import java.util.*;
class Poweroftwo
{
	public void poweroftwo(int number)
	{
		int num=number;
		int d;
		boolean flag=true;
		while(num>1)
		{
			d=num%2;
			if(d%2!=0)
			{
				flag=false;
				break;
			}
			num=num/2;
		}
		if(flag==true)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		Poweroftwo obj=new Poweroftwo();
		obj.poweroftwo(number);
	}
}
