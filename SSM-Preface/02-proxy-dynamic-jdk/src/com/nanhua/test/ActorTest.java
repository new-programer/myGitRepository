package com.nanhua.test;

import com.nanhua.proxy.ActorAgent;
import com.nanhua.service.Actor;

public class ActorTest
{
	public static void main(String[] args)
	{
		ActorAgent agent = new ActorAgent(); // 首先找到Agent
		Actor actor = agent.getProxy(); //通过Agent获得相关演员（代理目标）
		
		String singResult = actor.sing("东方红太阳升");
		System.out.println(singResult);
		
		String danceResult = actor.dance("小苹果");
		System.out.println(danceResult);
	}
}
