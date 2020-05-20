import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel labelUsername = new JLabel("Enter username: ");
		JLabel labelPassword = new JLabel("Enter password: ");

		JTextField textUsername = new JTextField(20);
		JTextField fieldPassword = new JTextField(20);
		JButton exit = new JButton("Login");

		JButton exit1 = new JButton("EXIT");
		exit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit1.setBounds(500, 120, 500, 200);
		GridBagConstraints constraints = new GridBagConstraints();
		JPanel Panel = new JPanel(new GridBagLayout());
		Panel.add(exit1);
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);
		constraints.gridx = 0;
		constraints.gridy = 0;
		Panel.add(labelUsername, constraints);

		constraints.gridx = 1;
		Panel.add(textUsername, constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		Panel.add(labelPassword, constraints);

		constraints.gridx = 1;
		Panel.add(fieldPassword, constraints);

		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		Panel.add(exit1, constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		Panel.add(exit, constraints);
		Panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));
		frame.setSize(500, 500);
		frame.add(Panel);
		frame.setVisible(true);
		JLabel label = new JLabel("Wrong");
		label.setVisible(false);
		JLabel label2 = new JLabel("Right");
		label2.setVisible(false);
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(label2);
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		frame.add(panel);
		exit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (textUsername.getText().equals(fieldPassword.getText())) {
					label2.setVisible(true);
				} else {
					label.setVisible(true);
				}
			}
		});

	}

}
