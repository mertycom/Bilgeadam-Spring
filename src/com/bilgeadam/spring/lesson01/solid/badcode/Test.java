package com.bilgeadam.spring.lesson01.solid.badcode;

public class Test {

	public static void main(String[] args) {

		DbLog dbLog = new DbLog();
		XmlLog xmlLog = new XmlLog();
		Logger logger = new Logger(dbLog, xmlLog);
		logger.LogYaz(LogType.Xml, "303 nolu hata kodu :");

	}

}
