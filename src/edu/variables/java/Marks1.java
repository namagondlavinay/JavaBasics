package edu.variables.java;

public class Marks1 {   
	    //These variables are instance variables. 
	    //These variables are in a class and are not inside any function 
	    int engMarks; 
	    int mathsMarks; 
	    int phyMarks; 
	} 
	  
	class MarksDemo 
	{ 
	    public static void main(String args[]) 
	    {   //first object 
	        Marks1 obj1 = new Marks1(); 
	        obj1.engMarks = 50; 
	        obj1.mathsMarks = 80; 
	        obj1.phyMarks = 90; 
	  
	        //second object 
	        Marks1 obj2 = new Marks1(); 
	        obj2.engMarks = 80; 
	        obj2.mathsMarks = 60; 
	        obj2.phyMarks = 85; 
	  
	        //displaying marks for first object 
	        System.out.println("Marks for first object:"); 
	        System.out.println(obj1.engMarks); 
	        System.out.println(obj1.mathsMarks); 
	        System.out.println(obj1.phyMarks); 
	      
	        //displaying marks for second object 
	        System.out.println("Marks for second object:"); 
	        System.out.println(obj2.engMarks); 
	        System.out.println(obj2.mathsMarks); 
	        System.out.println(obj2.phyMarks); 
	    } 
	} 

