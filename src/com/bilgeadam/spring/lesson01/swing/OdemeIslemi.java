package com.bilgeadam.spring.lesson01.swing;


public class OdemeIslemi {
	private IOdeme odeme;
	
	public OdemeIslemi (IOdeme odeme) {
		this.odeme= odeme;
	}
	
	public String ode (double tutar) {
		return odeme.OdemeYap(tutar);
	}
	
}
