package Employee_Wage_Computation;

public interface WagesForAMonth {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int Wage_per_hour = 20;
	public static final int Total_Working_days = 20;

	public static void main(String[] args) {
		System.out.println(" Welcome To Emloyee Wage");
		int Emp_wage_hour = 0;
		int Monthly_wage = 0;
		// for loop from day 1 to day 20 wage working days in month
		for (int day = 1; day <= Total_Working_days; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			// checking for employee work time
			switch (empCheck) {
			case IS_FULL_TIME:
				Emp_wage_hour = 8;
				break;
			case IS_PART_TIME:
				Emp_wage_hour = 4;
				break;
			default:
				Emp_wage_hour = 0;
			}
			// calculation of Wage per hour and monthly wage of an Employee
			int Emp = Emp_wage_hour * Wage_per_hour;
			System.out.println("Wage of a employee at day " + day + "\t" + Emp);
			Monthly_wage += Emp;
		}
		System.out.println("Monthly Wages of an Employee : " + Monthly_wage);
	}
}