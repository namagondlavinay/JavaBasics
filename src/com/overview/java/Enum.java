package com.overview.java;

// user defined data types
/*
 * Enums are used when we know all possible values at compile time, such as choices on a menu, 
 * rounding modes, command line flags, etc. 
 * It is not necessary that the set of constants in an enum type stay fixed for all time.
 */
//outside any class (Note enum keyword instead of class keyword) 

enum color{
	RED,BLUE,GREEN,YELLOW,INDIGO,VIOLATE;
}

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		color c1  = color.BLUE;
		color c2  = color.RED;
		color c3  = color.INDIGO;
		color c4  = color.VIOLATE;
		color c5  = color.GREEN;
		color c6  = color.YELLOW;
		System.out.println("This colors are availabe for booking a car\n"+c1+"\n"+c2+"\n"+c3+"\n"+c4+"\n"+c5+"\n"+c6);
	}

}
