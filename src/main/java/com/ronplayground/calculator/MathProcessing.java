package com.ronplayground.calculator;

/**
 * Created by Ron Wieder on 12/29/2019
 */

public interface MathProcessing {
	String SEPARATOR = " ";
	String getKeyword(); // add
	char getSymbol(); // +
	 double doCalculation(double leftVal, double rightVal);


}
