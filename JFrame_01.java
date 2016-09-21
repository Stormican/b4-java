import javax.swing.JFrame;

public class JFrame_01 {

	public static void main(String[] args) {
		
		/*
		 * Graded checkpoint
		 * 1. JOP'd and jar'd
		 * 2. put this in a while loop ---- while(true)
		 * 3. JOP "What do you want for a title?"
		 * 4. JOP "What width do you want"
		 * 5. JOP "What width do you want"
		 * 6. JOP "Do you want to create another window (Y / N)?"
		 * 7. if No, do a graceful exit like this ---
		 * 8. "Thank you, goodbye"
		 */
		
		String title = "My first window!";
		int width = 800;
		int height = 600;
		createJFrame(title, width, height);
		
		
		
		

	}
	// name for this type of code is a method
	private static void createJFrame(String topTitle, int w, int h) {
		
		JFrame frame = new JFrame(topTitle);
		
		// frame is the name of an object created from the JFrame class
		frame.setSize(800, 600);
		frame.setVisible(true);
		
	

}}
