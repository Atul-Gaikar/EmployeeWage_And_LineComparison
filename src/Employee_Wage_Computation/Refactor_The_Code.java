package Employee_Wage_Computation;

public class Refactor_The_Code {
	// public static final in IS_PART_TIME = 1;
	// public static final in IS_FULL_TIME = 2;
	// public static final in Wage_per_hour = 20;
	// public static final in Total_Working_days = 20;
	// public static final in Maximum_work_hours = 100;
	static void Emp_wage(int Wage_per_hour, int Total_Working_days, int Maximum_work_hours) {
		System.out.println("Welcome To Emloyee Wage");
		int Emp_wage_hour = 0;
		int Monthly_wage = 0;
		int Working_days = 0, total_emp_hours = 0;
		while (Working_days < Total_Working_days && total_emp_hours <= Maximum_work_hours) {
			Working_days++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			// checking of his work time
			switch (empCheck) {
			case 1:
				Emp_wage_hour = 8;
				break;
			case 2:
				Emp_wage_hour = 4;
				break;
			default:
				Emp_wage_hour = 0;
			}
			// calculation of wage and time of an Employee in a month
			total_emp_hours += Emp_wage_hour;
			int Emp = Emp_wage_hour * Wage_per_hour;
			System.out.println("Wage of a employee at day " + Working_days + "\t" + Emp + "\t" + "Work time :" + " "
					+ Emp_wage_hour);
			Monthly_wage += Emp;
		}
		System.out.println("Monthly Wages of an Employee : " + Monthly_wage + "\n"
				+ "Monthly Working Hours of an employee : " + total_emp_hours + "hours");

	}

	public static void main(String[] args) {
		Emp_wage(30, 24, 100);
	}
}
