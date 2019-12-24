package com.ronplayground.calculator;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Ron Wieder on 12/24/2019
 */

public abstract class CalculateBase {
	@Getter @Setter private double leftVal;
	@Getter @Setter private double rightVal;
	@Getter @Setter private double result;

	public CalculateBase() {}

	public CalculateBase(double leftVal, double rightVal) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}

	public abstract void calculate();
}
