package com.ronplayground.calculator;

public class Main {

    public static void main(String[] args) {
	double val1 = 50.0d;
	double val2 = 25.0d;
	double result;
	char opCode = 'a';

	if(opCode == 'a')
		result = val1 + val2;
	else if(opCode == 'a')
		result = val1 - val2;
	else if(opCode == 'a')
		result = val1 / val2;
	else if(opCode == 'm')
		result = val1 * val2;
	else {
		System.out.println("Error - invalid shit");
		result = 0.0d;
	}
	    System.out.println(result);
    }
}
