package com.jlcindia.spring;

public class A 
{
	private int a;
	private String msg;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void showA()
	{
		System.out.println("A-showA()");
		System.out.println(a);
		System.out.println(msg);
	}
}
