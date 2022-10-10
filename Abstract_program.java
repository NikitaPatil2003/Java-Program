import java.util.Scanner;
abstract class Num
{
     int a;
     
     Scanner s=new Scanner(System.in);
     
     void read()
     {
    	 System.out.print("Enter the number:- ");
    	 a=s.nextInt();
     }
     
     public abstract void square();
}

class Square_root extends Num
{
     	public void square()
     	{
            System.out.print("The Square is:- "+a*a);   		
     	}
 }
public class Abstract_program 
{
	public static void main(String[] args)
	{
       Square_root s=new Square_root();
        s.read();
        s.square();
	}
}
