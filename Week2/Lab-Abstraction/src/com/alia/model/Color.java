package com.alia.model;

public class Color {
	 private int red;
	    private int green;
	    private int blue;

	    //constructors
	    public Color() {};
	    
	    public Color(int red, int blue, int green) {
	    	this.red = red;
	    	this.blue = blue;
	    	this.green = green;
	    }
	    
	    //getters 
	    public int getRed() {
	    	return this.red;
	    }
	    
	    public int getGreen() {
	    	return this.green;
	    }
	    
	    public int getBlue() {
	    	return this.blue;
	    }
	    
	    //setters
	    
	    public void setRed(int red) {
	    	this.red = red;
	    }
	    
	    public void setGreen(int green) {
	    	this.green = green;
	    }
	    
	    public void setBlue(int blue) {
	    	this.blue = blue;
	    }

	    //override toString()
	    
		@Override
		public String toString() {
			return "Color [red=" + red + ", green=" + green + ", blue=" + blue + "]";
		}

	    
	    
}
