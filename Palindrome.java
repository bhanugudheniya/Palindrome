import java.util.Scanner;
class Palindrome
{
	public static void main(String []args)
	{
		int n, i, rev=0, d;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		
		System.out.println("");
		
		n = input.nextInt();
		
		d=n;
		
		while(n>0)
		{
			i = n%10;
			rev = rev*10+i;
			n = n/10;
		}
		System.out.print("Reverse of "+d);
		System.out.println(" is : "+rev);
		System.out.println("");
		
		System.out.println("******************************");
		if(d==rev)
		{
			System.out.println("It is Palindrome");
		}
		
		else
		{
			System.out.println("It is not a Palindrome");
			
		}
		System.out.println("******************************");
		System.out.println("");
		System.out.println("******************************");
		System.out.println("Thank You For Using This Programs");
	}
}