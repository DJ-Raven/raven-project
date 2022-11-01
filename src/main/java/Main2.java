
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;

import checkbox.JCheckBoxCustom;
import roundedButtonsWithImage.RoundedPanel;

@SuppressWarnings("all")

public class Main2 extends javax.swing.JFrame {

	public Main2() throws IOException {

		setAlwaysOnTop(true);

		setTitle("Test");

		setType(Type.UTILITY);

		initComponents();

		this.setVisible(true);

	}

	public static void main(String[] args) {

		try {
			new Main2().setVisible(true);
		} catch (Exception e) {

		}
	}

	public void initComponents() throws IOException {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		setResizable(false);

		JCheckBoxCustom btnNewButton_1 = new JCheckBoxCustom("", SwingConstants.CENTER);

		btnNewButton_1.setText("12345678900000");

		JCheckBoxCustom btnNewButton = new JCheckBoxCustom("", SwingConstants.CENTER);

		btnNewButton.setText("12345678dd9000");

		RoundedPanel panel = new RoundedPanel(100, 100, 10, "");
		panel.setBackground(Color.BLACK);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
								.addGap(30).addComponent(panel, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addGap(79).addComponent(btnNewButton_1,
								GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(92)
				.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(38).addComponent(btnNewButton,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(18).addComponent(panel,
								GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(44, Short.MAX_VALUE)));

		getContentPane().setLayout(layout);

		setSize(new Dimension(532, 433));

		setLocationRelativeTo(null);

	}

	public void actionPerformed(ActionEvent arg0) {

	}

	public void stateChanged(ChangeEvent e) {

	}
}
