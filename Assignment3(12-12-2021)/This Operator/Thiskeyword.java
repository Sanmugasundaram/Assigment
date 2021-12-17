//Write a program using This keyword 
// this keyword reference variable that is refer to the current veraibles.
class Student
{ //instance of variable or Global variable
			int rollno;  
			String name;  
			float fee;  
			Student(int rollno,String name,float fee)//passing the arguments
			{  //local variable using this keyword access the value
			this.rollno=rollno;  
			this.name=name;  
			this.fee=fee;  
			}  
			void display()
			{
				System.out.println(rollno+" "+name+" "+fee);// print the rollno,name,fee
			} 
}
			 
public class Thisk 
{
public static void main(String[] args) 
	{
		System.out.println("*************This keyword*****************");
		Student s1=new Student(101,"san",5000f);  
		Student s2=new Student(102,"mugam",6000f);  
		s1.display(); //call the method 
		s2.display(); //again call the method 
	}  
}