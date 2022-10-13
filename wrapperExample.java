public class wrapperExample
{
   public static void main(String args[])
   {
      byte b=10;
      short s=20;
      int i=40;
      float f=50.0f;

        System.out.print("______Print the values________");
        System.out.print("\nfloat value:- "+f);
        System.out.print("\ninteger value:- "+i);
        System.out.print("\nShort value:- "+s);
        System.out.print("\nbyte value:- "+b);

        Byte byteobj=b;
        Short shortobj=s;
	    Integer intobj=i;
        Float floatobj=f;

        System.out.print("\n\n______Autoboxing converting primitive into objects________");
	    System.out.print("\nFloat object:- "+floatobj);
	    System.out.print("\nInteger object:- "+intobj);
	    System.out.print("\nShort object:- "+shortobj);
        System.out.print("\nByte object:- "+byteobj);


         byte bytevalue=byteobj;
		  short shortvalue=shortobj;
		 int intvalue=intobj;
         float floatvalue=floatobj;

         System.out.print("\n\n______Unboxing converting objects into primitive ________");
		 System.out.print("\nFloat value:- "+floatvalue);
		 System.out.print("\nInteger value:- "+intvalue);
		 System.out.print("\nShort value:- "+shortvalue);
	     System.out.print("\nByte value:- "+bytevalue+"\n");

   }
}