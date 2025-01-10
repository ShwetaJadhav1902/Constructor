package com.constructor;


public class MainMobileDevice {
	public static void main(String[] args) {
		MobileDevice m=new MobileDevice();
		
		m.setMobileCompany("Samsung");
		m.setMobilePrice(15000);
		m.setMobileQuality("Excellent");
		
		String mobileCompany=m.getMobileCompany();
		System.out.println("Mobile Company is:"+mobileCompany);
		double id=m.getMobilePrice();
		System.out.println("MobilePrice:"+id);
		String name1=m.getMobileQuality();
		System.out.println("Mobile Quality is:"+name1);
	}


}
