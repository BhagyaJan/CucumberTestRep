package com.adactin.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void reportGeneration(String json)
	{
		File f= new File("JsonReports\\JVMReports");
		Configuration con = new Configuration(f,"Adactin Report");
		
		con.addClassifications("Platform", "Windows 10");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Version", "80");
		con.addClassifications("Sprint", "17");
		
		List<String> list = new ArrayList<>();
		list.add(json);
		ReportBuilder r=new ReportBuilder(list,con);
		
		r.generateReports();		
		
	}

}
