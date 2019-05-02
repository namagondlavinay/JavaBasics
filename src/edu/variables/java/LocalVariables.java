/**
 * 
 */
package edu.variables.java;

/**
 * @author VINAY KUMAR
 *
 */
public class LocalVariables {

	
	public void studentAge() { // method
		
		int age = 0;//local variables
		age = age +5;//local variables
		System.out.println("student age is"+age);
		
		
	}
	
	public void studentClass() {
		
		char sclass='1';
		int age = 5;
		System.out.println("student class is"+sclass+"student age is"+age);
		
		
	}
	public void studentDetails() {
		String sname= "vinay";
		int age =5;
		char sclass = '1';
		System.out.println("student name is = \n"+sname+"student age is\n"+age+"student class is\n"+sclass);
	} 
	
	
		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creating object of class and calling the method through obj
		
		LocalVariables student = new LocalVariables();
		student.studentAge();
		student.studentClass();
		//accessing local variables outside the method 
		
		//System.out.println("age is"+age); it shows error

	}

}
