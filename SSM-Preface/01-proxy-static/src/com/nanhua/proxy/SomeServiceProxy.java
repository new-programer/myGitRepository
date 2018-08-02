package com.nanhua.proxy;

import com.nanhua.service.ISomeService;
import com.nanhua.service.SomeServiceImpl;

public class SomeServiceProxy implements ISomeService
{
	private ISomeService target;
	
	public SomeServiceProxy()
	{
		System.out.println("δ��̬֮ǰ��" + target);
		target = new SomeServiceImpl();
	}
	
	@Override
	public String doFirst()
	{
		//���������Ŀ�귽��
		String result = target.doFirst();
		//������ǿ��ת���ɴ�д��
		return result.toUpperCase();
	}

	@Override
	public void doSecond()
	{
		target.doSecond();
	}

}
