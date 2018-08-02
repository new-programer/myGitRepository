package com.nanhua.aboutCallBack;

public class Li 
{
	public void executeMessage(CallBack callBack, String question)
	{
		System.out.println("wang的问题是：" + question);
		
		for (int i = 0; i< 3; i++)
		{
			System.out.println("li正在做自己的事情");
			
			String answer = "2";
			
			callBack.solve(answer); //B类回调A类的方法D
		}
	}
}
