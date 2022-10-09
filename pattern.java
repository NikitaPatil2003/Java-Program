public class pattern 
{
	public static void main(String[] args)
	{
	   int n=5,i,j,a;
	   
	   for(i=1;i<=n;i++)
	   {

     		 System.out.print(i+" ");
	    }
		   System.out.println();
		   
		   for(i=2;i<=10;i=i+2)
		   { 
				   if(i==2||i==10)
				   {	   
				     System.out.print("  ");
				   }
				   else
				   {
					   System.out.print(i+" ");
				   }   
			 }
		   System.out.print("\n");
		   
		   for(i=3;i<=15;i=i+3)
		   { 
				   if(i==9)
				   {	   
				     System.out.print(i+"  ");
				   }
				   else
				   {
					   System.out.print("  ");
				   }   
			 }   
			
		     System.out.println();   	
				   
		      for(i=4;i<=20;i=i+4)
			   {	  
					   if(i==4||i==20)
					   {	   
					     System.out.print(" ");
					   }
					   else
					   {
						   System.out.print(i+" ");
					   }
				 }   
					  
		      System.out.println();   	
		 
					  
		      for(i=5;i<=25;i=i+5)
			   {
				  System.out.print(i+" ");
				 }		   
	    }
	 }



