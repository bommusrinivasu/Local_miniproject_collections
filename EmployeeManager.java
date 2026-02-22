package miniprojects;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

	List<Employee> data = new ArrayList<>();

	public void AddEmployData(Employee ee) {

		data.add(ee);

	}

	public void printEmployData() {

		for (Employee employee : data) {
			System.out.println(employee);
		}
	}

	public Employee SearchEmployee(int iD) {

		for (Employee employee : data) {
			if (employee.getId() == iD) {
				return employee;
			}
		}
		return null;
	}

	public boolean updateemployedata(int idd, int sala) {
		Employee em = SearchEmployee(idd);
		if (em != null) {
			em.setSalary(sala);
			return true;
		}
		return false;
	}

	public boolean deleteEmployedata(int deleteID) {

		return data.removeIf(emp -> emp.getId() == deleteID);
	}

}
