package com.alia.model;

public class Package {
	 private Content content;
	    private Color color;
	    private Dimension dimension;

	    //constructors
	    public Package() {};
	    
	    public Package(Content content, Color color, Dimension dimension) {
	    	this.content = content;
	    	this.color = color;
	    	this.dimension = dimension;
	    }

	    //getters
	    public Content getContent() {
	    	return this.content;
	    }
	    
	    public Color getColor() {
	    	return this.color;
	    }
	    
	    public Dimension getDimension() {
	    	return this.dimension;
	    }
	    
	    //setters
	    public void setContent(Content content) {
	    	this.content = content;
	    }
	    
	    public void setColor(Color color) {
	    	this.color = color;
	    }
	    
	    public void setDimension(Dimension dimension) {
	    	this.dimension = dimension;
	    }

	    //override toString()
		@Override
		public String toString() {
			return "Package [content=" + content + ", color=" + color + ", dimension=" + dimension + "]";
		}
	    
}
