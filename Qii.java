import java.util.*;
class Qii
{
	public static void main(String ar[])
{
	Scanner s= new Scanner(System.in);
 	System.out.println("Enter a num");
   
   	int a,d,s1=0,n;
 	a=s.nextInt();
        n=a;
while(a>0)
{ 
	d=a%10;
	s1=s1+d*d*d*d;
	a=a/10;
	}
		if(s1==n)
	System.out.println("Armstrong");
	else
		System.out.println("not");
}
}