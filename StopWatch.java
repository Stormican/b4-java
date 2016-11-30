import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Date;

public class StopWatch extends JFrame {

	// variable stack
	
	// start functionality

	JButton startButton = new JButton();
	JLabel startLabel = new JLabel();
	JTextField startTextField = new JTextField();

	// stop functionality

	JButton stopButton = new JButton();
	JLabel stopLabel = new JLabel();
	JTextField stopTextField = new JTextField();

	// end button

	JButton endButton = new JButton();
	JLabel endLabel = new JLabel();
	JTextField endTextField = new JTextField();

	JButton resetButton = new JButton();

	long startTime;
	long stopTime;
	double elapsedTime;
	boolean timeStarted = false;

	// constructor stack

	public StopWatch(String title) {

		// the non-inheritance way
		// JFrame frame = new JFrame();
		// frame.setSize......

		// the inheritance way (inheritance keyword is "extends")
		setDefaultLookAndFeelDecorated(true);
		setSize(600, 400);
		setLocation(100, 250);
		setTitle(title);

		// Create and set up the content pane.
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridConstraints = new GridBagConstraints();

		// start button 0,0 - NEW individual listener

		startButton.setText("Start Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 0;
		startButton.setBackground(Color.lightGray);
		getContentPane().add(startButton, gridConstraints);

		// NEW! place a listener here just for the start button

		// start label 0,1
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				startTime = System.currentTimeMillis();

				Date startDate = new Date();
				startTextField.setText(startDate.toString());
				// startTextField.setText(String.valueOf(startTime));
				stopTextField.setText("");
				endTextField.setText("");
				timeStarted = true;

			}

		});

		startLabel.setText(" Start System Time: ");
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 0;
		getContentPane().add(startLabel, gridConstraints);

		// start text field 0,2 20 chars wide to get it working

		startTextField.setText("");
		startTextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 0;
		getContentPane().add(startTextField, gridConstraints);

		// ______________________________________________________________________________

		stopButton.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 1;
		stopButton.setBackground(Color.lightGray);
		getContentPane().add(stopButton, gridConstraints);

		// NEW! place a listener here just for the start button

		// start label 0,1
		stopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// handler
				stopButtonactionPerformed(e);
			}

			private void stopButtonactionPerformed(ActionEvent e) {

				if (timeStarted) {
					stopTime = System.currentTimeMillis();
					Date stopDate = new Date();
					stopTextField.setText(stopDate.toString());
					// stopTextField.setText(String.valueOf(stopTime));
					elapsedTime = (stopTime - startTime) / 1000.0;
					endTextField.setText(String.valueOf(elapsedTime));

					JOptionPane.showMessageDialog(null, "Your time is " + elapsedTime + " seconds!");
				}
			}

		});

		stopLabel.setText(" Stop System Time: ");
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 1;
		getContentPane().add(stopLabel, gridConstraints);

		stopTextField.setText("");
		stopTextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 1;
		getContentPane().add(stopTextField, gridConstraints);

		// _________________________________________________________________________________

		endButton.setText("Close All Watches");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 3;
		endButton.setBackground(Color.lightGray);
		getContentPane().add(endButton, gridConstraints);

		// NEW! place a listener here just for the start button

		// start label 0,1
		endButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// handler
				endButtonButtonActionPerformed(e);
			}

			private void endButtonButtonActionPerformed(ActionEvent e) {
				System.exit(0);

			}

		});

		endLabel.setText(" Elapsed Time(s): ");
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 3;
		getContentPane().add(endLabel, gridConstraints);

		// start text field 0,2 20 chars wide to get it working

		endTextField.setText("");
		endTextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 3;
		getContentPane().add(endTextField, gridConstraints);

		// ___________________________________________________________________________________

		resetButton.setText("Reset");
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 4;
		resetButton.setBackground(Color.lightGray);
		getContentPane().add(resetButton, gridConstraints);

		// NEW! place a listener here just for the start button

		// start label 0,1
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// handler
				resetButtonButtonActionPerformed(e);
			}

			private void resetButtonButtonActionPerformed(ActionEvent e) {
				startTextField.setText("");
				stopTextField.setText("");
				endTextField.setText("");

			}

		});

		// ___________________________________________________________________________________

		setVisible(true);

	}// end of the constructor

	private void startButtonActionPerformed(ActionEvent e) {

		// method stack

	}
}// end of class
