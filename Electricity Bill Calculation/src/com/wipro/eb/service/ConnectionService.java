package com.wipro.eb.service;

import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;

public class ConnectionService {
	public boolean validate(int currentReading, int previousReading, String type) throws InvalidReadingException,InvalidConnectionException
	{
		
	}


	public float calculateBillAmt(int currentReading, int previousReading, String type)
	{
		return 0;
		
	}
	public String generateBill(int currentReading, int previousReading, String type)
	{
		return "";
	}


}
