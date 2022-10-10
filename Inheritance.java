import java.util.*;
class data
{
     int Product_no;
    String Product_name;
     double Price;
     
     Scanner s=new Scanner(System.in);
     
     void read()
     {
    	 System.out.print("\nEnter the product no:- ");
    	 Product_no=s.nextInt();
    	 
    	 System.out.print("Enter the product name:- ");
    	  Product_name=s.next();
    	 
       	 System.out.print("Enter the price:- ");
    	 Price=s.nextDouble();
    	 
     }
}

class Data_display extends data
{
	void show()
	{
		  System.out.print("\n"+Product_no);
   	      System.out.print("\t\t "+Product_name);
      	 System.out.print("\t\t "+Price);
	}
}

public class Inheritance 
{
	public static void main(String[] args) 
	{
		Data_display d = new Data_display();
		Data_display d1 = new Data_display();
		Data_display d2 = new Data_display();

		d.read();
        d1.read();
        d2.read();
        
		System.out.print("\n\n\t\t_____Product Information_____\n");

		System.out.println(
				"\n\n_________________________________________________________________________________________");

		System.out.print("Product no  ");
		System.out.print("\tProduct name  ");
		System.out.print("\tProduct price  ");

		System.out.print("\n_________________________________________________________________________________________");

		d.show();
		d1.show();
		d2.show();
	}

}
