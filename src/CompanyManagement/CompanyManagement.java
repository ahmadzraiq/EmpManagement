package CompanyManagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyManagement {

	public static void printPeopleData(ArrayList<Employee> employeesList, ArrayList<Manager> managersList,
			Scanner reader, PrintType printType) {
		int choice = -1;
		while (choice != 0) {
			System.out.println("1 - Print employee information");
			System.out.println("2 - Print manager information");
			System.out.println("0 - Go back");
			choice = reader.nextInt();

			switch (choice) {
			case 1:
				printPeopleData(employeesList, reader, printType);
				break;
			case 2:
				printPeopleData(managersList, reader, printType);
				break;
			case 0:
				choice = 0;
				break;
			}
		}
	}

	public static void printPeopleData(ArrayList<? extends Person> personsList, Scanner reader, PrintType printType) {
		int choice = -1;
		while (choice != 0) {
			System.out.println("1 - Print everyone");
			System.out.println("2 - Print Private Person id");
			System.out.println("0 - Go back");
			choice = reader.nextInt();

			switch (choice) {
			case 1:
				if (printType == PrintType.AllInfo)
					printPeopleInfo(personsList);
				else if (printType == PrintType.SalariesOnly)
					printPeopleSalaries(personsList);
				break;
			case 2:
				System.out.println("Enter ID = ");
				int id = reader.nextInt();
				Person person = getPersonById(personsList, id);

				if (person == null)
					System.out.println("Invalid ID");
				else {
					if (printType == PrintType.SalariesOnly)
						System.out.println(person.getSalaryAfterTheAddition());
					else if (printType == PrintType.AllInfo)
						System.out.println(person.toString());
				}
				break;
			case 0:
				choice = 0;
				break;
			}
		}
	}

	public static Person getPersonById(ArrayList<? extends Person> personsList, int id) {
		for (int i = 0; i < personsList.size(); i++) {
			Person person = personsList.get(i);
			if (person.getId() == id)
				return person;
		}

		return null;
	}

	public static void printPeopleSalaries(ArrayList<? extends Person> personsList) {
		for (int i = 0; i < personsList.size(); i++) {
			Person person = personsList.get(i);
			System.out.println(person.getSalaryAfterTheAddition());
		}
	}

	public static void printPeopleInfo(ArrayList<? extends Person> personsList) {
		for (int i = 0; i < personsList.size(); i++) {
			Person person = personsList.get(i);
			System.out.println(person.toString());
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee> employeesList = new ArrayList<Employee>();
		ArrayList<Manager> managersList = new ArrayList<Manager>();
		Scanner reader = new Scanner(System.in);
		try {
			int choice = -1;
			while (choice != 0) {
				System.out.println("1 - Add employee");
				System.out.println("2 - Add manager");
				System.out.println("3 - Print information");
				System.out.println("4 - Print salary increase");
				choice = reader.nextInt();

				switch (choice) {
				case 1:
					Employee employee = new Employee();
					employee.readEmployeeInfo();
					employeesList.add(employee);
					break;
				case 2:
					Manager manager = new Manager();
					manager.readManagerInfo();
					managersList.add(manager);
					break;
				case 3:
					printPeopleData(employeesList, managersList, reader, PrintType.AllInfo);
					break;
				case 4:
					printPeopleData(employeesList, managersList, reader, PrintType.SalariesOnly);
					break;
				}

			}

		} catch (InputMismatchException e) {
			System.out.println(
					"Characters were entered in place of digits or vice versa. Make sure the information is correct");
		}

	}
}