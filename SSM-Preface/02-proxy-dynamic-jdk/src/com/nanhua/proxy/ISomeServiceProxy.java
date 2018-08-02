package com.nanhua.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.nanhua.service.ISomeService;
import com.nanhua.service.SomeServiceImpl;

public class ISomeServiceProxy
{
	//����Ŀ�����
	private ISomeService target = new SomeServiceImpl();
	
	public ISomeService getProxy()
	{
		return (ISomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new InvocationHandler()
				{
					//proxy���������
					//method��Ŀ�귽��
			        //args��Ŀ�귽���Ĳ����б�  
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
					{
						System.out.println("Ŀ�������õķ�����" + method.getName());
						Object result = method.invoke(target, args);
						if (result != null)
						{
							result = ((String) result).toUpperCase(); //������ǿ����Сд��ĸ�ĳɴ�д��ĸ��
							return result;
						}
						return null;
					}
				});
	}
}
