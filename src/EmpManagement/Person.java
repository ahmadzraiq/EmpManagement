package EmpManagement;

import java.util.Scanner;

public abstract class Person {
	private int id;
	private String name;
	private float age;
	private float date;
	private double salary;
	private double ratio;

	public abstract double getSalaryAfterTheAddition();

	public void readPersonInfo() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your id");
		this.setId(reader.nextInt());
		System.out.println("Enter your name = ");
		this.setName(reader.next());
		System.out.println("Enter your age = ");
		this.setAge(reader.nextFloat());
		System.out.println("Enter your data = ");
		this.setDate(reader.nextFloat());
		System.out.println("Enter your salary = ");
		this.setSalary(reader.nextDouble());
	}

	@Override
	public String toString() {
		String id = "The id is = " + this.getId();
		String name = "The name is = " + this.getName();
		String age = "The aga is = " + this.getAge();
		String data = "The data is = " + this.getData();
		String salary = "The salary is = " + this.getSalary();
		return id + "\n" + name + "\n" + age + "\n" + data + "\n" + salary + "\n";
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(float aga) {
		this.age = age;
	}

	public void setDate(float dateOfEmployment) {
		this.date = dateOfEmployment;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	public double getRatio() {
		return this.ratio;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public float getAge() {
		return this.age;
	}

	public float getData() {
		return this.date;
	}

	public double getSalary() {
		return this.salary;
	}
}
