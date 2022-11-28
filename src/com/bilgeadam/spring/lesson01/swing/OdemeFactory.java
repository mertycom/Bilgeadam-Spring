package com.bilgeadam.spring.lesson01.swing;

import java.lang.reflect.InvocationTargetException;

public class OdemeFactory {
	
	public IOdeme getType(String type)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return (IOdeme) Class.forName(type).getDeclaredConstructor().newInstance();
        
    }
}
