package com.bilgeadam.spring.lesson01.solid.cleancode;

public class Test {

	public static void main(String[] args) {
		
		//dependency injection
		
		Logger logger = new Logger(new XmlLog());
		logger.LogYaz("303 nolu hata kodu :");

	}
}
