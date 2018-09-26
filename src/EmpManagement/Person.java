package EmpManagement;

import java.text.DecimalFormat;

public abstract class Person {
	protected int id;
	protected String name;
	protected float age;
	protected float dateOfEmployment;
	protected double salary;
	protected double salaryAfterTheAddition;
	
    public abstract void setId(int id);
	public abstract void printSalaryAfterTheAddition();
    public abstract void setName(String name);
    public abstract void setAge(float aga) ;
    public abstract void setDateOfEmployment(float dateOfEmployment);
    public abstract void setSalary(double salary);
    public abstract double getSalary();
    
    public  void printInfo()
    {	
    	System.out.println("The id is = " + this.id);
        System.out.println("The name is = " + this.name);
        System.out.println("The aga is = " + this.age);
        System.out.println("The data is = " + this.dateOfEmployment);
        DecimalFormat money = new DecimalFormat("0.00");
        System.out.println("The salary is = " + money.format(this.getSalary()));

    }
   
}
