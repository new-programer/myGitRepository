package com.nanhua.worker.impl;

public class AdapterTest1
{

	public static void main(String[] args)
	{
		AliProgramer alip = new AliProgramer();
		JdCooker jdp = new JdCooker();
		
		System.out.println(alip.code());
		System.out.println(jdp.cook());
	}

}
