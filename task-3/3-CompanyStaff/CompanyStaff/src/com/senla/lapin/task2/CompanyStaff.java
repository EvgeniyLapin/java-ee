package com.senla.lapin.task2;

import java.util.ArrayList;


public class CompanyStaff {

	public static void main(String[] args) {
		
		
		
		ArrayList <Person> companyStaff = new ArrayList<>();

		companyStaff.add(new Employee("Name1", "developer1", 3500.0));
		companyStaff.add(new Employee("Name2", "developer2", 3600.0));
		companyStaff.add(new Employee("Name3", "developer3", 3700.0));
		companyStaff.add(new Employee("Name4", "developer4", 3800.0));
		companyStaff.add(new Employee("Name5", "developer5", 3900.0));
		
		
		salaryCalculator(companyStaff);
		
		
}
	//calculate salary
	static void salaryCalculator(ArrayList <Person> companyStaff) {
		double sum = 0;
		for(Person x : companyStaff) {
			
			
			sum = sum +  ((Employee) x).getSalary();
			
		}
		System.out.print("Total salary: " + sum + "$");
		}
}


