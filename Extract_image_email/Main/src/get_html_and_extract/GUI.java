package get_html_and_extract;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener{
	JLabel lbJLabel, label;
	JButton btButton;
	JTextField textField;
	JTextArea area;
	static String tt;
	public GUI() {
		setSize(800, 500);
		setResizable(false);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		add(p1, BorderLayout.NORTH);
		p1.add(p2);
		p2.add(lbJLabel = new JLabel("Link"));
		p2.add(textField = new JTextField(50));
		p2.add(btButton = new JButton("Click"));
		JPanel p3 = new JPanel();
		add(p3, BorderLayout.CENTER);
		p3.add(label = new JLabel("Results: "));
		p3.add(area = new JTextArea(20, 50));
		btButton.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}
