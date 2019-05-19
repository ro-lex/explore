package com.rolex.explore.bitoperators.bitshift;

public class SignedLeftShift {

	// Value in the sign bit is included in the shift. i.e. a positive no. can become negative.
	// For operations on byte, short etc. the no. is first converted to int (32 bit) and then shifted.
	// RHS operand is effectively %32 of the given operand
	// Left shift is effectively multiplication by 2 to the power of RHS, as long as sign bit is not inverted after the shift (positive and negative no.s)
	public static void main(String[] args) {
		
		int x = 0xF;
		int pos = 2;
		System.out.println(Integer.toBinaryString(x) + "<<" + pos + "=" + Integer.toBinaryString(x << pos));
		System.out.println(x + "<<" + pos + "=" + (x << pos));
		System.out.println("====================================================================================================");
		
		x = 0x1;
		pos = 4;
		System.out.println(Integer.toBinaryString(x) + "<<" + pos + "=" + Integer.toBinaryString(x << pos));
		System.out.println(x + "<<" + pos + "=" + (x << pos));
		System.out.println("====================================================================================================");

		x = 0x7_FF_FF_FF;
		pos = 1;
		System.out.println(Integer.toBinaryString(x) + "<<" + pos + "=" + Integer.toBinaryString(x << pos));
		System.out.println(x + "<<" + pos + "=" + (x << pos));
		System.out.println("====================================================================================================");
		
		x = 0x7_FF_FF_FF;
		pos = 4;
		System.out.println(Integer.toBinaryString(x) + "<<" + pos + "=" + Integer.toBinaryString(x << pos));
		System.out.println(x + "<<" + pos + "=" + (x << pos));
		System.out.println("====================================================================================================");
		
		// Shift involves more than available bits, but note that sign bit is preserved
		x = 0x7_FF_FF_FF;
		pos = 5;
		System.out.println(Integer.toBinaryString(x) + "<<" + pos + "=" + Integer.toBinaryString(x << pos));
		System.out.println(x + "<<" + pos + "=" + (x << pos));
		System.out.println("====================================================================================================");
		
		x = 0x7F_FF_FF_FF; // Integer.MAX_VALUE gets converted to -2
		pos = 1;
		System.out.println(Integer.toBinaryString(x) + "<<" + pos + "=" + Integer.toBinaryString(x << pos));
		System.out.println(x + "<<" + pos + "=" + (x << pos));
		System.out.println("====================================================================================================");
		
		x = 0x7F_FF_FF_FF; // Integer.MAX_VALUE gets converted to -1024
		pos = 10;
		System.out.println(Integer.toBinaryString(x) + "<<" + pos + "=" + Integer.toBinaryString(x << pos));
		System.out.println(x + "<<" + pos + "=" + (x << pos));
		System.out.println("====================================================================================================");
		
		x = 0x80_00_00_00; // 100...0 get converted to 0 when 1 position shift sets the sign bit to 0.
		pos = 1;
		System.out.println(Integer.toBinaryString(x) + "<<" + pos + "=" + Integer.toBinaryString(x << pos));
		System.out.println(x + "<<" + pos + "=" + (x << pos));
		System.out.println("====================================================================================================");
		
		x = 0xFF_FF_FF_FF; 
		pos = 1;
		System.out.println(Integer.toBinaryString(x) + "<<" + pos + "=" + Integer.toBinaryString(x << pos));
		System.out.println(x + "<<" + pos + "=" + (x << pos));
		System.out.println("====================================================================================================");
		
		
		x = 0xFF_FF_FF_F0; // -16 * 2
		pos = 1;
		System.out.println(Integer.toBinaryString(x) + "<<" + pos + "=" + Integer.toBinaryString(x << pos));
		System.out.println(x + "<<" + pos + "=" + (x << pos));
		System.out.println("====================================================================================================");
		
		
		x = 0xFF_FF_FF_F0; // -16 * 1024
		pos = 10;
		System.out.println(Integer.toBinaryString(x) + "<<" + pos + "=" + Integer.toBinaryString(x << pos));
		System.out.println(x + "<<" + pos + "=" + (x << pos));
		System.out.println("====================================================================================================");
		
		
		// A shift of 65 is the same as a shift of 1 (65%32)
		x = 0x3F_FF_FF_FF;
		pos = 65;
		System.out.println(Integer.toBinaryString(x) + "<<" + pos + "=" + Integer.toBinaryString(x << pos));
		System.out.println(x + "<<" + pos + "=" + (x << pos));
		System.out.println("====================================================================================================");
		
		byte y = (byte)0xFF;
		pos = 1;
		System.out.println("Byte: " + Byte.toString(y));
		System.out.println(y  + "<<" + pos + "=" +  (y << pos));
		System.out.println("====================================================================================================");
		
		// y's value of -128 represented in 8 bits is converted to -128 represented in 32 bits and then shifted by 1 position to get -256
		y = (byte)0x80;
		pos = 1;
		System.out.println("Byte: " + Byte.toString(y));
		System.out.println(y  + "<<" + pos + "=" +  (y << pos));
		System.out.println("====================================================================================================");

	}

}
