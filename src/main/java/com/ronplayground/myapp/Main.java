package com.ronplayground.myapp;

import com.ronplayground.calculator.Adder;
import com.ronplayground.calculator.DynamicHelper;
import com.ronplayground.calculator.MathProcessing;

public class Main {

    public static void main(String[] args) {

	    String[] statements = {
	    		"add 25.0 92.0",
    };

	    DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
	    		new Adder()
	    });

	    for(String statement:statements) {
	    	String output = helper.process(statement);
		    System.out.println(output);
	    }
    }
