package EmpManagement;

import java.text.DecimalFormat;

public class Manager extends Person {

	private double z=0.15d;
	
    public void printSalaryAfterTheAddition()
    {
        this.salaryAfterTheAddition=salary*z;
        DecimalFormat money = new DecimalFormat("0.00");
        System.out.println("The salaryaftertheaddition" + money.format(this.salaryAfterTheAddition));

    }
    public void setId(int id) 
    {
    	this.id=id;
    }
    
    public void setName(String name)
    {
    	this.name=name;
    }
    public void setAge(float aga)
    {
    	this.age=age;
    }
    public void setDateOfEmployment(float dateOfEmployment) 
    {
    	this.dateOfEmployment=dateOfEmployment;
    }
    public void setSalary(double salary)
    {
    	this.salary=salary;
    }
    public double getSalary() 
    {
    	return this.salary;
    }

    

}