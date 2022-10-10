import java.util.Scanner;

interface Methods
{
    void read();
    void display();
}

class Info_gain
{
	int roll_no,T_marks,sub;
	String stud_name;
	float percent;
	
	Scanner s=new Scanner(System.in);
	
	void read()
	{
		System.out.print("\nEnter the roll no:- ");
   	    roll_no=s.nextInt();
   	 
   	    System.out.print("Enter the student name:- ");
   	   stud_name=s.next();
   	 
      	 System.out.print("Enter the total marks:- ");
   	     T_marks=s.nextInt();
   	     
   	     sub=4;
	}
}

class Marksheet extends Info_gain implements Methods

{
	//Scanner s=new Scanner(System.in);
	Scanner s=new Scanner(System.in);
	
	public void read()
	{
		System.out.print("\nEnter the roll no:- ");
   	    roll_no=s.nextInt();
   	 
   	    System.out.print("Enter the student name:- ");
   	   stud_name=s.next();
   	 
      	 System.out.print("Enter the total marks:- ");
   	     T_marks=s.nextInt();
   	     
   	     sub=4;
	}

	
	
	
	public void display()
	{
	       percent=T_marks/sub;	
	       
		System.out.print("\n"+roll_no);
 	      System.out.print("\t\t "+stud_name);
    	 System.out.print("\t\t "+T_marks);
    	 System.out.print("\t\t "+percent);
	} 	 
}
public class Multiple_inhritance 
{

	public static void main(String[] args) 
	{
		Marksheet m=new Marksheet();
		Marksheet m1=new Marksheet();
		Marksheet m2=new Marksheet();
		
		m.read();
		m1.read();
		m2.read();
		
		System.out.print("\n\n\t\t_____Student Information_____\n");

		System.out.println("\n\n__________________________________________________________________________");

		System.out.print("Roll_no  ");
		System.out.print("\tStudent_name  ");
		System.out.print("\tTotal_marks  ");
		System.out.print("\tPercentage  ");
		
		System.out.print("\n___________________________________________________________________________");

		m.display();
		m1.display();
		m2.display();
	}

}
