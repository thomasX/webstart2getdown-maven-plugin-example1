package info.margreiter.getdown.maven.plugin.example.example1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
/**
 * 
 * created: 14.11.2018
 * @author f3thomas
 *
 */
public class MyApp extends JFrame {

	private static final long serialVersionUID = -8528345679814769262L;

	public MyApp(String[] args) {
		super("MyApp");
		getContentPane().setLayout(new BorderLayout());
		setPreferredSize(new Dimension(500,500));
		Object msg = (null==args) ? "No startingparameters !":args;
		
		DateTimeFormatter parser = ISODateTimeFormat.dateTime();
		org.joda.time.DateTime dateTime = new org.joda.time.DateTime();
		
		
		String timestring		;
		getContentPane().add(new JLabel(    " [ "+dateTime.toString()+" ]   Hello World! (" + msg + ") "));
		pack();
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	
	public static void main(String[] args) {
		new MyApp(args);
	}
}
