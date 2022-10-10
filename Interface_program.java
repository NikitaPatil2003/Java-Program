import java.util.*;
interface method
{
	void display();
}
class Demo implements method
{
	int a,b,c;
	
	Scanner s=new Scanner(System.in);
	
	void input()
	{
		System.out.print("Enter the 1st number :- ");
		a=s.nextInt();
		
		System.out.print("Enter the 2nd number :- ");
		b=s.nextInt();
	}
	
    public void display()
    {
    	c=a+b;
    	System.out.print("\nAddition is :- "+c);
    }
}
public class Interface_program 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.input();
		d.display();
	}
}
