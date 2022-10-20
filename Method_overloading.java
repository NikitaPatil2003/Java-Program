class Demo
{
    int a,b,c;

    void show(int x,int y)
    {
        a=x;
        b=y;

     }

     void show(int z)
     {
        c=z;
     }

     void show()
     {
        System.out.print("\n The value of a= "+a);
        System.out.print("\n The value of b= "+b);
        System.out.print("\n The value of c= "+c+"\n\n");
     }
}

class Method_overloading
{

  public static void main(String args[])
  {
       Demo d=new Demo();
       d.show(10,20);
       d.show(30);
       d.show();
   }

}