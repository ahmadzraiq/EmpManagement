package CompanyManagement;

import java.util.Scanner;

public class Manager extends Person {
	private String department;

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return this.department;
	}

	public Manager() {
		this.setRatio(0.15);
	}

	public double getSalaryAfterTheAddition() {
		return this.getSalary() * this.getRatio();
	}

	public void readManagerInfo() {
		super.readPersonInfo();
		System.out.println("The yore department");
		Scanner reader = new Scanner(System.in);
		String department = reader.next();
		this.department = department;
	}

	@Override
	public String toString() {
		String department = "The department is = " + this.department;
		return super.toString() + department + "\n";
	}

}