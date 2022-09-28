import java.util.Scanner;

class Factorial
{
   public static void main(String args[])
    {
       int a,fact=1,i;

       Scanner s=new Scanner(System.in);

       System.out.print("Enter the number:- ");
       a=s.nextInt();

       for(i=1;i<=a;i++)
       {
          fact=fact*i;
       }

      System.out.print("\nThe factorial of given number is:- "+fact+"\n\n");

    }
}