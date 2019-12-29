package com.ronplayground.calculator;

/**
 * Created by Ron Wieder on 12/24/2019
 */

public class Adder extends CalculateBase implements MathProcessing{

	public Adder(){};

	public Adder(double leftVal, double rightVal){
		super(leftVal, rightVal);
	};

	@Override
	public void calculate() {
		double value = getLeftVal() + getRightVal();
		setResult(value);
	}

	public String getKeyword() {
		return "add";
	}

	public char getSymbol() {
		return '+';
	}

	public double doCalculation(double leftVal, double rightVal) {
		setLeftVal(leftVal);
		setRightVal(rightVal);
		calculate();

		return getResult();
	}
}
