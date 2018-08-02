package com.nanhua.adapters.impl;

import com.nanhua.adapters.IWorkerAdapter;
import com.nanhua.worker.ICooker;

public class CookerAdapter implements IWorkerAdapter
{

	@Override
	public String work(Object worker)
	{
		return ((ICooker)worker).cook(); //强转为ICooker对象
	}

	@Override
	public boolean support(Object worker)
	{
		return (worker instanceof ICooker); //判断是否是ICooker
	}

}
