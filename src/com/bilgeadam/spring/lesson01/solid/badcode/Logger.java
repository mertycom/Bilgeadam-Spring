package com.bilgeadam.spring.lesson01.solid.badcode;

public class Logger {
	private DbLog dbLog;
	private XmlLog xmlLog;
	
	public Logger(DbLog dbLog, XmlLog xmlLog) {
		super();
		this.dbLog = dbLog;
		this.xmlLog = xmlLog;
	}
	
	public void LogYaz(LogType type, String value) {
		switch (type) {
		case Db: 
			DbLog.Log(value);
			break;
		case Xml: 
			XmlLog.Log(value);
			break;
		}
	}
}

