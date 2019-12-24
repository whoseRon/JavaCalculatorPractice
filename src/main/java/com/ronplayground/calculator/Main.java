package com.ronplayground.calculator;

public class Main {

    public static void main(String[] args) {
	float floatVal = 1.0f;
	double doubleVal = 4.0d;
	byte byteVal = 7;
	short shortVal = 7;
	long longVal = 5;

	short result1 = byteVal;
	short result2 = (short)longVal;
	long result3 = shortVal;

        System.out.println("Success");
    }
}
