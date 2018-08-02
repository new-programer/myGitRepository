package com.nanhua.aboutCallBack;

public class CallBackTest
{
	public static void main(String[] args)
	{
		Li li = new Li();
		Wang wang = new Wang(li);
		
		wang.askQuestion("1 + 1 = ?");
	}
}
