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
	 * @return a String representing one line of input.
	 */
	public String readln() {
            System.out.println("Please enter some text, then press return:");

            Scanner input = new Scanner(System.in);
            return input.nextLine();
	}
}
