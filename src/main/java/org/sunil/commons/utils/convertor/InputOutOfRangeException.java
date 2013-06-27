package org.sunil.commons.utils.convertor;

/**
 * Thrown to indicate that input does not fall in the defined set of range.
 * 
 * @author Sunil Kalyanpur
 *
 */
public class InputOutOfRangeException extends RuntimeException{
	public static final long serialVersionUID = -4693076165048687818L;

	/**
     * Constructs an <code>InputOutOfRangeException</code> with no
     * detail message.
     */
	public InputOutOfRangeException(){
		super();
	}
	
	/**
     * Constructs an <code>InputOutOfRangeException</code> with the
     * specified detail message.
     *
     * @param   m  the detail message describing exception.
     */
	public InputOutOfRangeException(String m){
		super(m);
	}
}
