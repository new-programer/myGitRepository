package com.nanhua.proxy;

import com.nanhua.service.ISomeService;
import com.nanhua.service.SomeServiceImpl;

public class SomeServiceProxy implements ISomeService
{
	private ISomeService target;
	
	public SomeServiceProxy()
	{
		System.out.println("未多态之前：" + target);
		target = new SomeServiceImpl();
	}
	
	@Override
	public String doFirst()
	{
		//代理类调用目标方法
		String result = target.doFirst();
		//进行增强（转换成大写）
		return result.toUpperCase();
	}

	@Override
	public void doSecond()
	{
		target.doSecond();
	}

}
