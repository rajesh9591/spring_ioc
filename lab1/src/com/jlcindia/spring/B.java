package com.jlcindia.spring;

public class B 
{
	private int b;
	private String msg;
	public B(int b, String msg)
	{
		this.b = b;
		this.msg = msg;
	}
	public void showB()
	{
		System.out.println("B-showB()");
		System.out.println(b);
		System.out.println(msg);
	}
}
