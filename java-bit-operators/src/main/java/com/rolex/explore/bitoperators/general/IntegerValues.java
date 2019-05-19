package com.rolex.explore.bitoperators.general;

public class IntegerValues {

	// Integer uses 4 Bytes (32 bits). One bit is used for sign.
	// Integer max value is approximately 2 Billion. It is represented in Binary as 31 1's
	// Integer min value is approximately minus 2 Billion. It is represented as Binary 1 followed by 31 0's
	// Smallest negative values in binary is 1 followed by 31 0's. Approximately minus 2 Billion in decimal.
	// Smallest non-negative value in binary is all 0's. 0 in decimal.
	// Largest negative value in binary is 32 1's. -1 in decimal.
	// Largest non-negative value in binary is 0 followed by 31 1's. Approximately minus 2 Billion in decimal.
	public static void main(String[] args) {
		
		// Max Value
		System.out.println("*****Integer.MAX_VALUE*****");
		System.out.format("%s" + Integer.MAX_VALUE + "\n", "Decimal    : ");
		System.out.format("%s" + Integer.toBinaryString(Integer.MAX_VALUE) + " (%d %s)\n", "Binary     : ", Integer.toBinaryString(Integer.MAX_VALUE).length(), "bits");
		System.out.format("%s" + Integer.toHexString(Integer.MAX_VALUE) + "\n\n", "Hexadecimal: ");
		
		// Min value
		System.out.println("*****Integer.MIN_VALUE*****");
		System.out.format("%s" + Integer.MIN_VALUE + "\n", "Decimal    : ");
		System.out.format("%s" + Integer.toBinaryString(Integer.MIN_VALUE) + " (%d %s)\n", "Binary     : ", Integer.toBinaryString(Integer.MIN_VALUE).length(), "bits");
		System.out.format("%s" + Integer.toHexString(Integer.MIN_VALUE) + "\n\n", "Hexadecimal: ");
		
		// Smallest non-negative value
		int x = 0;
		System.out.println("*****Smallest non-negative*****");
		System.out.format("%s" + x + "\n", "Decimal    : ");
		System.out.format("%s" + Integer.toBinaryString(x) + " (%d %s)\n", "Binary     : ", Integer.toBinaryString(x).length(), "bits");
		System.out.format("%s" + Integer.toHexString(x) + "\n\n", "Hexadecimal: ");
		
		// Largest negative value
		x = -1;
		System.out.println("*****Largest negative*****");
		System.out.format("%s" + x + "\n", "Decimal    : ");
		System.out.format("%s" + Integer.toBinaryString(x) + " (%d %s)\n", "Binary     : ", Integer.toBinaryString(x).length(), "bits");
		System.out.format("%s" + Integer.toHexString(x) + "\n\n", "Hexadecimal: ");

		// Second-largest negative value
		x = -2;
		System.out.println("*****Second-Largest negative*****");
		System.out.format("%s" + x + "\n", "Decimal    : ");
		System.out.format("%s" + Integer.toBinaryString(x) + " (%d %s)\n", "Binary     : ", Integer.toBinaryString(x).length(), "bits");
		System.out.format("%s" + Integer.toHexString(x) + "\n\n", "Hexadecimal: ");
		

	}

}
