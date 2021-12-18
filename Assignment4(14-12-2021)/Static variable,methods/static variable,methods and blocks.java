//Write a program to demonstrate static variables ,methods ,and blocks.
public class Staticvm
{
	 
		static int x = 10;//static variables
	    static int y;
	    static void func(int z)//static methods
	    {
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	      System.out.println("z = " + z);
	   }
	   static //static blocks
	   {
		  System.out.println("***********static variables ,methods ,and blocks**********");
	      System.out.println("Running static initialization block.");
	      y = x + 5;
	   }
public static void main(String[] args) 
	{
		
	 func(8);//passing the value inside of the method.No need to create for the object for static method.
		
	}

}
© 2021 GitHub, Inc.
Terms
Privacy
Security