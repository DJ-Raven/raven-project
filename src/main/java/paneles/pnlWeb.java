/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.dialog.popup.VentanaEmergente;
import com.message.alerts.PopupAlerts;
import com.message.alerts.PopupAlerts.AlertType;

public class pnlWeb extends javax.swing.JPanel {

	public pnlWeb() {

		initComponents();

	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		setBackground(new java.awt.Color(255, 255, 255));

		JButton btnNewButton = new JButton("INFO");

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				PopupAlerts alerta = new PopupAlerts();

				alerta.setSize(2000, 200);

				alerta.mensaje("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", AlertType.INFO, 40,
						new ImageIcon(pnlWeb.class.getResource("/img/about.png")).toString());

			}

		});

		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 20));

		JLabel lblNewLabel = new JLabel("PopupAlerts");

		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 40));

		JButton btnSuccess = new JButton("SUCCESS");

		btnSuccess.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				PopupAlerts alerta = new PopupAlerts();

				alerta.mensaje("PopupAlerts", AlertType.SUCCESS, 40, "");

			}

		});

		btnSuccess.setFont(new Font("Dialog", Font.PLAIN, 20));

		JButton btnWarning = new JButton("WARNING");

		btnWarning.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				PopupAlerts alerta = new PopupAlerts();

				alerta.mensaje("PopupAlerts", AlertType.WARNING, 40, "");

			}

		});

		btnWarning.setFont(new Font("Dialog", Font.PLAIN, 20));

		JButton btnError = new JButton("ERROR");

		btnError.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				PopupAlerts alerta = new PopupAlerts();

				alerta.mensaje("PopupAlerts", AlertType.ERROR, 40, "");

			}

		});

		btnError.setFont(new Font("Dialog", Font.PLAIN, 20));

		JButton btnNewButton_1 = new JButton("VentanaEmergente");

		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				new VentanaEmergente(new JFrame(), new JPanel(), "", 200, 200, true);

			}

		});

		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);

		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(143).addComponent(lblNewLabel,
								GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(37).addComponent(btnNewButton,
												GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addGap(25).addComponent(btnWarning,
												GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)))
								.addGap(92)
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnError, GroupLayout.PREFERRED_SIZE, 221,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnSuccess, GroupLayout.PREFERRED_SIZE, 221,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup().addGap(107).addComponent(btnNewButton_1,
								GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(312, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(6)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
						.addGap(37)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSuccess, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
						.addGap(107)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnWarning, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnError, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
						.addGap(67)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(119, Short.MAX_VALUE)));

		this.setLayout(layout);

	}

}
