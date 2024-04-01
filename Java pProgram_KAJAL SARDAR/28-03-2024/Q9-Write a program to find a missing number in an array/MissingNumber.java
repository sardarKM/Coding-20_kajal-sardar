/*Missing Number in ARRAY*/


class MissingNumber
{
public static void main(String args[])
{
	int[] a={1,2,3,4,5,6,8};
	int sum =0;
	int expnum =a.length+1;
	int totalNum =(expnum*(expnum+1)/2);
	for(int i =0;i<a.length;i++)
	{
	 sum=sum +a[i];
	
	}
System.out.println("the totalNUM:"+totalNum);
System.out.println("the sum :"+sum);
System.out.println("Missing Number :" +(totalNum-sum));
}
}