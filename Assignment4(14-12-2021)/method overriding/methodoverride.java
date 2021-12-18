//Write a program to give the example form method overriding concepts.
class A //Creating a parent class 
{  
		  void Override()
		  {
			  System.out.println("Class A inside of the override method will print");
		   }  
}  
		//Creating a child class  
		class B extends A //Creating a child class inherit parent class
		{  
			 void Override() //method overriding 
			  {
				 System.out.println("Class B inside of the override method will print");
			   }  
		}
		 
public class OverridingMethod 
{

	public static void main(String[] args) 
	{
		System.out.println("*********method overriding concepts**********");
		//creating an instance of child class  
		  B ob = new B();  
		  //calling the method with child class instance  
		  ob.Override();  
		 }  
	}  