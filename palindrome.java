import java.util.Scanner;

 class Number
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
    	
    	if(rev==temp)
    	{
    		System.out.print("Given number is palindrome");
    	}
    	else
    	{
    		System.out.print("Given number is not palindrome");
    	}	
    }
}
public class palindrome 
{
	public static void main(String[] args) 
	{
        Number d=new Number();
        d.read();
        d.display();
	}

}
