class demo
{
    demo(int x)
    {
        System.out.print("x= "+x);
    }

    protected void finalize()
    {
        System.out.print("\nobject is destroy by the garbage collector\n\n");

    }

}

public class Destructor_program
{
  public static void main(String args[])
  {
    demo de= new demo(23);
    de.finalize();
    de=null;
      System.gc();
    System.out.println("\ninside the main() method");
   }
}