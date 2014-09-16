
package messageservice;

/**
 * This example demonstrates a good design -- one that has NO
 * dependency issues. It is not RIGID (MessageManager can be used with 
 an unlimited number of MessageReader and MessageWriter objects); it is not 
 FRAGILE (the MessageManager class does not require changes to support 
 various Readers and Writers -- changes that would break other
 classes that depend on the MessageManager class); and it is PROTABLE
 (you can use the MessageManager class in many programs without fear of 
 problems caused by implementation-specific code, such as KeyboardReader).
 <p>
 Notice that the high-level MessageManager class (also called the client, 
 because it uses the services of other objects) is not dependent on 
 any low-level classes. Instead, it is only dependent upon abstractions 
 (interfaces, although we could just as easily use abstract classes), 
 following the Dependency Inversion Principle and the Liskov Substitution 
 Principle.
 <p>
 * Design Success #1 -- adheres to Dependency Inversion Principle, which
 * states that 1) High-level modules should not depend upon low level
 * modules. Both should depend upon abstractions; and, 2) Abstractions
 * should not depend upon details. Details should depend upon abstractions.
 * <p>
 Design Success #2 -- adheres to Liskov Substitution Principle, which 
 tells us that derived classes (e.g., KeyboardReader, MessageFileReader) must 
 be usable through their base class interfaces (MessageReader and MessageWriter), without 
 the client (in this case, MessageManager) being able to tell the difference.
 <p>
 * INSTRUCTIONS:
 * When using KeyboardReader and ScreenWriter:
 * if you run this from Eclipse, make sure the Console view is 
 * open and the display is cleared. After running the program you may have to 
 * manually place your cursor in the console view. Now type a line of text, 
 * followed by a return character. Now type a second return character to end the
 * program. View results in console view.
 * <p>
 When using MessageFileReader and FileWriter, make sure you have a plain text file 
 (use Notepad to create one) named "data.txt" and containing one line of text. 
 Store this file in c:\temp. Now run the program. Go back to c:\temp and notice 
 that the program has created "datacopy.txt" which contains a copy of the line 
 of text in "data.txt".
 * 
 */

public class Startup {

	public static void main(String[] args) {
		// Uncomment this out (and comment following reader/writer)
		// to see how switching objects causes no problems with
		// MessageManager class because it's Polymorphic!!!
//		MessageReader reader = new MessageFileReader();
//		MessageWriter writer = new GuiWriter();

		// Comment this out (and uncomment preceeding reader/writer)
		// to see how switching objects causes no problems with
		// MessageManager class because it's Polymorphic!!!
            
//    1,3         uncomment code, data.txt doesn't exist            
		MessageReader reader = new MessageFileReader();
		MessageWriter writer = new MessageGuiWriter();
            
//  2,4 lets first try to create a file  sucessful, now uncomment above
//                MessageReader reader = new MessageKeyboardReader();
//                MessageWriter writer = new MessageFileWriter();
                
		// Copy from reader to writer
		// Notice that MessageManager is NOT dependent on implementation of reader/writer
           // (it is not rigid, fragile or immobile)
            
 //  6 try writing to the console
//            MessageReader reader = new MessageFileReader();
//		MessageWriter writer = new MessageConsoleWriter();
            
            
            
		MessageManager copier = new MessageManager( reader, writer );
		copier.copy();
		
		// Send end of program message
		System.out.println("Program ended. Line of reader input copied successfully to writer output.");
	}
}
