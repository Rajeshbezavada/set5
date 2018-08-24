import java.util.Scanner;
class Strcmp
{
public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		String name1=ob.next();
		String name2=ob.next();
	if(name1.length()>name2.length())
	{
		System.out.println(name1);
	}
	else if(name1.contentEquals(name2))
	{
		System.out.println(name2);	
		
	}
	else if(name1.length()<name2.length())
	{
		System.out.println(name2);
	}

}
}
