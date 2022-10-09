import java.util.*;
class num2
{ 
	int a,i=1,sum=0;
	Scanner s=new Scanner(System.in);
	
	void read()
	{
	System.out.print("Enter the number:- ");
	a=s.nextInt();
	}
	
	//int temp=a;
	
	void display()
	{
		while(i<a)
		{	
			if(a%i==0)
			{
				sum=+i;
			}
			
			i++;
		}
		if(a==sum)
		{
			System.out.print("It is perfect number");
		}
		else
		{
			System.out.print("It is not perfect number");
		}
    }
}
public class Perfect_num
{

	public static void main(String[] args) 
	{
	   num2 n=new num2();
	   n.read();
	   n.display();
        
	}

}
