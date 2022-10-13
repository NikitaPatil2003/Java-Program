class outer
{
   class inner
   {
      void display()
       {
          System.out.println("Inner class called");
        }
    }

}

class Inner__class
{
   public static void main(String args[])
   {
       outer.inner s1=new outer().new inner();
       s1.display();
    }
}