package com.rolex.explore.bitoperators.bitshift;

public class SignedRightShift {

	// Value in the sign bit is preserved. i.e. a positive no. remains positive and a negative no. remains negative.
	// The sign bit value is padded in the left fields (higher order positions) created due to the right shift
	// Shift by n positions is equivalent to division by 2^n, or 2^n - 1 for odd no.s ??
	public static void main(String[] args) {
		
		int x = 0xF;
		int pos = 2;
		System.out.println(Integer.toBinaryString(x) + ">>" + pos + "=" + Integer.toBinaryString(x >> pos));
		System.out.println(x + ">>" + pos + "=" + (x >> pos));
		System.out.println("====================================================================================================");
		
		x = 0x1;
		pos = 4;
		System.out.println(Integer.toBinaryString(x) + ">>" + pos + "=" + Integer.toBinaryString(x >> pos));
		System.out.println(x + ">>" + pos + "=" + (x >> pos));
		System.out.println("====================================================================================================");

		x = 0x7_FF_FF_FF;
		pos = 1;
		System.out.println(Integer.toBinaryString(x) + ">>" + pos + "=" + Integer.toBinaryString(x >> pos));
		System.out.println(x + ">>" + pos + "=" + (x >> pos));
		System.out.println("====================================================================================================");
		
		x = 0x7_FF_FF_FF;
		pos = 4;
		System.out.println(Integer.toBinaryString(x) + ">>" + pos + "=" + Integer.toBinaryString(x >> pos));
		System.out.println(x + ">>" + pos + "=" + (x >> pos));
		System.out.println("====================================================================================================");
		
		x = 0x7_FF_FF_FF;
		pos = 5;
		System.out.println(Integer.toBinaryString(x) + ">>" + pos + "=" + Integer.toBinaryString(x >> pos));
		System.out.println(x + ">>" + pos + "=" + (x >> pos));
		System.out.println("====================================================================================================");
		
		x = 0x7F_FF_FF_FF;
		pos = 1;
		System.out.println(Integer.toBinaryString(x) + ">>" + pos + "=" + Integer.toBinaryString(x >> pos));
		System.out.println(x + ">>" + pos + "=" + (x >> pos));
		System.out.println("====================================================================================================");
		
		x = 0x7F_FF_FF_FF;
		pos = 10;
		System.out.println(Integer.toBinaryString(x) + ">>" + pos + "=" + Integer.toBinaryString(x >> pos));
		System.out.println(x + ">>" + pos + "=" + (x >> pos));
		System.out.println("====================================================================================================");
		
		x = 0x80_00_00_00;
		pos = 1;
		System.out.println(Integer.toBinaryString(x) + ">>" + pos + "=" + Integer.toBinaryString(x >> pos));
		System.out.println(x + ">>" + pos + "=" + (x >> pos));
		System.out.println("====================================================================================================");
		
		x = 0xFF_FF_FF_FF; 
		pos = 1;
		System.out.println(Integer.toBinaryString(x) + ">>" + pos + "=" + Integer.toBinaryString(x >> pos));
		System.out.println(x + ">>" + pos + "=" + (x >> pos));
		System.out.println("====================================================================================================");
		
		
		x = 0xFF_FF_FF_F0;
		pos = 1;
		System.out.println(Integer.toBinaryString(x) + ">>" + pos + "=" + Integer.toBinaryString(x >> pos));
		System.out.println(x + ">>" + pos + "=" + (x >> pos));
		System.out.println("====================================================================================================");
		
		
		x = 0xFF_FF_FF_F0;
		pos = 10;
		System.out.println(Integer.toBinaryString(x) + ">>" + pos + "=" + Integer.toBinaryString(x >> pos));
		System.out.println(x + ">>" + pos + "=" + (x >> pos));
		System.out.println("====================================================================================================");
		
		
		x = 0x3F_FF_FF_FF;
		pos = 65;
		System.out.println(Integer.toBinaryString(x) + ">>" + pos + "=" + Integer.toBinaryString(x >> pos));
		System.out.println(x + ">>" + pos + "=" + (x >> pos));
		System.out.println("====================================================================================================");
		
		byte y = (byte)0xFF;
		pos = 1;
		System.out.println("Byte: " + Byte.toString(y));
		System.out.println(y  + ">>" + pos + "=" +  (y >> pos));
		System.out.println("====================================================================================================");

		y = (byte)0x80;
		pos = 1;
		System.out.println("Byte: " + Byte.toString(y));
		System.out.println(y  + ">>" + pos + "=" +  (y >> pos));
		System.out.println("====================================================================================================");

	}

}
