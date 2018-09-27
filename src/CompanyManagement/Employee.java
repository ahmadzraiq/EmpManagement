package CompanyManagement;

import java.util.Scanner;

public class Employee extends Person {
	private int rank;

	public Employee() {
		this.setRatio(0.10);
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return this.rank;
	}
	
	public double getSalaryAfterTheAddition() {
		return this.getSalary() * (rank == 1 ? 0.5 : this.getRatio()) ;
	}

	public void readEmployeeInfo() {
		super.readPersonInfo();
		System.out.println("The yore renk");
		Scanner reader = new Scanner(System.in);
		int rank = reader.nextInt();
		this.rank = rank;
	}

	@Override
	public String toString() {
		String rank = "The rank is = " + this.rank;
		return super.toString() + rank + "\n";
	}

}
