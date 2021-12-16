//3.Write a program to give the examples of operators.

public class Main

{
	public static void main(String[] args) 

	{
	 //Increment operators
	 

	 int a=10;
	
 a++;
	 
System.out.println("iIncrement the value:"+ a);
	 

	
 //Decrement operators

	 a--;
	
 System.out.println("Decrement the value:"+ a);
	 

	 //Arithmetic operator: ,+-,*,/
	 
   
   int num1=10,num2=20;
	  int add=num1+num2;

	  int sub=num1-num2;
	
  int mul=num1*num2;
	
  int div=num1*num2;
	
  System.out.println("Arithmetic operator Addition:"+ add);

	  System.out.println("Arithmetic operator Subtraction:"+ sub);
	
  System.out.println("Arithmetic operator Mutilplication:"+ mul);

	  System.out.println("Arithmetic operator Division:"+ div);

	  
//Relational Operator:==,!=,<,>,<=,>=


//using if Conditions
   
 int x=5,y=5;
  
  if(x==y)
 
   {
       
 System.out.println("x is equal to y");
 
   }

//using if-else Conditions
   
 if(x!=y)
   
 {
      
  System.out.println("x is not equal to y");

    }
       
 else
      
  {
        
   System.out.println("x is equal to y"); 
    
    }

//using else-if Conditions
int x1=10,y1=20;
   
 if(x1<y1)
  
  {
    
    System.out.println("x is less than y");
 
      if(x1>y1) 
      
 System.out.println("x is greater than y");

    }

// Conditional Operator:&&,||

int x2=10,y2=30,z2=20;

if((x2<y2)&&(y2>z2))
 
   {
       
 System.out.println("both are true");
 
   }
   
 else
{
    
    System.out.println("one Condition is true another Condition is false");
   
     
    }
   
  if((x2<y2)||(y2>z2))  

     {
      
 System.out.println("whether the one is true it will true");

    }
   
 else
{
        
System.out.println("both the Condition are false it return false");
   
     
    }
    
    


	}

}