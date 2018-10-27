package com.cybrilla.exception;

public class InSufficientFundsException extends RuntimeException 
{
	public InSufficientFundsException(String errorMessage)
	{
		super(errorMessage);
	}

}
