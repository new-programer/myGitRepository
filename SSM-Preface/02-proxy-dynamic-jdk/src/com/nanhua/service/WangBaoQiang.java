package com.nanhua.service;

public class WangBaoQiang implements Actor
{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public WangBaoQiang()
	{
		this.name = "����ǿ";
	}
	@Override
	public String sing(String singName)
	{
		System.out.println(getName() + "��ʼ�ݳ���" + singName + "����");
		return "�質���ˣ���ӭ������";
	}

	@Override
	public String dance(String danceName)
	{
		System.out.println(getName() + "��ʼ���ݡ�" + danceName + "���赸");
		return "�������ˣ���ӭ������";
	}
}
