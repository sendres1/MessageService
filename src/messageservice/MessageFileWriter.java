/*
/**
 * A simple low-level, derived class that demonstrates the capability to 
 * write a line of input to a file. Notice this class is derived from the 
 * interface <code>Reader</code>, which is an abstraction of these details.
 * 
*/

package messageservice;

import java.io.*;


/**
 *
 * @author sendres1
 */

public class MessageFileWriter implements MessageWriter {

	/**
	 * Write a line of input to a file "c:\temp\datacopy.txt"
	 * 
	 * @see Writer#writeln()
	 */
	public void writeln(String line) {
		boolean append = false;
	//	File data = new File(File.separatorChar + "Temp" + 
	//		  File.separatorChar + "data.txt");
                File data = new File(File.separator + "data.txt");
		PrintWriter out = null;
			  
		// This is where we setup our streams (append = false means overwrite)
		// new java.io.MessageFileWriter() creates the file if doesn't exit
		try {
			// make sure we differentiate between java.io.MessageFileWriter
			// class and this custom MessageFileWriter class
			out = new PrintWriter(
						new BufferedWriter(
						new java.io.FileWriter(data, append) ) );
			out.println(line);
			out.close();
			
		} catch (IOException ioe) {
			if(out != null) out.close();
			System.out.println( ioe.getMessage() );
			System.exit(1);  // 1 = signals program end with error
		}

	}

}
