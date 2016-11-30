import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Calendar;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalenderYMDHMS {

	public static void main(String[] args) {
		
		

		
				
		CalenderYMDHMS cal = new CalenderYMDHMS();
			
				
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						cal.createAndShowGUI();
						
					}
				});

			

		


		Calendar myCalendar = Calendar.getInstance();

		int year = myCalendar.get(Calendar.YEAR);
		int month = myCalendar.get(Calendar.MONTH); // 0 to 11
		int day = myCalendar.get(Calendar.DAY_OF_MONTH);
		int hour = myCalendar.get(Calendar.HOUR);
		int minute = myCalendar.get(Calendar.MINUTE);
		int second = myCalendar.get(Calendar.SECOND);
		String TimeOfDay = " ";
		
		if(hour > 12)hour =hour-12; // do not need {} for one line of code
		if(hour < 12)TimeOfDay = "PM";
		if(hour > 12)TimeOfDay = "AM";
		
	}

		private JPanel createContentPane() {
			JPanel totalGUI = new JPanel();
			
			JPanel mainPanel = new JPanel(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			
			JPanel Y = createSquareJPanel(Color.black, 80);
			c.gridx = 1;
			c.gridy = 0;
			c.fill = GridBagConstraints.NONE;
			mainPanel.add(Y, c);
			
			JPanel M = createSquareJPanel(Color.blue, 80);
			c.gridx = 1;
			c.gridy = 2;
			c.fill = GridBagConstraints.NONE;
			mainPanel.add(M, c);
			/*
			JPanel D = createSquareJPanel(Color.orange, 40);
			c.gridx = 2;
			c.gridy = 0;
			c.fill = GridBagConstraints.VERTICAL;
			mainPanel.add(D, c);
			
			JPanel H = createSquareJPanel(Color.pink, 80);
			c.gridx = 3;
			c.gridheight = 3;
			mainPanel.add(H, c);
			
			JPanel Min = createSquareJPanel(Color.green, 80);
			c.gridx = 0;
			c.gridy = 1;
			c.gridheight = 1;
			c.fill = GridBagConstraints.NONE;
			mainPanel.add(Min, c);
			
			JPanel S = createSquareJPanel(Color.yellow, 80);
			c.gridx = 0;
			c.gridy = 2;
			c.fill = GridBagConstraints.HORIZONTAL;
			mainPanel.add(yellow, c);
			*/
			totalGUI.add(mainPanel);
			
			return totalGUI;
			
		}
			
			public void createAndShowGUI() {
				JFrame.setDefaultLookAndFeelDecorated(true);
				JFrame frame = new JFrame("Calendar Project");
				
				// instantiate, to use a method that builds the panels
				CalenderYMDHMS demo = new CalenderYMDHMS(); 
				// content pane holds all the panels etc that go on the JFrame
				frame.setContentPane(demo.createContentPane());
				
				frame.setSize(400, 400);
				frame.setVisible(true);
				frame.setLocation(1000,400);
			}
				
				private JPanel createSquareJPanel(Color color, int size){
					
					JPanel tempPanel = new JPanel();
					tempPanel.setBackground(color);
					tempPanel.setMinimumSize(new Dimension(size, size));
					tempPanel.setMaximumSize(new Dimension(size, size));
					tempPanel.setPreferredSize(new Dimension(size, size));

					return tempPanel;

				
				}
			
		
		

	}


