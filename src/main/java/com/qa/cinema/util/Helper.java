package com.qa.cinema.util;

import javax.ejb.ObjectNotFoundException;

import com.google.gson.Gson;

public class Helper {
	Gson gson;
	//private static final Logger LOGGER;
	
	public Helper() {
		gson = new Gson();
		// Logger =;
	}
	
	public Object fromJson(String json, Object toObject) throws ClassCastException, ClassNotFoundException, ObjectNotFoundException {
		return gson.fromJson(json, toObject.getClass());
	}
	
	public String toJson(Object fromObject) throws ClassCastException, ClassNotFoundException, ObjectNotFoundException {
		return gson.toJson(fromObject);
	}

}
