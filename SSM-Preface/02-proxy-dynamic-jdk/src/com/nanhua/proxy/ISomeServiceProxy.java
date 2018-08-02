package com.nanhua.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.nanhua.service.ISomeService;
import com.nanhua.service.SomeServiceImpl;

public class ISomeServiceProxy
{
	//创建目标对象
	private ISomeService target = new SomeServiceImpl();
	
	public ISomeService getProxy()
	{
		return (ISomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new InvocationHandler()
				{
					//proxy：代理对象
					//method：目标方法
			        //args：目标方法的参数列表  
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
					{
						System.out.println("目标对象调用的方法：" + method.getName());
						Object result = method.invoke(target, args);
						if (result != null)
						{
							result = ((String) result).toUpperCase(); //进行增强（将小写字母改成大写字母）
							return result;
						}
						return null;
					}
				});
	}
}
