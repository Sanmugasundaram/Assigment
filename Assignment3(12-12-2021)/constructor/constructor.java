///Write a program create a class ‘simpleobject‘. Using constructor display the message 
class Simpleobject 
{
	private String name;//within the class only we can accsess the private variable
	Simpleobject() 
	{
		// constructor
		  
	    System.out.println("Constructor Called:");
	    name = "Sanmugam.M";
	}

	public static void main(String[] args) 
	{
		// constructor is invoked while
	    // creating an object of the Main class
	    Simpleobject obj = new Simpleobject();//create the object for the constructor class
	    System.out.println("The name is " + obj.name);//access the private object

	}

}