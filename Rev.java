import java.util.*;
class Rev
{
	public static void main (String ar[])
{ 
		Scanner s=new Scanner(System.in);
	System.out.println("Entre a num");
	int x = s.nextInt();
	int r=0,d;
	while(x>0)
{
	d = x%10;
	r =r*10+d;
	x=x/10;
}
	x=r;
	System.out.println(x);
}
}	