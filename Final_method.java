final class demo2
{
    void show()
    {
    	System.out.print("This is the final method");
    }
}

class demo3 extends demo2
{ 
   void show()
     {
    	 super.show();
    	 System.out.print("\nFinal method not overridden");
     }
}
public class Final_method 
{
	public static void main(String[] args)
	{
       demo3 f=new demo3();
       f.show();
	}

}
