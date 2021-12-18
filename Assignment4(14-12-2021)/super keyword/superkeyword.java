//Write a program to give the example for ‘super’ keyword

class SuperclassA  //Parent class or Superclass or base class
{
	 int num = 100;
}
class SubclassB extends SuperclassA  //Child class or subclass or derived class
{
	int num = 110;
    void printNumber()
    {
System.out.println("It will print the current parent class :"+super.num); //super is a keyword it will invoke the immediate Parent class 
    }
}
   
public class Skeyword
{
	public static void main(String[] args) 
	{
		System.out.println("*************Print the super keyword access the current parent class******************");
		SubclassB obj= new SubclassB();
		obj.printNumber();
		
	}

}