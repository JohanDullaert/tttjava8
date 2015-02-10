package stap16;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaInSwing extends JFrame {
	
	private final JTextField textfield = new JTextField();
	private final JButton hoofdletters = new JButton("hoofdletters");
	private final JButton kleineletters = new JButton("kleine letters");
	
	public LambdaInSwing() {
		add(textfield, BorderLayout.NORTH);
		add(hoofdletters, BorderLayout.WEST);
		add(kleineletters, BorderLayout.EAST);
		hoofdletters.addActionListener(
				event -> textfield.setText(textfield.getText().toUpperCase())
				);
		kleineletters.addActionListener(
				event -> textfield.setText(textfield.getText().toLowerCase())
				);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new LambdaInSwing().setVisible(true);;
	}

}
