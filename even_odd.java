
import java.util.Scanner;
class num
{
    int a;

    Scanner s=new Scanner(System.in);

   void read()
   {
    System.out.print("Enter the number:- ");
    a=s.nextInt();
   }

   void display()
   {
      if(a%2==0)
      {
         System.out.print(a+" is Even number\n");
      }
      else
      {
          System.out.print(a+" is Odd number");

      }
   }
}

class even_odd
{
  public static void main(String args[])
  {
      num n=new num();

      n.read();
      n.display();
  }

}