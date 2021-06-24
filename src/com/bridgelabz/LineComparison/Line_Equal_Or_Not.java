package com.bridgelabz.LineComparison;

import java.util.Scanner;

public class Line_Equal_Or_Not {
	double LineLength() {

		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		int x = (x2 - x1) * (x2 - x1);
		int y = (y2 - y1) * (y2 - y1);
		double length = Math.sqrt(x + y);
		return length;
	}

	void equal() {
		System.out.println("Enter Coordinates of the First Line");
		String p = String.valueOf(LineLength());
		System.out.println("Enter Coordinates of the second Line");
		String q = String.valueOf(LineLength());
		if (p.equals(q)) {
			System.out.println("Lines are equal");

		} else {
			System.out.println("Line are not equal");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program ");
		Line_Equal_Or_Not lc = new Line_Equal_Or_Not();
		Scanner sc = new Scanner(System.in);
		lc.equal();
	}

}
