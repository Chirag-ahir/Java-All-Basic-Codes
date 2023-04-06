package Listiterator;

import java.util.ArrayList;
import java.util.List;

public class Listiterator {
	

	public static class Employee{
		String city;
		int id;

		void createEmployee(String city, int id) {
			this.city = city;
			this.id = id;
		}
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		
	}
}
