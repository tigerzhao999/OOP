/*2.1 object vs object reference  	
 * Object states behavior object reference is pointing to another thing in memory
 * 2.2 Object states behavior Object variable is a storage loaction in the memory that has a type a name and contents
 * 2.3 Object is entity that you can manulipulate in your program Class spesfies methods that you can appily to objefcts
 * 2.8 Rectangle r = (5, 10, 15,  20); there needs to be a New rectangle --> Rectangle r = new Rectangle  (5, 10, 15,  20);
 * 2.9 Accessor methods of rectangle class: "getX getHeight"
 * 2.9 methods of rectangle class:Double width, box.Translate
 * 2.10 Changes the draw point of rectangele to 0,0
 */

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;
public class doublePtwoPOINTtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				JFrame frame = new JFrame();
				//frame.setSize(200,200);DOUBLE FRAME SIZE 
				frame.setSize(400,400);
				//JTextField text = new JTextField ("Hello, World!"); CHange to "hello Your name"
				JTextField text = new JTextField ("Hello, Wesley!");
				text.setBackground(new Color (152,251,152));
				frame.add(text);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			
			}

		}