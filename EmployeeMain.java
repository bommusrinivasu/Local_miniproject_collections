package miniprojects;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeManager emp = new EmployeeManager();
		Scanner sc = new Scanner(System.in);
		int input = 0;
		do {
			System.out.println("Employee management system");
			System.out.println("1. Add Employee");
			System.out.println("2. View All Employees");
			System.out.println("3. Search Employee");
			System.out.println("4. Update Salary");
			System.out.println("5. Delete Employee");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			input = sc.nextInt();

			switch (input) {

			case 1:
				System.out.println("Enter employee ID");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter employee name");
				String nm = sc.nextLine();

				System.out.println("Enter employee Salary");
				int sal = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter employee Department");
				String dp = sc.nextLine();

				emp.AddEmployData(new Employee(id, nm, dp, sal));

				System.out.println("New emplyee details successfully added");
				break;

			case 2:
				emp.printEmployData();
				break;

			case 3:
				System.out.println("Enter the employee ID to search");
				int ID = sc.nextInt();
				Employee em = emp.SearchEmployee(ID);
				if (em != null) {
					System.out.println("Employee details found");
				} else {
					System.out.println("Emplyee not found");
				}
				break;

			case 4:
				System.out.println("Enter the employee ID to update the salary");
				System.out.println("ID :");
				int idd = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter employee new Salary");
				int sala = sc.nextInt();
				sc.nextLine();

				if (emp.updateemployedata(idd, sala)) {
					System.out.println("Employee data updated successfully");
				} else {
					System.out.println("Employee data not found");
				}
				break;

			case 5:
				System.out.println("Enter the employee ID to delete");
				int deleteID = sc.nextInt();
				sc.nextLine();

				if (emp.deleteEmployedata(deleteID)) {
					System.out.println("Employee data deleted successfully");

				} else {
					System.out.println("Employee data not found");
				}
                break;
			}
		} while (input != 6);
		sc.close();
	}

}
