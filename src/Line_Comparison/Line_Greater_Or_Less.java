package Line_Comparison;

import java.util.Scanner;

public class Line_Greater_Or_Less {
	double LineLength()
	{
		Scanner sc=new Scanner(System.in);
		int x1= sc.nextInt(); 
		int x2= sc.nextInt();
		int y1= sc.nextInt();
		int y2= sc.nextInt();
	   	int x= (x2-x1) * (x2-x1);
	    	int y= (y2-y1) * (y2-y1);
		double length= Math.sqrt(x+y);
		return length;
	}
	
	void compare()
	{	System.out.println("Enter the coordinates of first line");
		String p= String.valueOf(LineLength());
		System.out.println("Enter the coordinates of second line");
		String q= String.valueOf(LineLength());
		if(p.compareTo(q)==0)
		{
			System.out.println("Lines are equal");
		}
		else if(p.compareTo(q)<0)
		{
			System.out.println("The first line is smaller in length compared to the second line");
		}
		else if(p.compareTo(q)>0)
		{
			System.out.println("The first line is larger in length compared to the second line");
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Line Comparison Computation Program ");
		Line_Greater_Or_Less lc=new Line_Greater_Or_Less();
		Scanner sc=new Scanner(System.in);
		lc.compare();
	}
	

}
