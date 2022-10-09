import java.util.Scanner;

 class Number2
{
   	int a,r,rev=0,temp;
     
     Scanner s=new Scanner(System.in);
     
     void read()
     {
       System.out.print("Enter the number:- ");
       a=s.nextInt();
        temp=a;
     }
     
    void display()
    {
    	while(a>0)
    	{
    		r=a%10;
    		rev=rev*10+r;
    		a=a/10;
    	}
    	
         System.out.print("Reverse number is:- "+rev );	
    }
}
public class Reverse_num 
{
	public static void main(String[] args) 
	{
        Number2 d=new Number2();
        d.read();
        d.display();
	}

}

