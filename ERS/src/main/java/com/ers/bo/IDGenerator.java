package com.ers.bo;

import java.util.Random;

public class IDGenerator {
	
	
	public static  String generateID() {
		Random r=new Random();
		return "REV2021FSD"+r.nextInt();
	}

}
