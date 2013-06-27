package org.sunil.commons.utils;

import org.sunil.commons.utils.RomanNumeral;
import org.sunil.commons.utils.convertor.RomanNumeralConvertor;


public class TestClass {
	public static void main(String[] args) {
		RomanNumeral convertor = new RomanNumeralConvertor();
		
		System.out.println("55 in Roman representation: "+ convertor.convertDecimalToRoman(55));
		
		System.out.println("LV in Decimal representation: "+ convertor.convertRomanToDecimal("LL"));
		
//		System.out.println("Should throw exception: "+ convertor.convertDecimalToRoman(0));
		
	}

}
