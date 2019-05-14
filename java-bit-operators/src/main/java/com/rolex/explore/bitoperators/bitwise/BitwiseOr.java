package com.rolex.explore.bitoperators.bitwise;

public class BitwiseOr {

	// The bitwise OR operator is '|'
	public static void main(String[] args) {
		int bitmask = 0xF0F0;
		int value = 0x0F0F;
		System.out.println(bitmask | value); // prints 65535

		byte bitmask1 = (byte)0xF0;
		byte value1 = (byte)0x0F;
		System.out.println(bitmask1 | value1); // prints -1

	}

}
