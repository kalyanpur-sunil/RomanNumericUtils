package org.sunil.commons.utils.convertor;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.sunil.commons.utils.RomanNumeral;

/**
 * {@link org.sunil.commons.utils.RomanNumeral} implementation
 * that handles conversion to and from <b>Roman/Decimal</b>.
 * 
 * The class <code>RomanNumeralConvertor</code> includes methods 
 * capable of converting a regular, decimal number into a Roman numeral, 
 * and another method that converts a Roman numeral to a decimal number.
 * 
 * @author Sunil Kalyanpur
 *
 */
public class RomanNumeralConvertor implements RomanNumeral {

	private static Map<String, Integer> ROMAN_VALUE_MAP = Collections.unmodifiableMap(new LinkedHashMap<String, Integer>(){
		private static final long serialVersionUID = 1L;

		{
			put("M", 1000);
			put("CM", 900);
			put("D", 500);
			put("CD", 400);
			put("C", 100);
			put("XC", 90);
			put("L", 50);
			put("XL", 40);
			put("X", 10);
			put("IX", 9);
			put("V", 5);
			put("IV", 4);
			put("I", 1);
		}
	});

	/**
	 * minimum value that can be converted to Roman literal
	 */
	private static final int MIN_VALID_VALUE=1;
	
	/**
	 * maximum value that can be converted to Roman literal
	 */
	private static final int MAX_VALID_VALUE=4999;
	
	/**
	 * Returns the Roman numeral of integer.
	 * 
	 *  @param a an integer.
	 *  
	 *  @return Roman numeral of the argument.
	 *  
	 *  @throws InputOutOfRangeException
	 *          if the input does not fall in 1 through 4999 range. 
	 */
	@Override
	public String convertDecimalToRoman(int a) {
		rangeCheck(a);
		StringBuffer buffer = new StringBuffer();
		for(Map.Entry<String, Integer> entry :ROMAN_VALUE_MAP.entrySet()){
			while(a>=entry.getValue()){
				a-=entry.getValue();
				buffer.append(entry.getKey());
			}
		}
		return buffer.toString();
	}

	/**
	 * Returns the integer of the Roman numeral.
	 * 
	 *  @param str a <code>String</code>.
	 *  
	 *  @return integer equivalent of Roman string
	 *  
	 *  @throws InvalidInputException
	 *          
	 * 
	 */
	@Override
	public int convertRomanToDecimal(String str) {
		int sum=0;

		for(int i=0;i<=str.length()-1;i++){
			if((str.length()-i)>1 && ROMAN_VALUE_MAP.containsKey(str.substring(i, i+2))){
				sum+=ROMAN_VALUE_MAP.get(str.substring(i, i+2));
				i++;
			}else{
				if(ROMAN_VALUE_MAP.containsKey(str.substring(i, i+1))){
					sum+=ROMAN_VALUE_MAP.get(str.substring(i, i+1));
				}else
					throw new InvalidInputException("Not a valid Roman literal");
			}
		}
		return sum;
	}

	/**
	 * Checks if the given argument falls within the range.  If not, throws an appropriate
	 * runtime exception. It is always used immediately after {@link com.pearson.util.RomanNumeralConvertor#convertDecimalToRoman(int)},
	 * which throws an InputOutOfRangeException if argument does not fall within the range.
	 */
	private void rangeCheck(int num) {
		if(num<MIN_VALID_VALUE || num>MAX_VALID_VALUE)
			throw new InputOutOfRangeException("Input must be in the range of 1 to 4999");
	}

}
