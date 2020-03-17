import java.util.Scanner;
public class testEmply
{
   public static void main(String[] args)
   {
      Scanner obj =new Scanner(System.in);
	  Employee emp1 = new Employee("null","null",0.0);
	  Employee emp2 = new Employee("null","null",0.0);
	  
	  System.out.println("Enter your Employee firstName");
	  String firstName = obj.nextLine();
	  
	  System.out.println("Enter your Employee lastName");
	  String lastName = obj.nextLine();
	   
	  System.out.println("Enter your Employee salry");
	  Double salry= obj.nextDouble();
	    
	  
	  emp1.setfirstName(firstName);
	  emp1.setlastName(lastName);
	  emp1.setsalry(salry);
	    
      
	  
	  emp2.setfirstName(firstName);
	  emp2.setlastName(lastName);
	  emp2.setsalry(salry);
	    
      System.out.println("Employee firstName is " + emp2.getfirstName());
	  System.out.println("Employee lastName is " + emp2.getlastName());
	  System.out.println("Employee salry is "+ emp2.getsalry());
	  
	  System.out.println("Employee firstName is " + emp1.getfirstName());
	  System.out.println("Employee lastName is " + emp1.getlastName());
	  System.out.println("Employee salry is "+ emp1.getsalry());
	  
   }
}