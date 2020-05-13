package com.pages;

public class Xpaths {

	// Verify Logo
	public static String LOGO = "//*[@id='divLogo']/img";
	//login page
	public static String userName = "//*[@id='txtUsername']";
	public static String password = "//*[@id='txtPassword']";
	public static String loginButton = "//*[@id='btnLogin']";
	
	//Admin Page
	public static String ADMIN = "//b[contains(text(), 'Admin')]";
	public static String AD_USERNAME = "//input[@id= 'searchSystemUser_userName']";
	public static String USERNAME_ROLE = "//select[@id= 'searchSystemUser_userType']";
	public static String EMP_NAME = "//input[@id= 'searchSystemUser_employeeName_empName']";
	
	//Pim Page
	public static String PIM = "//b[contains(text(), 'PIM')]";
	
	//Leave page
	public static String LEAVE = "//*[@id='menu_leave_viewLeaveModule']";
	
	//Time Page
	public static String TIME = "//b[contains(text(), 'Time')]";
	
	
}
