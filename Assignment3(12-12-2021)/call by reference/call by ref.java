//Write a program Example for call by references...
		
public class Callbyreferences 
{

	/*only passing the Address or Memory that is called by the call by references  
	it's works based on the primitives datatypes*/
			int x=10; // instance variable or gobal variable
			// call the value 
			void call(Callbyreferences ob)
			{
				ob.x = ob.x + 10;
				
			}

			public static void main(String[] args)
			{
				System.out.println("**********Call by by Reference or passing the address or passing the memory**********");
				Callbyreferences ob=new Callbyreferences();
				System.out.println("\t\t\tBefore:"+ ob.x);
				ob.call(ob);//passing the object
				System.out.println("\t\t\tAfter:"+ ob.x);

			}

}