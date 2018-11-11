package com.alia.test;

import com.alia.builders.Assembler;
import com.alia.interfaces.Packager;
import com.alia.model.Package;

public class TestPackager {

		public static void main(String[] args) {
			Packager packager = new Assembler();
			Package myPackage = packager.assemblePackage();
			
			System.out.println(myPackage);
		}
}
