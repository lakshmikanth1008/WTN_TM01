package com.wipro.eb.entity;

public class Domestic extends Connection
{

	public Domestic(int previousReading, int currentReading, float[] slabs) {
		super(previousReading, currentReading, slabs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float computeBill() {
		// TODO Auto-generated method stub
		int p=currentReading-previousReading;
		double d = 0;
		if(p>0 && p<=50)
		{
			d=(p*2.3);
		}
		else if(p>50 && p<=100)
		{
			d=(p*(2.3+4.2));
		}
		else if(p>100)
		{
			d=(p*(2.3+4.2+5.5));
		}
		if(d>=10000)
		{
			return (float) (d+(d*0.09));
		}
		else if(d>=5000)
		{
			return (float) (d+(d*0.06));
		}
		else
		{
			return (float) (d+(d*0.02));
		}
	}
	
	
	

}
