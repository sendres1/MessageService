//*
// * A simple class that demonstrates a capability to write a line of 
// * text to a GUI Window. Notice this class is derived from the 
// * interface <code>Writer</code>, which is an abstraction of these details.
// * 

package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author sendres1
 */

public class GuiWriter implements Writer {
	
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