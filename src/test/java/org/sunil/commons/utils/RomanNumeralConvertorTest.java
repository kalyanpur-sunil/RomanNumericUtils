package org.sunil.commons.utils;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sunil.commons.utils.RomanNumeral;
import org.sunil.commons.utils.convertor.InputOutOfRangeException;
import org.sunil.commons.utils.convertor.InvalidInputException;
import org.sunil.commons.utils.convertor.RomanNumeralConvertor;


/**
 * Test cases for @link com.oracle.commons.utils.convertor.RomanNumeralConvertor
 * 
 * @author VKALYSU
 *
 */
public class RomanNumeralConvertorTest {
	RomanNumeral convertor = null;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		convertor = new RomanNumeralConvertor();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		convertor=null;
	}

	/**
	 * Test method for {@link com.pearson.util.RomanNumeralConvertor#convertDecimalToRoman(int)}.
	 */
	@Test
	public void testToRoman() {
		assertEquals("1==>I","I",convertor.convertDecimalToRoman(1));
		assertEquals("4==>IV","IV",convertor.convertDecimalToRoman(4));
		assertEquals("9==>IX","IX",convertor.convertDecimalToRoman(9));
		assertEquals("10==>X","X",convertor.convertDecimalToRoman(10));
		assertEquals("11==>XI","XI",convertor.convertDecimalToRoman(11));
		assertEquals("14==>XIV","XIV",convertor.convertDecimalToRoman(14));
		assertEquals("15==>XV","XV",convertor.convertDecimalToRoman(15));
		assertEquals("19==>XIX","XIX",convertor.convertDecimalToRoman(19));
		assertEquals("20==>XX","XX",convertor.convertDecimalToRoman(20));
		assertEquals("40==>XL","XL",convertor.convertDecimalToRoman(40));
		assertEquals("49==>XLIX","XLIX",convertor.convertDecimalToRoman(49));
		assertEquals("51==>LI","LI",convertor.convertDecimalToRoman(51));
		assertEquals("99==>XCIX","XCIX",convertor.convertDecimalToRoman(99));
		assertEquals("100==>C","C",convertor.convertDecimalToRoman(100));
		assertEquals("101==>CI","CI",convertor.convertDecimalToRoman(101));
		assertEquals("149==>CXLIX","CXLIX",convertor.convertDecimalToRoman(149));
		assertEquals("150==>CL","CL",convertor.convertDecimalToRoman(150));
		assertEquals("200==>CC","CC",convertor.convertDecimalToRoman(200));
		assertEquals("400==>CD","CD",convertor.convertDecimalToRoman(400));
		assertEquals("449==>CDXLIX","CDXLIX",convertor.convertDecimalToRoman(449));
		assertEquals("450==>CDL","CDL",convertor.convertDecimalToRoman(450));
		assertEquals("499==>CDXCIX","CDXCIX",convertor.convertDecimalToRoman(499));
		assertEquals("500==>D","D",convertor.convertDecimalToRoman(500));
		assertEquals("501==>DI","DI",convertor.convertDecimalToRoman(501));
		assertEquals("510==>DX","DX",convertor.convertDecimalToRoman(510));
		assertEquals("550==>DL","DL",convertor.convertDecimalToRoman(550));
		assertEquals("799==>DCCXCIX","DCCXCIX",convertor.convertDecimalToRoman(799));
		assertEquals("991==>CMXCI","CMXCI",convertor.convertDecimalToRoman(991));
		assertEquals("999==>CMXCIX","CMXCIX",convertor.convertDecimalToRoman(999));
		assertEquals("1000==>M","M",convertor.convertDecimalToRoman(1000));
		assertEquals("1001==>MI","MI",convertor.convertDecimalToRoman(1001));
		assertEquals("4999==>MMCMXCIX","MMCMXCIX",convertor.convertDecimalToRoman(2999));
		assertEquals("3000==>MMM","MMM",convertor.convertDecimalToRoman(3000));
		assertEquals("3400==>MMMCD","MMMCD",convertor.convertDecimalToRoman(3400));
		assertEquals("3991==>MMMCMXCI","MMMCMXCI",convertor.convertDecimalToRoman(3991));
		assertEquals("4999==>MMMMCMXCIX","MMMMCMXCIX",convertor.convertDecimalToRoman(4999));
		
	}


	/**
	 * Test method for {@link com.pearson.util.RomanNumeralConvertor#convertDecimalToRoman(int)}.
	 */
	@Test(expected=InputOutOfRangeException.class)
	public void testInputOutOfRangeException() {
		convertor.convertDecimalToRoman(0);
		convertor.convertDecimalToRoman(5000);
		convertor.convertDecimalToRoman(-1);
	}

	/**
	 * Test method for {@link com.pearson.util.RomanNumeralConvertor#convertRomanToDecimal(java.lang.String)}.
	 */
	@Test
	public void testToNumeral() {
		assertEquals("1<==>I",1, convertor.convertRomanToDecimal("I"));
		assertEquals("2<==>II",2, convertor.convertRomanToDecimal("II"));
		assertEquals("3<==>III",3, convertor.convertRomanToDecimal("III"));
		assertEquals("4<==>IV",4, convertor.convertRomanToDecimal("IV"));
		assertEquals("6<==>VI",6, convertor.convertRomanToDecimal("VI"));
		assertEquals("9<==>IX",9, convertor.convertRomanToDecimal("IX"));
		assertEquals("14<==>XIV",14,convertor.convertRomanToDecimal("XIV"));
		assertEquals("15<==>XV",15,convertor.convertRomanToDecimal("XV"));
		assertEquals("19<==>XIX",19, convertor.convertRomanToDecimal("XIX"));
		assertEquals("20<==>XX",20,convertor.convertRomanToDecimal("XX"));
		assertEquals("40<==>XL",40,convertor.convertRomanToDecimal("XL"));
		assertEquals("49<==>XLIX",49,convertor.convertRomanToDecimal("XLIX"));
		assertEquals("51<==>LI",51,convertor.convertRomanToDecimal("LI"));
		assertEquals("99<==>XCIX",99,convertor.convertRomanToDecimal("XCIX"));
		assertEquals("100<==>C",100,convertor.convertRomanToDecimal("C"));
		assertEquals("101<==>CI",101,convertor.convertRomanToDecimal("CI"));
		assertEquals("149<==>CXLIX",149,convertor.convertRomanToDecimal("CXLIX"));
		assertEquals("150<==>CL",150,convertor.convertRomanToDecimal("CL"));
		assertEquals("200<==>CC",200,convertor.convertRomanToDecimal("CC"));
		assertEquals("400<==>CD",400,convertor.convertRomanToDecimal("CD"));
		assertEquals("449<==>CDXLIX",449,convertor.convertRomanToDecimal("CDXLIX"));
		assertEquals("450<==>CDL",450,convertor.convertRomanToDecimal("CDL"));
		assertEquals("499<==>",499,convertor.convertRomanToDecimal("CDXCIX"));
		assertEquals("500<==>D",500,convertor.convertRomanToDecimal("D"));
		assertEquals("501<==>DI",501,convertor.convertRomanToDecimal("DI"));
		assertEquals("510<==>DX",510,convertor.convertRomanToDecimal("DX"));
		assertEquals("550<==>DL",550,convertor.convertRomanToDecimal("DL"));
		assertEquals("799<==>DCCXCIX",799,convertor.convertRomanToDecimal("DCCXCIX"));
		assertEquals("991<==>CMXCI",991,convertor.convertRomanToDecimal("CMXCI"));
		assertEquals("999<==>CMXCIX",999,convertor.convertRomanToDecimal("CMXCIX"));
		assertEquals("1000<==>M",1000,convertor.convertRomanToDecimal("M"));
		assertEquals("1001<==>MI",1001,convertor.convertRomanToDecimal("MI"));
		assertEquals("3000<==>MMM",3000,convertor.convertRomanToDecimal("MMM"));
		assertEquals("3400<==>MMMCD",3400,convertor.convertRomanToDecimal("MMMCD"));
		assertEquals("3991<==>MMMCMXCI",3991,convertor.convertRomanToDecimal("MMMCMXCI"));
		assertEquals("4999<==>MMMMCMXCIX",4999,convertor.convertRomanToDecimal("MMMMCMXCIX"));
		assertEquals("4999<==>MMMMCMXCIX",4999,convertor.convertRomanToDecimal(null));
		
	}

	/**
	 * Test method for {@link com.pearson.util.RomanNumeralConvertor#convertRomanToDecimal(java.lang.String)}.
	 */
	@Test(expected=InvalidInputException.class)
	public void testInvalidInputException(){
		convertor.convertRomanToDecimal("F");
		convertor.convertRomanToDecimal("IIV");
		convertor.convertRomanToDecimal("PP");
		convertor.convertRomanToDecimal("LDIX");
	}


}
