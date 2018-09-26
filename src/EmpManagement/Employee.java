package EmpManagement;

import java.text.DecimalFormat;

public class Employee extends Person{
    private Double theRatio=0.10d;
    
    public void printSalaryAfterTheAddition()
    {
        this.salaryAfterTheAddition=salary*theRatio;
        DecimalFormat money = new DecimalFormat("0.00");
        System.out.println("The salaryaftertheaddition" + money.format(this.salaryAfterTheAddition));

    }
    
    public void setId(int id) 
    {
    	this.id=id;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public void setAge(float aga) {
    	this.age=age;
    }
    public void setDateOfEmployment(float dateOfEmployment) {
    	this.dateOfEmployment=dateOfEmployment;
    }
    public void setSalary(double salary) {
    	this.salary=salary;
    }
    public double getSalary() 
    {
    	return this.salary;
    }


    
    
}
