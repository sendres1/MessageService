/**
 * A simple low-level, derived class that demonstrates the capability to read 
 * a line of input from the keyboard. Notice this class is derived from 
 * the interface <code>Reader</code>, which is an abstraction of these details.
 * 
 
 */

package messageservice;

import java.util.Scanner;

/**
 *
 * @author sendres1
 */
public class MessageKeyboardReader implements MessageReader{
    

	/**
	 * Reads characters from the keyboard until a carriage return is entered.
	 * 
	 * @return a String representing a message of 1 line.
	 */
        @Override
	public String getMessage() {
            System.out.println("Please enter a message, then press return:");

            Scanner input = new Scanner(System.in);
            return input.nextLine();
	}
}
