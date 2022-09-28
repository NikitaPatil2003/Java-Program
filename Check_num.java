import java.util.Scanner;
class Num
{
   int a;

    Scanner s=new Scanner(System.in);

    void read()
    {
        System.out.print("\nEnter the number :- ");
        a=s.nextInt();
    }

    void display()
    {
       if(a<=0)
       {
          if(a==0)
          {
             System.out.print(a+" is a zero\n\n");
          }
          else
          {
              System.out.print(a+" is a negative number\n\n");
          }
       }
      else
      {
         System.out.print(a+" is a positive number\n\n");
      }
    }
}

class Check_num
{
  public static void main(String args[])
  {
      Num n = new Num();
     n.read();
     n.display();
  }
}