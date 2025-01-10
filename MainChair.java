package com.constructor;

public class MainChair {
	public static void main(String[] args) {
            Chair c=new Chair();
		
		c.setChairPrice(4000);
		c.setChairColor("Black");
		c.setChairWaranty("1 year");
		
		int chairPrice=c.getChairPrice();
		System.out.println("Chair price is:"+chairPrice);
		String chairColor=c.getChairColor();
		System.out.println("Chair Color is:"+chairColor);
		String chairWaranty=c.getChairWaranty();
		System.out.println("Chair waranty is:"+chairWaranty);
	}
	
	
}

