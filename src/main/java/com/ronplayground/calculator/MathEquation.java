package com.ronplayground.calculator;

/**
 * Created by Ron Wieder on 24/12/2019
 */
public class MathEquation {
	public double leftVal;
	public double rightVal;
	public double result;
	public char opCode;

	public void execute(){
		switch(opCode) {
			case 'a':
				result = leftVal + rightVal;
				break;
			case 's':
				result = leftVal - rightVal;
				break;
			case 'd':
				result = leftVal / rightVal;
				break;
			case 'm':
				result = leftVal * rightVal;
				break;
			default:
				System.out.println("Error - invalid shit");
				result = 0.0d;
				break;
		}
	}

}
