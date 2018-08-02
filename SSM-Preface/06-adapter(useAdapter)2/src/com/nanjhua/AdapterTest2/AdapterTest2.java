package com.nanjhua.AdapterTest2;

import java.util.ArrayList;
import java.util.List;

import com.nanhua.adapters.IWorkerAdapter;
import com.nanhua.adapters.impl.CookerAdapter;
import com.nanhua.adapters.impl.ProgramerAdapter;
import com.nanhua.worker.ICooker;
import com.nanhua.worker.IProgramer;
import com.nanhua.worker.impl.AliProgramer;
import com.nanhua.worker.impl.JdCooker;

public class AdapterTest2
{

	public static void main(String[] args)
	{
		//创建具体对象
		ICooker jdCooker = new JdCooker();
		IProgramer aliProgramer = new AliProgramer();
		
		//将对象加入数组
		Object workers[] = {jdCooker,aliProgramer};
		
		//进行变量输出结果
		for (Object worker : workers)
		{
			IWorkerAdapter adapter = getAdapter(worker); //取得对应的适配器
			
			//进行判断
			if (adapter != null)
			{
				System.out.println(adapter.work(worker));//输出适配后的对象的“工作情况”
			}
			else
			{
				System.out.println("未找到响应的适配器");
			}
		}
	}

	private static IWorkerAdapter getAdapter(Object worker)
	{
		//取得所有适配器
		List<IWorkerAdapter> adapters = getAllAdapter();
		
		//遍历所有适配器，若找到合适的适配器就返回
		for (IWorkerAdapter adapter : adapters)
		{
			if (adapter.support(worker))
			{
				return adapter;
			}
		}
		
		return null;
	}

	//适配器收集方法
	private static List<IWorkerAdapter> getAllAdapter()
	{
		List<IWorkerAdapter> adapters = new ArrayList<>();
		
		//创建各种类型的适配器对象并添加到adapters中去
		IWorkerAdapter cAdapter = new CookerAdapter();
		IWorkerAdapter pAdapter = new ProgramerAdapter();
		adapters.add(cAdapter);
		adapters.add(pAdapter);
		
		return adapters; //返回
	}

}
