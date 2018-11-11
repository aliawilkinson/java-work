package com.alia.model;

public class Dimension {
	   private double width;
	    private double height;
	    private double length;

	    //constructors
	    public Dimension() {}
	    
	    public Dimension (double width, double height, double length) {
	    	this.width = width;
	    	this.height = height;
	    	this.length = length;
	    }

	    //getters 
	    
	    public double getWidth() {
	    	return this.width;
	    }
	    
	    public double getHeight() {
	    	return this.height;
	    }
	    
	    public double getLength() {
	    	return this.length;
	    }
	    
	    //setters
	    
	    public void setWidth(int width){
	        this.width = width;
	    }
	    
	    public void setHeight(double height) {
	    	this.height = height;
	    }
	    
	    public void setLength(double length) {
	    	this.length = length;
	    }
	    
	  //override toString()
		@Override
		public String toString() {
			return "Dimension [width=" + width + ", height=" + height + ", length=" + length + "]";
		}
	    
}
