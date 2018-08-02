package com.nanhua.service;

public class SomeServiceImpl implements ISomeService
{

	@Override
	public String doFirst()
	{
		System.out.println("执行 doFirst()方法");
		return "abcde";
	}

	@Override
	public void doSecond()
	{
		System.out.println("执行 doSecond()方法");
	}
}
