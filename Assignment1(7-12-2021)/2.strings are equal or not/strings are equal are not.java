//2.Write a program check two strings are equal or not.


//using Scanner class get the string in runtime 

 
import java.util.Scanner;


public class Main

{
	
	public static void main(String[] args)
 	{
	   
 		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter your Name:");
		
		String name1=scanner.next();
		
		String name2=scanner.next();
		
		if( name1.equals(name2))
	
	    	   {
		      
  				System.out.println("The given stringname is Equal ");
	
	    	   }
		  
  		else
	
		    {
		        
 		 	System.out.println("The given stringname is Not-Equal ");
	
	   	    }
	}
}