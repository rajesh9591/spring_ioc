package com.jlcindia.spring;

public class Account
{
	private int accno;
	private String atype;
	private double bal;
	private Account()
	{
		System.out.println("Account-D.C");
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public String toString() 
	{
		return "" + accno + "\t" + atype + "\t" + bal;
	}
}
