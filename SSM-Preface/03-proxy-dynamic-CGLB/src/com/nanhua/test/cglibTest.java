package com.nanhua.test;

import com.nanhua.factory.MyCglibProxyFactory;
import com.nanhua.service.SomeService;

public class cglibTest
{
	public static void main(String[] args)
	{
		//创建目标对象
		SomeService target = new SomeService();
		//创建代理对象，并使用目标对象对其进行初始化
		SomeService service = new MyCglibProxyFactory(target).createProxy();
		
		//此时执行的内容就是对目标对象增强过的内容
		String result = service.doFirst();
		System.out.println(result);
		service.doSecond();
	}

}
