import java.util.*;
class Nmm
{
	public static void main(String ar[])
{
	Scanner s=new Scanner(System.in);
	int x,i,c=0;
	System.out.println("Enter a num");
	x=s.nextInt();
	for(i=1;i<=x;i++)
	{
		if(x%i==0)
		c++;
}
	if(c==2)
	System.out.println("Prime");
else
	System.out.println("noo");
}
}