class Palindrome
{
 	public static void main(String args[])
	{
		int no=128, rem,rev=0;
		int temp=no;
		while(temp!=0)
		{	
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		
		}	
			if(no==rev)
			{
			System.out.println("Palindrome number");
			}
			else
			{
			System.out.println("NOT Palindrome number");
			}
	}
}