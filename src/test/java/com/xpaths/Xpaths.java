package com.xpaths;

public class Xpaths {

	//login page
	public static String userName = "//*[@id='txtUsername']";
	public static String password = "//*[@id='txtPassword']";
	public static String loginButton = "//*[@id='btnLogin']";
	
	//Admin Page
	public static String ADMIN = "//b[contains(text(), 'Admin')]";
	public static String AD_USERNAME = "//input[@id= 'searchSystemUser_userName']";
	public static String USERNAME_ROLE = "//select[@id= 'searchSystemUser_userType']";
	public static String EMP_NAME = "//input[@id= 'searchSystemUser_employeeName_empName']";
	
}
