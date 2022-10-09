import java.util.Scanner;
class String_values
{
	
	String str,str2,str3,l_str,c_str;
	int len;
	
	Scanner s=new Scanner(System.in);
	
	void read()
	{
		System.out.print("Enter the string:- ");
	    	str=s.nextLine(); 
	    	
	    System.out.print("Enter the string:- ");
	    	str2=s.nextLine(); 	
	}
	
	void display()
	{
	
		System.out.print("\nOriginal string first:- "+str);
		System.out.print("\nOriginal string second:- " +str2);
	    
		str3=str.concat(" "+str2);
		System.out.print("\n\nConcat the two string :- "+str3);
		
		l_str=str3.toLowerCase();
		System.out.print("\nConvert in lower case:- "+l_str);
		
		c_str=str3.toUpperCase();
		System.out.print("\nConvert in upper case:- "+c_str);
		
		len=str3.length();
		System.out.print("\nlength of string:- "+len);
	}
}
public class String_operations 
{
	public static void main(String[] args) 
	{
         String_values st=new String_values();
         st.read();
         st.display();
	}

}
