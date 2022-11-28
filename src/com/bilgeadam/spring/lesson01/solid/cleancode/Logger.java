package com.bilgeadam.spring.lesson01.solid.cleancode;


public class Logger {	
	public ILog iLog;
	
	public Logger (ILog iLog) {
		this.iLog = iLog;
	}
	
	public void LogYaz(String value) {
		iLog.LogYaz(value);
	}
	
}

