//Write a program to give the example of control statements.
public class Controlstatement 
{

	public static void main(String[] args) 
	{
		System.out.println("********If statements********");
		if (true) //If statements
				{
				    System.out.println("Condition True");

				}
				
			System.out.println("********Switch Statements********");

			int x=1;
			switch(x)//Switch Statements
			 {
			    case 1:System.out.println("Print case 1..."); 

			    case 2:System.out.println("Print case 2...");
			
		           break;

			    default:System.out.println("Print the dafault...");
			
		 }
		    System.out.println("********For loop********");
		   
		 for (int i=0;i<=5;i++ )//For loop
		  
		  {
		        System.out.println(i);
		   
		 }
			 
		  System.out.println("********While Statements********");

			   int j=1;
		      
		 while(j<=5)//While Statement
		      
		 {
		           

		 System.out.println(j);  
		       
		     j++;
		  

		     }
		 System.out.println("********Do-While Statements********");
		 
	int i=2;    
    do{    //Do-while statements
        System.out.println(i);    
    i++;    
    }while(i<=5);    
}    

}