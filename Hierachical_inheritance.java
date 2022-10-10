import java.util.*;
class Numbers
{
	int a,b;
	
	Scanner sc=new Scanner(System.in);
	
	void read()
	{
		System.out.print("\n\nEnter the 1st number:- ");
		a=sc.nextInt();
		
		System.out.print("Enter the 2nd number:- ");
		b=sc.nextInt();
	}
}

class Calculate_1 extends Numbers
{
	int c;
	void display()
	{
		c=a+b;
		System.out.print("\nAddition is:- "+c);
	}
}

class Calculate_2 extends Numbers
{
	int d;
	void display()
	{
		d=a-b;
		System.out.print("\nSubtraction is:- "+d);
	}
}
public class Hierachical_inheritance 
{
	public static void main(String[] args) 
	{
        Calculate_1 c=new Calculate_1();
        c.read();
        c.display();
        Calculate_2 c1=new Calculate_2();
        c1.read(); 
        c1.display();   
	}

}
