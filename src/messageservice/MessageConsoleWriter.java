/**
 * A simple class that demonstrates a capability to write a line of 
 * text to the console. Notice this class is derived from the 
 * interface <code>Writer</code>, which is an abstraction of these details.
 * 
 */

package messageservice;

/**
 *
 * @author sendres1
 */
public class MessageConsoleWriter implements MessageWriter {
	
	/**
	 * Write a line of text to the console.
	 * 
	 * @param line - a String representing one line of text.
	 * @see Writer#writeln()
	 */
    
        @Override
	public void writeMessage( String msg ) {
            System.out.println("Here is the acquired message below.");
            System.out.println( msg );
	}
}
