package com.nanjhua.AdapterTest2;

import com.nanhua.adapters.impl.WorkerAdapter;
import com.nanhua.worker.ICooker;
import com.nanhua.worker.IProgramer;
import com.nanhua.worker.impl.AliProgramer;
import com.nanhua.worker.impl.JdCooker;

public class AdapterTest2
{

	public static void main(String[] args)
	{
		ICooker jdCooker = new JdCooker();
		IProgramer aliProgramer = new AliProgramer();
		
		Object workers[] = {jdCooker,aliProgramer};
		WorkerAdapter adapter = new WorkerAdapter();
		
		for (Object worker : workers)
		{
			System.out.println(adapter.work(worker));
		}
	}

}
