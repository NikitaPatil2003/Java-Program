import java.util.Scanner;
class Method_1
{
   int a,b;

   Scanner sc=new Scanner(System.in);

   void show()
   {
       System.out.print("Enter the 1st number:- ");
       a=sc.nextInt();

       System.out.print("Enter the 2nd number:- ");
       b=sc.nextInt();
    }
}
class Method_2 extends Method_1
{
    int c;

    void show()
    {
        super.show();

        c=a+b;

        System.out.print("Addition is:- "+c+"\n\n");

    }
}

class Method_overriding
{
   public static void main(String args[])
   {
   Method_2 m=new Method_2();
   m.show();
}
}