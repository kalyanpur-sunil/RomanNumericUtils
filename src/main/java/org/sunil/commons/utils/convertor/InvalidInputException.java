package org.sunil.commons.utils.convertor;

/**
 * Thrown to indicate that input is invalid.
 * 
 * @author Sunil Kalyanpur
 *
 */
public class InvalidInputException extends RuntimeException{
	public static final long serialVersionUID = -2052591578751290215L;
	
	/**
     * Constructs an <code>InvalidInputException</code> with no
     * detail message.
     */
	public InvalidInputException(){
		super();
	}
	
	/**
     * Constructs an <code>InvalidInputException</code> with the
     * specified detail message.
     *
     * @param   m   the detail message describing exception.
     */
	public InvalidInputException(String m){
		super(m);
	}

}
