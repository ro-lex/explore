package com.rolex.explore.bitoperators.bitwise;

public class BitwiseAnd {

	//The bitwise AND operator is '&'
	public static void main(String[] args) {
		
		int bitmask = 0x000F;
		int value = 0x2222;
		
		System.out.println(bitmask & value);//prints 2
		
		bitmask = 0x0000;
		value = 0x2222;
		System.out.println(bitmask & value);//prints 0
		
		bitmask = 0x000F;
		value = 0xF;
		System.out.println(bitmask & value);//prints 15
		
		bitmask = 0x7FFFFFFF;
		value = 0x3F;
		System.out.println(bitmask & value);//prints the no. itself, i.e. 3F = 63

	}

}
