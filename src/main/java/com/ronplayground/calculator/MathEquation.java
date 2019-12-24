package com.ronplayground.calculator;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Ron Wieder on 24/12/2019
 */
public class MathEquation {

	@Setter @Getter private double leftVal;
	@Setter @Getter private double rightVal;
	@Getter private double result;
	@Setter @Getter private char opCode;

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
