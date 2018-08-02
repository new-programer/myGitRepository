package com.nanhua.aboutCallBack;

/**
* <p>Title: Wang</p>
* <p>Description:</p>
* <p>Company: USC</p> 
* @author peterGao
* @date 2018年5月22日 下午12:48:35
*/
public class Wang implements CallBack
{
	//建立一个B类方法的引用li
	private Li li;
	public Wang(Li li)
	{
		this.li = li;
	}
	
	public void askQuestion(final String question)
	{
		//新建一个进程进行异步
		new Thread(new Runnable()
				{

					@Override
					public void run()
					{
						//参数Wang.this的目的是给函数executeMessage()传Wang的对象给callBack接口引用实现多态
						li.executeMessage(Wang.this, question); //A类调用B类方法的C函数
					}
			
				}).start();
		
		play();
	}
	
	
	private void play()
	{
		System.out.println("我先出去玩了，知道答案后告诉我");
	}

	//粗方法即为回调函数
	@Override
	public void solve(String result)
	{
		System.out.println("计算结果是：" + result);
	}
	
}
