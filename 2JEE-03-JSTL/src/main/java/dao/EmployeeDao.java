package dao;

import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeeDao {
	
	public List<Employee> generateEmployee() {
		
		List <Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Charles", "Dupond", 49));
		employeeList.add(new Employee("Anne", "Brolt", 54));
		employeeList.add(new Employee("Jeanne", "Hilt", 67));
		employeeList.add(new Employee("Mike", "Holte", 36));
		employeeList.add(new Employee("Isidore", "Bouna", 26));
		employeeList.add(new Employee("Leo", "Dicaprio", 30));
		
		
		return employeeList;
		
	}

}
