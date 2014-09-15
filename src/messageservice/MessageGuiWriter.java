//*
// * A simple class that demonstrates a capability to write a line of 
// * text to a GUI Window. Notice this class is derived from the 
// * interface <code>MessageWriter</code>, which is an abstraction of these details.
// * 

package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author sendres1
 */

public class MessageGuiWriter implements MessageWriter {
	
	/**
	 * Write a line of text to a GUI Window.
	 * 
	 * @param line - a String representing one line of text.
	 * @see Writer#writeln()
	 */
	public void writeln( String line ) {
            JOptionPane.showMessageDialog(null, line);
	}
}