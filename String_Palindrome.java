import java.util.Scanner;
class String_value
{
	
	String str,rev="";
	int len,i;
	
	Scanner s=new Scanner(System.in);
	
	void read()
	{
		System.out.print("Enter the string:- ");
	    	str=s.nextLine(); 
	    	
	}
	
	void display()
	{
	    len=str.length();
		
	    for(i=len-1;i>=0;i--)
	    {
	    	rev=rev+str.charAt(i);
	    }
	    if(str.equals(rev))
    	{
    		System.out.print("Given string is palindrome");
    	}
    	else
    	{
    		System.out.print("Given string is not palindrome");
    	}
	}
}
public class String_Palindrome 
{
	public static void main(String[] args) 
	{
         String_value st=new String_value();
         st.read();
         st.display();
	}

}
