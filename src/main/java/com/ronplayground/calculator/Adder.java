package com.ronplayground.calculator;

/**
 * Created by Ron Wieder on 12/24/2019
 */

public class Adder extends CalculateBase{

	public Adder(){};

	public Adder(double leftVal, double rightVal){
		super(leftVal, rightVal);
	};

	@Override
	public void calculate() {
		double value = getLeftVal() + getRightVal();
		setResult(value);
	}
}
