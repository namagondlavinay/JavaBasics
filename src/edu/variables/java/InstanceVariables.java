package edu.variables.java;
/**
 * @author VINAY KUMAR Instance variables are non-static variables and are
 *         declared in a class outside any method, constructor or block. As
 *         instance variables are declared in a class, these variables are
 *         created when an object of the class is created and destroyed when the
 *         object is destroyed. Unlike local variables, we may use access
 *         specifiers for instance variables. If we do not specify any access
 *         specifier then the default access specifier will be used.
 *         Initilisation of Instance Variable is not Mandatory. Its default
 *         value is 0 Instance Variable can be accessed only by creating
 *         objects.
 */
class InstanceVariables {
	// instance variables
	int engmarks;
	int mathmarks;
	int hindhimarks;
}

class marks {

	public static void main(String[] args) {
		// student1 object
		InstanceVariables stu1 = new InstanceVariables();
		stu1.engmarks = 50;
		stu1.mathmarks = 70;
		stu1.hindhimarks = 65;
		// student2 object
		InstanceVariables stu2 = new InstanceVariables();
		stu2.engmarks = 80;
		stu2.mathmarks = 75;
		stu2.hindhimarks = 50;
		// displaying stu1 object marks
		System.out.println("marks for first student");
		System.out.println(stu1.engmarks);
		System.out.println(stu1.mathmarks);
		System.out.println(stu1.hindhimarks);
		// displaying stu2 object marks
		System.out.println("marks for second student");
		System.out.println(stu2.engmarks);
		System.out.println(stu2.mathmarks);
		System.out.println(stu2.hindhimarks);

	}

}
