package com.rolex.explore.bitoperators.bitwise;

public class IntegerMaxValue {

	// Integer max value is approximately 2 Billion. Integer uses 4 Bytes (32 bits).
	// One bit is used for sign.
	public static void main(String[] args) {
		int bitmask = 0x7FFFFFFF;
		System.out.println(bitmask);
		System.out.println(Integer.MAX_VALUE);
	}

}
