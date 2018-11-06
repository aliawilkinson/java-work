package com.alia.model;

public class Content {
	private int amount;
    private String description;

  //constructors
    public Content() {}; //default constructor
    
    public Content(int amount, String description) {
    	this.amount = amount;
    	this.description = description;
    }

    //getters 
    
    public int getAmount(){
        return this.amount;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    //setters
  
    public void setAmount(int amount){
        this.amount = amount;
    }
    
    public void setDescription(String description){
        this.description = description;
    }


    //override toString()
	@Override
	public String toString() {
		return "Content [amount=" + amount + ", description=" + description + "]";
	}
    
    
}
