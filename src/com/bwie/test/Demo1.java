package com.bwie.test;

public class Demo1 implements Test{

	@Override
	public void a() {
		System.out.println("这是接口的运用!");
		final int a=10,b=20;    
		double c;
		c=(double)(a+b);   
		System.out.println(a+"+"+b+"="+c);
	}

	@Override
	public void b() {
		System.out.println("啦啦啦啦啦啦啦啦-------------------");
	}

}
