package com.nanhua.adapters.impl;

import com.nanhua.adapters.IWorkerAdapter;
import com.nanhua.worker.ICooker;
import com.nanhua.worker.IProgramer;

public class WorkerAdapter implements IWorkerAdapter
{
	//适配器接口实现类
	@Override
	public String work(Object worker)
	{
		String workContent = "";
		
		if (worker instanceof ICooker)
			workContent = ((ICooker) worker).cook();
		else if(worker instanceof IProgramer)
			workContent = ((IProgramer) worker).code();
		
		return workContent;
	}

}
