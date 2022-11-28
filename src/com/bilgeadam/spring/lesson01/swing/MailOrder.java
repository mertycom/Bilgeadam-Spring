package com.bilgeadam.spring.lesson01.swing;

public class MailOrder implements IOdeme{
	
	@Override
	public String OdemeYap(double tutar) {
		return "Mail order ile "+ tutar + " TL ödeme yapıldı...";
	}

}
