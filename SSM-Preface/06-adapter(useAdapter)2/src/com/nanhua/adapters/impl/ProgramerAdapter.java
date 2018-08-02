package com.nanhua.adapters.impl;

import com.nanhua.adapters.IWorkerAdapter;
import com.nanhua.worker.impl.AliProgramer;

public class ProgramerAdapter implements IWorkerAdapter
{

	@Override
	public String work(Object worker)
	{
		return ((AliProgramer)worker).code();
	}

	@Override
	public boolean support(Object worker)
	{
		return (worker instanceof AliProgramer); 
	}

}
