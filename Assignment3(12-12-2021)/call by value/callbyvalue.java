public class Callbyvalue 
{
	/*only passing the value in call by value 
	it's works based on the primitives datatypes*/
	int x=10; // instance variable or gobal variable
	// call the value 
	void call(int x)
	{
		x+=10;
		
	}

	public static void main(String[] args)
	{
		System.out.println("**********Call by by or passing the value**********");
		Callbyvalue ob=new Callbyvalue();
		System.out.println("Before:"+ ob.x);
		System.out.println("After:"+ ob.x);

	}

}