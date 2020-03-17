public class Employee
{
    private String firstName;
	private String lastName;
	private double salry;
	Employee(String firstName,String lastName,double salry )
	{
	    this.firstName=firstName;
		this.lastName=lastName;
		this.salry=salry;
	}
	  public void setfirstName(String n)
	  {
	     firstName=n;
	  }
	 public String getfirstName()
	 {
	      return firstName;
	 }
	 
	 public void setlastName(String l)
	  {
	     lastName=l;
	  }
	 public String getlastName()
	 {
	      return lastName;
	 }
	 
	 public void setsalry(double s)
	  {
		  salry=s;
	     if(salry<0)
			 salry=0.0;
		 else 
			 salry=s;
	  }
	 public double getsalry()
	 {
	      return salry;
	 }
	
}