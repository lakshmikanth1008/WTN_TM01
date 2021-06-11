package com.wipro.eb.entity;

public class Commercial extends Connection {

	public Commercial(int previousReading, int currentReading, float[] slabs) {
		super(previousReading, currentReading, slabs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float computeBill() {
		// TODO Auto-generated method stub
		int p=currentReading-previousReading;
		float d=0.0f;
		if(p>100)
		{
			d=(50*slabs[0]+50*slabs[1]+(p-100)*slabs[2]);
		}
		else if(p>50)
		{
			d=50*slabs[0]+(p-50)*slabs[1];
		}
		else 
		{
			d=(p*slabs[0]);
		}
		if(d>=10000)
		{
			return d*1.09f;
		}
		else if(d>=5000)
		{
			return d*1.06f;
		}
		else
		{
			return d*1.02f;
		}
	}

}
