package com.nanhua.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.nanhua.service.Actor;
import com.nanhua.service.WangBaoQiang;

public class ActorAgent
{
	private Actor actor = new WangBaoQiang(); //����Ŀ�����
	
	//ͨ��Agent��������ǿ�Ķ���
	public Actor getProxy()
	{
		return (Actor) Proxy.newProxyInstance(actor.getClass().getClassLoader(),
				actor.getClass().getInterfaces(),
				new InvocationHandler()
				{
	            /**
	             * InvocationHandler�ӿ�ֻ������һ��invoke��������˶��������Ľӿڣ�
	             * ���ǲ��õ���ȥ����һ������ʵ�ָýӿڣ� ����ֱ��ʹ��һ�������ڲ�����ʵ�ָýӿڣ�new
	             * InvocationHandler() {}�������InvocationHandler�ӿڵ�����ʵ����
	             * 
	             * ��invoke��������ָ�����صĴ������ɵĹ��� proxy : �Ѵ�������Լ����ݽ���
	             * method���Ѵ������ǰ���õķ������ݽ��� args:�ѷ����������ݽ���
	             * ������ǿ�����invoke������ʹ��method.getName()�Ϳ���֪����ǰ���õ��Ǵ��������ĸ�����
	             */
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
					{
						if (method.getName().equals("sing"))
						{
							 //������������ʵĿ������sing����ȥ�����û�����
							System.out.println("��������ǿ��Agent,���������ң�");
							return method.invoke(actor, args);
						}
						
						if (method.getName().equals("dance"))
						{
							 //������������ʵĿ������dance����ȥ�����û�����
							System.out.println("��������ǿ��Agent,���������ң�");
							return method.invoke(actor, args);
						}
						return null;
					}
			
				});
	}
}
