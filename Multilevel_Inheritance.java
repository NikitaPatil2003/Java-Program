import java.util.*;

class value
{
    int num,rev=0,rem; 
    Scanner s=new Scanner(System.in);
    
    void get()
    {
    	System.out.print("Enter the number:- ");
    	num=s.nextInt();
    }
}

class reverse_num extends value
{
	int temp;

	void reverse_number()
	{
		temp=num;
      while(num!=0)
      {
    	rem=num%10;
    	rev=rev*10+rem;
    	num=num/10;
       }
      System.out.print("Reverse number is:- "+rev+"\n\n");
	}
}

class Check_reverse_num extends reverse_num
{
	void check()
	{
		if(temp==rev)
		{	
	     System.out.print(temp+" is a palindrome");
	    }
		else
		{
			System.out.print(temp+" is not palindrome");
		}
	}
}
public class Multilevel_Inheritance 
{
	public static void main(String[] args)
	{
         Check_reverse_num  ch=new Check_reverse_num();
         ch.get();
         ch.reverse_number();
         ch.check();
	}

}
