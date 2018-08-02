package com.nanhua.test;

import com.nanhua.proxy.ISomeServiceProxy;
import com.nanhua.service.ISomeService;

/**
 * @author Administrator
 *
 */
public class MyTest
{
	public static void main(String[] args)
	{
		ISomeServiceProxy proxy = new ISomeServiceProxy();
		ISomeService ss = proxy.getProxy();
		String result = ss.doFirst();
		System.out.println("代理增强后的效果：" + result);		
		ss.doSecond();
	}
//	public static void main(String[] args)
//	{
//		ISomeService target = new SomeServiceImpl();  //创建被代理对象
//		
//		//生成动态代理
//		ISomeService service = (ISomeService) Proxy.newProxyInstance(
//				target.getClass().getClassLoader(), //目标类加载器
//				target.getClass().getInterfaces(),   //目标类所实现的接口 所有
//				new InvocationHandler()  //匿名内部类
//				{
//					//proxy：代理对象
//					//method：目标方法
//			        //args：目标方法的参数列表  
//
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
//					{
//						System.out.println("用代理对象proxy调用自己的方法：" + proxy.getClass());
//						System.out.println("查看目前代理对象调用的方法：" + method.getName());
//						//调用目标方法
//						Object result = method.invoke(target, args);
//						if (result != null)
//						{
//							result = ((String) result).toUpperCase();
//						}
//						return result;
//					}
//				});
//		
//		
//		String result = service.doFirst();
//		System.out.println("result = " + result); //打印代理执行结果
//		service.doSecond();
//	}
}
