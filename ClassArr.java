package com.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ClassArr {
	public static void main(String[] args) {
		List<LinkedHashMap<String,String>> emp=new ArrayList<LinkedHashMap<String,String>>();
		LinkedHashMap<String,String>m1=new LinkedHashMap<String, String>();
		m1.put("name","Ranjitha");
		m1.put("email","ranjinithi91@gmail.com");
		m1.put("course","Java");
		
		LinkedHashMap<String,String>m2=new LinkedHashMap<String, String>();
		m2.put("name","saji");
		m2.put("email","saji91@gmail.com");
		m2.put("course","sql");
		
		LinkedHashMap<String,String>m3=new LinkedHashMap<String, String>();
		m3.put("name","bala");
		m3.put("email","bala91@gmail.com");
		m3.put("course","plsql");
		
		LinkedHashMap<String,String>m4=new LinkedHashMap<String, String>();
		m4.put("name","Ranjitha");
		m4.put("email","ranjinithi91@gmail.com");
		m4.put("course","Java");
		
		emp.add(m1);
		emp.add(m2);
		emp.add(m3);
		emp.add(m4);
		
		LinkedHashMap<String,String>m=emp.get(1);
		String s=m.get("name");
		System.out.println(s);
		
		
		
	}

}
