package com.nanhua.test;

import org.apache.log4j.Logger;

public class MyTest
{
	public static void main(String[] args)
	{
		Logger logger = Logger.getLogger(MyTest.class);
		logger.fatal("fatal message");
		logger.error("error message");
		logger.warn("warn message");
		logger.info("info message");
		logger.debug("debug message");
		logger.trace("trace message");
	}
}
