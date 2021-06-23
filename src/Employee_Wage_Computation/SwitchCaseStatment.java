package Employee_Wage_Computation;

public class SwitchCaseStatment {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int Wage_per_hour = 20;

	public static void main(String[] args) {
		System.out.println(" Welcome To Emloyee Wage");
		int Emp_wage_hour = 0;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		// used Switch case for Employe_Wage
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
		int Emp = Emp_wage_hour * Wage_per_hour;
		System.out.println("Wage of a employee per day : " + Emp);
	}
}