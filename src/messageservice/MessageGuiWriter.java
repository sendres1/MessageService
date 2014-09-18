//*
// * A simple class that demonstrates a capability to write a msg of 
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
	 * Write a msg of text to a GUI Window.
	 * 
	 * @param msg - a String representing one msg of text.
	 * @see Writer#writeln()
	 */
        @Override
	public void writeMessage( String msg ) {
            JOptionPane.showMessageDialog(null, msg);
	}
}