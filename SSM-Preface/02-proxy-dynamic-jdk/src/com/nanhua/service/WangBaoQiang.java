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
		this.name = "王宝强";
	}
	@Override
	public String sing(String singName)
	{
		System.out.println(getName() + "开始演唱《" + singName + "》歌");
		return "歌唱完了，欢迎捧场！";
	}

	@Override
	public String dance(String danceName)
	{
		System.out.println(getName() + "开始表演《" + danceName + "》舞蹈");
		return "舞跳完了，欢迎捧场！";
	}
}
