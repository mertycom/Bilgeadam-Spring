package com.bilgeadam.spring.lesson01.swing;

public class KrediKarti implements IOdeme{

	@Override
	public String OdemeYap(double tutar) {
		return "Kredi kartı ile "+ tutar + " TL ödeme yapıldı...";
	}

}
