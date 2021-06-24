package com.bridgelabz.EmployeeWageComputation;

public class TotalWageForEachCompany {

	public static final int IS_PART_TIME = 1;
	public final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public TotalWageForEachCompany(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void computeEmpWage() {
//		variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
//	computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hrs: " + empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}

	public String tostring() {
		return "Total Emp Wage For Company : " + company + " is: " + totalEmpWage;
	}

	public static void main(String[] args) {
		TotalWageForEachCompany dMart = new TotalWageForEachCompany("DMart", 20, 2, 10);
		TotalWageForEachCompany reliance = new TotalWageForEachCompany("Reliance", 10, 4, 20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println();
	}

}
