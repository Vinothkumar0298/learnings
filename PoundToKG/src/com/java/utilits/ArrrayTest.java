package com.java.utilits;

import java.util.ArrayList;
import java.util.List;

import com.data.files.Employee;

public class ArrrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee("Vino", "Kumar", 343));
		list.add(new Employee("David", "kumar", 443));
		list.add(new Employee("Smith", "Steven", 234));
		
		//list.forEach(employee->System.out.println(employee.toString()));
		
		//System.out.println(list.indexOf(new Employee("Vino", "Kumar", 343)));
		list.remove(2);
		Employee employees [] = list.toArray(new Employee[list.size()]);
		
		for(Employee a : employees) {
			
			System.out.println(a.toString());
		}
	}

}
