/*Create class name data’ and create a subclass ‘b’. 
Which is extends from class ‘a’. And use these classes in ‘inherit’ class.*/
class data 
{
	String Name="Suman";
	int Age=23;
    String From="chennai";
    long Mobileno=7806905096;
  }
class b extends data //subclass 
{
	void display()
    {
    	System.out.println("Your name is :"+Name);
    	System.out.println("your age is :"+Age);
    	System.out.println("Are yor from in:"+From);
    	System.out.println("Yourmobile no is: "+Mobileno);
    }
}
public class Inheritclass
{
	public static void main(String[] args) 
	{
		System.out.println("**************Print the Inherit class****************");
		b ob=new b();
		ob.display();
	}
}