package com.nanhua.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTest
{
	public static void main(String[] args)
	{
		Logger logger = LogManager.getLogger(MyTest.class);
		logger.fatal("fatal message");
		logger.error("error message");
		logger.warn("warn message");
		logger.info("info message");
		logger.debug("debug message");
		logger.trace("trace message");
	}
}
