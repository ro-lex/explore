package com.rolex.explore.bitoperators.bitwise;

public class BitwiseExclusiveOr {

	// Bitwise Exclusive OR (XOR) operator is '^'
	public static void main(String[] args) {

		int bitmask = 0xF0F0;
		int value = 0x0000;
		System.out.println(bitmask ^ value); // Prints 0xF0F0 = 61680
		
		bitmask = 0xF0F0;
		value = 0x0F0F;
		System.out.println(bitmask ^ value); // Prints 0xFFFF = 65535
		
		bitmask = 0xF0F0;
		value = 0xF0F0;
		System.out.println(bitmask ^ value); // Prints 0
	}

}
