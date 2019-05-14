package com.rolex.explore.bitoperators.bitwise;

public class BitwiseComplement {

	// The Bitwise Complement operator is '~'
	public static void main(String[] args) {
		int value = 0xFFFFFFF0;
		System.out.println(~value);// prints 15

		value = 0xFFFFFFF1;
		System.out.println(~value);// prints 14

		byte byteValue1 = 0x0;
		System.out.println(~byteValue1);// prints -1

		byte byteValue2 = 0x7D;
		System.out.println(~byteValue2);// prints -126

	}

}
