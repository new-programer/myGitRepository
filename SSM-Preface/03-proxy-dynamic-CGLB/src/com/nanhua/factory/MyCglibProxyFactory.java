package com.nanhua.factory;

import java.lang.reflect.Method;

import com.nanhua.service.SomeService;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/*创建代理类的工厂。该类要实现 MethodInterceptor 接口*/
/**
* <p>Title: MyCglibFactory</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author Administrator
* @date 2018年5月22日 上午11:00:49
*/
public class MyCglibProxyFactory implements MethodInterceptor
{
	//声明目标对象类的成员变量，并创建以目标类对象为参数的构造器，用于接收目标对象
	private SomeService target;
	public MyCglibProxyFactory(SomeService target)
	{
		this.target = target;
	}
 
	//定义代理类的构建方法
	public SomeService createProxy()
	{
		Enhancer enhancer = new Enhancer(); //创建增强器
		enhancer.setSuperclass(SomeService.class);// 指定父类
		enhancer.setCallback(this); //设置回调接口对象
		
		//使用增强器创建代理对象并返回
		return (SomeService) enhancer.create(); 
	}
	
	//定义回掉接口方法（对目标类的增强在这里完成）,其实这个就是回调函数
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, 
			MethodProxy methodProxy) throws Throwable 
	{
	/*	intercept()方法中各参数的意义：
		* proxy：代理对象
		* method：代理对象的方法，即增强过的业务方法
		* args[]：方法参数
		* methodProxy：代理对象方法的代理对象
		* */
		
		/*
        //调用目标类业务方式一：通过调用代理类proxy（即目标类的子类）的父类方法执行---------(测试通过 -> 可行)
		Object result = methodProxy.invokeSuper(proxy, args);
		*/
		//调用目标类业务方式二：直接调用目标对象的业务方法执行
		Object result = methodProxy.invoke(target, args);
		if (result != null)
		{
			return ((String) result).toUpperCase();
		}
		return null;
	}

}
