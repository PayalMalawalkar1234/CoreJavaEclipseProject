package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class Office {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> myOffice = new ArrayList<>();

		// adding employees
		myOffice.add(new Employee(101, "Payal", "Training", 45000));
		myOffice.add(new Employee(102, "Priya", "IT", 25000));
		myOffice.add(new Employee(103, "Priyal", "R&D", 85000));
		myOffice.add(new Employee(104, "Shweta", "Sales", 15000));
		myOffice.add(new Employee(105, "Siya", "Electronics", 55000));
		myOffice.add(new Employee(106, "Riya", "Sales", 15000));
		myOffice.add(new Employee(105, "Nia", "Training", 55000));

		System.out.println("--------------Senior Employees-------------");

		// without using stream API
		ArrayList<Employee> seniorEmp = new ArrayList<>();

		for (Employee emp : myOffice) {
			// filtering
			if (emp.getSalary() > 40000) {

				seniorEmp.add(emp);

			}
			// end of if
		}
		// end of for

		// display using forEach

		seniorEmp.forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee emp) {
				System.out.println(emp);
			}
		});

		System.out.println("---------------Junior Employees-------------");
		// with Stream API

		List<Object> juniorEmp = myOffice.stream().filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee emp) {
				return emp.getSalary() < 40000;
			}
		}) // filtering data
				.map(new Function<Employee, Object>() {
					@Override
					public Object apply(Employee emp) {
						return emp;
					}
				})// fetch data
				.collect(Collectors.toList());// collect in a list

		juniorEmp.forEach(new Consumer<Object>() {
			@Override
			public void accept(Object emp) {
				System.out.println(emp);
			}
		});

		// displaying name dept:Sales

		System.out.println("---------------Sales Dept Employee Names-------------");

		myOffice.stream() // stream
				.filter(new Predicate<Employee>() {
					@Override
					public boolean test(Employee emp) {
						return emp.getDept() == "Sales";
					}
				}) // filtering
				.forEach(new Consumer<Employee>() {
					@Override
					public void accept(Employee emp) {
						System.out.println(emp.getEname());
					}
				}); // display names

		// Total salary distributed

		double totalSalaryExpense = myOffice.stream() // stream
				.collect(Collectors.summingDouble(new ToDoubleFunction<Object>() {
					@Override
					public double applyAsDouble(Object emp) {
						return ((Employee) emp).getSalary();
					}
				})); // collecting salary

		System.out.println("Total Salary expense is :" + totalSalaryExpense);

		// count emp works in Training dep

		long count = myOffice.stream() // stream created
				.filter(new Predicate<Employee>() {
					@Override
					public boolean test(Employee emp) {
						return emp.getDept() == "Training";
					}
				}) // filter
				.count();

		System.out.println("Number of employees in Training Dept:" + count);

		// convert list to set

		Set<Object> newOffice = myOffice.stream()// creating a stream
				.map(emp -> emp) // fetch data
				.collect(Collectors.toSet());// collect in set
		System.out.println("---------New Office--------------");

		newOffice.forEach(emp -> System.out.println(emp));

	}

}