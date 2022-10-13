class outer
{

      public void show()
      {
		  class inner
		  {
            void display()
            {
         System.out.println("Inner class called");
	     }
	    }
	    inner s=new inner();
	    s.display();
      }

}

class Inner__class2
{
   public static void main(String args[])
   {
       outer s1=new outer();
       s1.show();
    }
}