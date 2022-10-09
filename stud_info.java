import java.util.Scanner;
class info
{
    int roll_no,t_marks;
    String name;

   Scanner sc=new Scanner(System.in);
    
      void read()
      {
    	  System.out.print("\nEnter the roll number:-" );
    	      roll_no=sc.nextInt();
    	  
    	  System.out.print("Enter the student name:-" );
    	      name=sc.next();
    	  
    	  System.out.print("Enter the total marks:-" );
    	      t_marks=sc.nextInt();
      }

      void display()
      {
    	  System.out.print("\n"+roll_no);
    	  System.out.print("\t\t"+name);
    	  System.out.print("\t\t\t"+t_marks);
      }
}

public class stud_info 
{
	public static void main(String[] args)
	{
        info a=new info();
        info b=new info();
        
        a.read();
        b.read();
        
        System.out.println("\n\n_______________________________________________________________________________");
        
        System.out.print("Roll_no ");
  	    System.out.print("\tStudent_name ");
  	    System.out.println("\t\tTotal_marks ");
  	  
      	 System.out.println("_______________________________________________________________________________");
        
  	    a.display();
  	    b.display();
	}

}
