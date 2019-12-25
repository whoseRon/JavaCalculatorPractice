package com.ronplayground.calculator;

/**
 * Created by Ron Wieder on 12/25/2019
 */

public class InvalidStatementException extends Exception {
	public InvalidStatementException(String reason, String statement) {
		super(reason + ": " + statement);
	};

	public InvalidStatementException(String reason, String statement, Throwable cause) {
		super(reason + ": " + statement, cause);
	};
}
