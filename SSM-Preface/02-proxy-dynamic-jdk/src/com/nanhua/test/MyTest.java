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
		System.out.println("������ǿ���Ч����" + result);		
		ss.doSecond();
	}
//	public static void main(String[] args)
//	{
//		ISomeService target = new SomeServiceImpl();  //�������������
//		
//		//���ɶ�̬����
//		ISomeService service = (ISomeService) Proxy.newProxyInstance(
//				target.getClass().getClassLoader(), //Ŀ���������
//				target.getClass().getInterfaces(),   //Ŀ������ʵ�ֵĽӿ� ����
//				new InvocationHandler()  //�����ڲ���
//				{
//					//proxy���������
//					//method��Ŀ�귽��
//			        //args��Ŀ�귽���Ĳ����б�  
//
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
//					{
//						System.out.println("�ô������proxy�����Լ��ķ�����" + proxy.getClass());
//						System.out.println("�鿴Ŀǰ���������õķ�����" + method.getName());
//						//����Ŀ�귽��
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
//		System.out.println("result = " + result); //��ӡ����ִ�н��
//		service.doSecond();
//	}
}
