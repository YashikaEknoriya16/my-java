import java.util.*;
class Swap
{
  public static void main(String ar[])
{
   Scanner s= new Scanner(System.in);
   System.out.println("Enter two number");
   int a=s.nextInt();
   int b=s.nextInt();
       a=a+b;
       b=a-b;
       a=a-b; 
  System.out.println(b);
}
} 
   