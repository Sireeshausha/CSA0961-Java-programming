import java.util.*;
class Biggest
{
  public static void main (String arg[])
  {
   Scanner sc= new Scanner(System.in);
   int a,b;
   System.out.println("enter a");
   a= sc.nextInt();
   System.out.println("enter b");
   b= sc.nextInt();
   if(a>b)
    {
      System.out.println("a is biggest");
    }
   else
      {
        System.out.println("b is biggest");
      }
    }
}