package com.nanhua.test;

import com.nanhua.proxy.SomeServiceProxy;
import com.nanhua.service.ISomeService;

public class MyTest
{
	public static void main(String[] args)
	{
		ISomeService service = new SomeServiceProxy();
		String result = service.doFirst();
		System.out.println("the result is " + result);
		service.doSecond();
	}
}
