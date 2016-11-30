package daydatetime;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.text.DateFormat;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DayDateTime extends JFrame {

	JTextField dateTextField = new JTextField();
	JTextField timeTextField = new JTextField();
	Timer myTimer;

	public DayDateTime(String title) {

		// frame constructor

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exitForm(e);
			}
		});

		setDefaultLookAndFeelDecorated(true);
		setSize(600, 500);
		setLocation(1200, 250);
		setTitle(title);

		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridConstraints = new GridBagConstraints();
		getContentPane().setBackground(Color.blue);

		dateTextField.setText("");
		dateTextField.setColumns(20);
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 0;
		getContentPane().add(dateTextField, gridConstraints);

		timeTextField.setText("");
		timeTextField.setColumns(20);
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 1;
		getContentPane().add(timeTextField, gridConstraints);

		setLocationRelativeTo(null);
		setVisible(true);

		myTimer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myTimerActionPerformed(e);
			}
		});
		// start timer in a thread -- start() is essential for threading
		myTimer.start();
	}// end of constructor

	private void exitForm(WindowEvent e) {

		System.exit(0);
	}

	private void myTimerActionPerformed(ActionEvent e) {

		Date today = new Date();

		dateTextField.setText(DateFormat.getDateInstance(DateFormat.FULL).format(today));
		timeTextField.setText(DateFormat.getTimeInstance().format(today));

	}// end of myTimerActionPerformed

}// end of class
