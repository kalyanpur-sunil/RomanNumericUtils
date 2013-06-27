package org.sunil.commons.utils;

/**
 * This interface defines methods to convert a regular, decimal number into a Roman numeral, 
 * and another method that converts a Roman numeral to a decimal number. Classes that implement this 
 * interface must implement methods described by this interface.
 * 
 * @author Sunil Kalyanpur
 *
 */

public interface RomanNumeral {

	/**
	 * Returns the Roman numeral of integer.
	 * 
	 *  @param a an integer.
	 *  
	 *  @return Roman numeral of the argument.
	 */ 
	public String convertDecimalToRoman(int a);
	
	/**
	 * Returns the integer of the Roman numeral.
	 * 
	 *  @param str a <code>String</code>. 
	 *  
	 *  @return integer equivalent of Roman string
	 *  
	 */
	public int convertRomanToDecimal(String str);
}
