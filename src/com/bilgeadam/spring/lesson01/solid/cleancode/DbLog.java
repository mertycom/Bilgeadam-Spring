package com.bilgeadam.spring.lesson01.solid.cleancode;

public class DbLog implements ILog{

	@Override
	public void LogYaz(String value) {
		System.out.println(value+ " db ye kaydedildi");
	}
	
}
