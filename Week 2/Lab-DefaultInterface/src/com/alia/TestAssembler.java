package com.alia;

import com.alia.assemblers.MyAssembler;
import com.alia.interfaces.Packager;
import com.alia.model.Package;

public class TestAssembler {
	
	public static void main(String[] args) {
		Packager packager = new MyAssembler();
		Package myPackage = packager.assemblePackage("This is my new content description");
		System.out.println(myPackage);
	}

}
