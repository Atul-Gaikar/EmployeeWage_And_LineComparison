package com.bridgelabz.EmployeeWageComputation;

public class PartTimeEmployee {

	public static void main(String[] args) {
		System.out.println("welcome to employee wage");
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int Wage_per_hour = 20;
		int Emp_wage_hour = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		// Part Time wage and Full time wage
		if (empCheck == IS_FULL_TIME)
			// Employee is Present
			Emp_wage_hour = 8;
		else if (empCheck == IS_PART_TIME)
			// Employee is Absent
			Emp_wage_hour = 4;
		else
			Emp_wage_hour = 0;

		int Emp = Emp_wage_hour * Wage_per_hour;
		System.out.println("Wage of a employee per day : " + Emp);
	}
}