package edu.variables.java;

public class Example1 {

	public static void main(String[] args) {

		/*
		 * adding two nums
		 */

		int firstno = 10, secondno = 20, result;
		result = firstno + secondno;
		System.out.println("adding of two nos=" + result);

		/*
		 * widening
		 */

		int price = 20;
		float total_price = price;
		System.out.println(price);
		System.out.println(total_price);
		/*
		 * narrowing a.k.a type casting
		 */

		float emp_sal = 12.2f;
		// int total_emp_sal = emp_sal; Error
		int total_emp_sal = (int) emp_sal;
		System.out.println(emp_sal);
		System.out.println(total_emp_sal);

		double mar_sal = 10500.74;
		long total_sal = (long) mar_sal;
		System.out.println(mar_sal);
		System.out.println(total_sal);
		
		//overflow
		
		int tax = 800;
		
		byte ctax = (byte)tax;
		
		System.out.println(ctax);
		
		
// adding lower type
		
		byte first = 10,second = 20;
		//byte result = first + second ; error fist + second integer data type
		byte total=(byte)(first+second);
		System.out.println(total);
		
		
	}

}
