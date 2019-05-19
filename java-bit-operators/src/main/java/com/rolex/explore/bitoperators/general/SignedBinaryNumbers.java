package com.rolex.explore.bitoperators.general;

public class SignedBinaryNumbers {

	// Take complement of non-sign digits and add 1 to compute the negative value.
	public static void main(String[] args) {
		System.out.println((byte) 0b10000000); // -128 = 111 1111 + 1
		System.out.println((byte) 0b10000001); // -127 = 111 1110 + 1
		System.out.println((byte) 0b10000010); // -126 = 111 1101 + 1
		System.out.println((byte) 0b10000011); // -125 = 111 1100 + 1

		System.out.println((byte) 0b11111110); // -2 = 000 0001 + 1
		System.out.println((byte) 0b11111111); // -1 = 000 0000 + 1
	}

}
