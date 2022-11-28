package com.bilgeadam.spring.lesson01.solid.cleancode;

public class XmlLog implements ILog{

	@Override
	public void LogYaz(String value) {
		System.out.println(value+ " xml e kaydedildi");		
	}
}
