package com.nanhua.test;

import com.nanhua.proxy.ActorAgent;
import com.nanhua.service.Actor;

public class ActorTest
{
	public static void main(String[] args)
	{
		ActorAgent agent = new ActorAgent(); // �����ҵ�Agent
		Actor actor = agent.getProxy(); //ͨ��Agent��������Ա������Ŀ�꣩
		
		String singResult = actor.sing("������̫����");
		System.out.println(singResult);
		
		String danceResult = actor.dance("Сƻ��");
		System.out.println(danceResult);
	}
}
