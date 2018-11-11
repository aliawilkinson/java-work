package com.alia.model;

public class Simulation {
	public static void main(String[] args){
	    FlyingVehicle fv = new FlyingVehicle((short)3,new Engine());
	    
	    fv.setName("A New Flying Vehicle");
	    System.out.println(fv.getName());
	    
	    Airplane boeing = new Airplane((short)3,(short)4);
	    boeing.move(15);
	  }
}
