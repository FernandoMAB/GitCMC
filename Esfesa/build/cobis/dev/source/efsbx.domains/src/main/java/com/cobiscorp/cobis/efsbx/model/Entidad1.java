package com.cobiscorp.cobis.efsbx.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class Entidad1 {

	public static final String EN_1YADLIBOK_364 = "EN_1YADLIBOK_364";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "Entidad1";
	
	
	public static final Property<String> NOMBRE = new Property<String>("nombre", String.class, false);
	
	public static final Property<String> APELLIDO = new Property<String>("apellido", String.class, false);
	
	public static final Property<Integer> EDAD = new Property<Integer>("edad", Integer.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
