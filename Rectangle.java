package com.constructor;

public class Rectangle {
	private int width;
	private int height;
	public Rectangle() {
		width=10; height=12;
	}
	Rectangle(int width,int height){
		this.width=width;
	    this.height=height;
	}
    public void printDetails() {
    	System.out.println("width is:" +width +  "height is:" +height);
    }
}
