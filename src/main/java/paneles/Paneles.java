package paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.cards.MaterialCard;
import com.cards.RoundSimpleCard;
import com.cards.SimpleCard;
import com.layout.VerticalGridLayout;
import com.panels.chat.PanelLlamada;
import com.panels.gradient.GradientPanel;
import com.panels.gradient.GradientRound;
import com.panels.gradient.PanelGlowingGradient;
import com.panels.image.ImagePanel;
import com.panels.round.CustomRoundPanel;
import com.panels.round.MaterialPanel;
import com.panels.round.NicePanel;
import com.panels.round.RoundPanel;
import com.panels.round.RoundedPanel;
import com.panels.shadow.ShadowRoundPanel;
import com.panels.translucid.PanelRectTranslucido;
import com.panels.translucid.PanelRectTranslucidoComplete;
import com.panels.translucid.PanelRoundTranslucido;
import com.panels.translucid.PanelRoundTranslucidoComplete;
import com.panels.translucid.PanelTranslucido;
import com.panels.translucid.PanelTranslucidoComplete;
import com.panels.translucid.PanelTranslucidoComplete2;

@SuppressWarnings("serial")
public class Paneles extends javax.swing.JPanel {

	public Paneles() {

		setBackground(Color.WHITE);

		MaterialCard lblNewLabel = new MaterialCard("MaterialCard", "");

		lblNewLabel.setBackground(new Color(192, 192, 192));

		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 20));

		RoundSimpleCard lblNewLabel_1 = new RoundSimpleCard("RoundSimpleCard", "\n \n\r\tText");

		lblNewLabel_1.setHeaderFont(getFont().deriveFont(18f));

		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);

		SimpleCard lblNewLabel_1_1 = new SimpleCard("SimpleCard", "Text");

		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		lblNewLabel_1_1.setBackground(Color.LIGHT_GRAY);

		JPanel panel = new JPanel();

		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));

		panel.setBackground(Color.WHITE);

		panel.setLayout(new VerticalGridLayout(3, 2));

		PanelLlamada panel_7 = new PanelLlamada();

		panel_7.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_8 = new JLabel("New label");

		lblNewLabel_8.setForeground(Color.WHITE);

		lblNewLabel_8.setFont(new Font("Dialog", Font.BOLD, 30));

		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);

		panel_7.add(lblNewLabel_8);

		GradientPanel panel_7_1 = new GradientPanel();

		GradientRound panel_7_1_1 = new GradientRound();

		panel_7_1_1.setLayout(null);

		panel_7_1_1.setBackground(Color.PINK);

		panel_7_1_1.setColorGradient(Color.ORANGE);

		JLabel lblNewLabel_8_1_1 = new JLabel("GradientRound");

		lblNewLabel_8_1_1.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_8_1_1.setForeground(Color.BLACK);

		lblNewLabel_8_1_1.setFont(new Font("Dialog", Font.BOLD, 30));

		lblNewLabel_8_1_1.setBounds(12, 0, 270, 115);

		panel_7_1_1.add(lblNewLabel_8_1_1);

		PanelGlowingGradient panel_8 = new PanelGlowingGradient();

		panel_8.setLayout(new GridLayout(0, 1, 0, 0));

		panel_8.setBorderSize(5);

		panel_8.setBackgroundLight(Color.LIGHT_GRAY);

		panel_8.setBackground(Color.LIGHT_GRAY);

		ImagePanel panel_8_1 = new ImagePanel();

		panel_8_1.setIcon(new ImageIcon(Paneles.class.getResource("/images/panels/gradiente.png")));

		panel_8_1.setBackground(Color.LIGHT_GRAY);

		CustomRoundPanel panel_9 = new CustomRoundPanel();

		panel_9.setBackground(Color.LIGHT_GRAY);

		panel_9.setRoundTopRight(40);

		panel_9.setRoundTopLeft(30);

		panel_9.setRoundBottomRight(10);

		panel_9.setRoundBottomLeft(20);

		MaterialPanel panel_9_1 = new MaterialPanel();

		panel_9_1.setBackground(Color.LIGHT_GRAY);

		panel_9_1.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_11_1 = new JLabel("MaterialPanel");

		lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_11_1.setFont(new Font("Dialog", Font.PLAIN, 35));

		panel_9_1.add(lblNewLabel_11_1);

		NicePanel panel_9_2 = new NicePanel();

		panel_9_2.setBorderColor(Color.ORANGE);

		panel_9_2.setAnchoDeBorde(5.0f);

		panel_9_2.setAngulo(100);

		panel_9_2.setBackground(Color.LIGHT_GRAY);

		panel_9_2.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_11_2 = new JLabel("NicePanel");

		lblNewLabel_11_2.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_11_2.setFont(new Font("Dialog", Font.PLAIN, 35));

		panel_9_2.add(lblNewLabel_11_2);

		RoundedPanel panel_9_2_1 = new RoundedPanel();

		panel_9_2_1.setBackground(Color.LIGHT_GRAY);

		panel_9_2_1.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_11_2_1 = new JLabel("RoundedPanel");

		lblNewLabel_11_2_1.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_11_2_1.setFont(new Font("Dialog", Font.PLAIN, 30));

		panel_9_2_1.add(lblNewLabel_11_2_1);

		ShadowRoundPanel panel_9_2_2 = new ShadowRoundPanel();

		panel_9_2_2.setColorGradient(Color.PINK);

		panel_9_2_2.setBackground(Color.ORANGE);

		panel_9_2_2.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_11_2_2 = new JLabel("ShadowRoundPanel");

		lblNewLabel_11_2_2.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_11_2_2.setFont(new Font("Dialog", Font.BOLD, 30));

		panel_9_2_2.add(lblNewLabel_11_2_2);

		PanelRoundTranslucido panel_10_1 = new PanelRoundTranslucido();

		panel_10_1.setBackground(Color.LIGHT_GRAY);

		panel_10_1.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_12_1 = new JLabel("PanelRoundTranslucido");

		lblNewLabel_12_1.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_12_1.setFont(new Font("Dialog", Font.PLAIN, 30));

		panel_10_1.add(lblNewLabel_12_1);

		PanelRoundTranslucidoComplete panel_10_1_1 = new PanelRoundTranslucidoComplete();

		panel_10_1_1.setColorSecundario(Color.PINK);

		panel_10_1_1.setBackground(Color.LIGHT_GRAY);

		panel_10_1_1.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_12_1_1 = new JLabel("PanelRoundTranslucidoComplete");

		lblNewLabel_12_1_1.setForeground(Color.BLACK);

		lblNewLabel_12_1_1.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_12_1_1.setFont(new Font("Dialog", Font.PLAIN, 30));

		panel_10_1_1.add(lblNewLabel_12_1_1);

		PanelTranslucido panel_10 = new PanelTranslucido();

		RoundPanel panel_10_2 = new RoundPanel();

		PanelRectTranslucido panel_10_3 = new PanelRectTranslucido();

		PanelRectTranslucidoComplete panel_10_3_1 = new PanelRectTranslucidoComplete();

		panel_10_3_1.setColorSecundario(Color.PINK);

		panel_10_3_1.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblNewLabel_14_1 = new JLabel("PanelRectTranslucidoComplete");

		lblNewLabel_14_1.setForeground(Color.BLACK);

		lblNewLabel_14_1.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_14_1.setFont(new Font("Dialog", Font.BOLD, 25));

		panel_10_3_1.add(lblNewLabel_14_1);

		PanelTranslucidoComplete panel_10_4 = new PanelTranslucidoComplete();

		panel_10_4.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_12_2 = new JLabel("PanelTranslucidoComplete");

		lblNewLabel_12_2.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_12_2.setFont(new Font("Dialog", Font.BOLD, 25));

		panel_10_4.add(lblNewLabel_12_2);

		PanelTranslucidoComplete2 panel_10_4_1 = new PanelTranslucidoComplete2();

		panel_10_4_1.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_12_2_1 = new JLabel("PanelTranslucidoComplete2");

		lblNewLabel_12_2_1.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_12_2_1.setFont(new Font("Dialog", Font.BOLD, 25));

		panel_10_4_1.add(lblNewLabel_12_2_1);

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 393,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(panel_8_1,
														GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 303,
														GroupLayout.PREFERRED_SIZE)
												.addGap(37).addComponent(panel_10_2, GroupLayout.PREFERRED_SIZE, 303,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup().addGap(4)
												.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 299,
														GroupLayout.PREFERRED_SIZE)
												.addGap(55).addComponent(panel_9_2, GroupLayout.PREFERRED_SIZE, 299,
														GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_9_1, GroupLayout.PREFERRED_SIZE, 358,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(panel_9_2_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														482, Short.MAX_VALUE)
												.addComponent(panel_10_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
								.addGap(16)
								.addComponent(panel_7_1, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
								.addGap(81)
								.addComponent(panel_7_1_1, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panel_9_2_1, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_10_1, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(panel_10_1_1,
										GroupLayout.PREFERRED_SIZE, 514, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 435,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 435,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(panel, 0, 0, Short.MAX_VALUE)
										.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(panel_10_4_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(panel_10_3_1, GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
								.addGap(18)
								.addComponent(panel_10_4, GroupLayout.PREFERRED_SIZE, 403, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(432, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addContainerGap(885, Short.MAX_VALUE)
										.addComponent(panel_10_3, GroupLayout.PREFERRED_SIZE, 93,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18))
								.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
										.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
												.createSequentialGroup().addGap(25).addGroup(groupLayout
														.createParallelGroup(Alignment.LEADING, false)
														.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 191,
																Short.MAX_VALUE)
														.addComponent(
																lblNewLabel, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(
														groupLayout.createSequentialGroup().addGap(33).addComponent(
																panel, 0, 0, Short.MAX_VALUE))
														.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE,
																		191, GroupLayout.PREFERRED_SIZE)))
												.addPreferredGap(ComponentPlacement.UNRELATED).addGroup(groupLayout
														.createParallelGroup(Alignment.LEADING)
														.addComponent(panel_9_2_1, GroupLayout.PREFERRED_SIZE, 96,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(panel_10_1, GroupLayout.PREFERRED_SIZE, 86,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																panel_10_1_1, GroupLayout.PREFERRED_SIZE, 86,
																GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(
														groupLayout.createSequentialGroup().addGap(27).addGroup(
																groupLayout.createParallelGroup(Alignment.LEADING,
																		false).addComponent(panel_7, 0, 0,
																				Short.MAX_VALUE)
																		.addComponent(panel_7_1,
																				GroupLayout.DEFAULT_SIZE, 88,
																				Short.MAX_VALUE)))
														.addGroup(
																groupLayout
																		.createSequentialGroup().addGap(18)
																		.addComponent(panel_7_1_1, 0, 0,
																				Short.MAX_VALUE)))
												.addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout
														.createParallelGroup(Alignment.LEADING).addComponent(panel_9_1,
																GroupLayout.PREFERRED_SIZE, 142,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(groupLayout.createSequentialGroup().addGroup(
																groupLayout.createParallelGroup(Alignment.LEADING,
																		false)
																		.addGroup(groupLayout.createSequentialGroup()
																				.addGap(15).addComponent(panel_8_1,
																						GroupLayout.PREFERRED_SIZE, 100,
																						GroupLayout.PREFERRED_SIZE))
																		.addComponent(
																				panel_8, GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
																.addGroup(groupLayout.createParallelGroup(
																		Alignment.TRAILING, false)
																		.addGroup(groupLayout.createSequentialGroup()
																				.addGap(10)
																				.addComponent(panel_9, 0, 0,
																						Short.MAX_VALUE))
																		.addGroup(groupLayout.createSequentialGroup()
																				.addGap(18)
																				.addGroup(groupLayout
																						.createParallelGroup(
																								Alignment.TRAILING,
																								false)
																						.addComponent(panel_9_2_2,
																								Alignment.LEADING,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(panel_9_2,
																								Alignment.LEADING,
																								GroupLayout.DEFAULT_SIZE,
																								88, Short.MAX_VALUE))))
																.addGap(26)
																.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 71,
																		GroupLayout.PREFERRED_SIZE))))
										.addGroup(
												groupLayout.createSequentialGroup().addGap(895).addComponent(panel_10_2,
														GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(8).addComponent(panel_10_4,
										GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_10_3_1, GroupLayout.PREFERRED_SIZE, 73,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(panel_10_4_1, GroupLayout.PREFERRED_SIZE, 93,
												GroupLayout.PREFERRED_SIZE)))
						.addGap(25)));

		panel_10_3.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblNewLabel_14 = new JLabel("PanelRectTranslucido");

		lblNewLabel_14.setFont(new Font("Dialog", Font.BOLD, 30));

		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);

		panel_10_3.add(lblNewLabel_14);

		panel_10_2.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_13 = new JLabel("RoundPanel");

		lblNewLabel_13.setForeground(Color.WHITE);

		lblNewLabel_13.setFont(new Font("Dialog", Font.BOLD, 30));

		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);

		panel_10_2.add(lblNewLabel_13);

		panel_10.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_12 = new JLabel("PanelTranslucido");

		lblNewLabel_12.setFont(new Font("Dialog", Font.BOLD, 30));

		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);

		panel_10.add(lblNewLabel_12);

		GridBagLayout gbl_panel_9 = new GridBagLayout();

		gbl_panel_9.columnWidths = new int[] { 299, 0 };

		gbl_panel_9.rowHeights = new int[] { 142, 0 };

		gbl_panel_9.columnWeights = new double[] { 0.0, Double.MIN_VALUE };

		gbl_panel_9.rowWeights = new double[] { 0.0, Double.MIN_VALUE };

		panel_9.setLayout(gbl_panel_9);

		JLabel lblNewLabel_11 = new JLabel("CustomRoundPanel");

		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();

		gbc_lblNewLabel_11.gridx = 0;

		gbc_lblNewLabel_11.gridy = 0;

		panel_9.add(lblNewLabel_11, gbc_lblNewLabel_11);

		lblNewLabel_11.setFont(new Font("Dialog", Font.PLAIN, 30));

		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblNewLabel_10 = new JLabel("PanelGlowingGradient");

		lblNewLabel_10.setFont(new Font("Dialog", Font.PLAIN, 30));

		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_10.setBounds(12, 12, 267, 119);

		panel_8.add(lblNewLabel_10);

		panel_8_1.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_9 = new JLabel("ImagePanel");

		lblNewLabel_9.setForeground(Color.WHITE);

		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_9.setFont(new Font("Dialog", Font.BOLD, 30));

		lblNewLabel_9.setBounds(0, 0, 291, 149);

		panel_8_1.add(lblNewLabel_9);

		panel_7_1.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_8_1 = new JLabel("GradientPanel");

		lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_8_1.setForeground(Color.WHITE);

		lblNewLabel_8_1.setFont(new Font("Dialog", Font.BOLD, 30));

		panel_7_1.add(lblNewLabel_8_1);

		JPanel panel_2 = new JPanel();

		panel_2.setBackground(Color.WHITE);

		panel.add(panel_2);

		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_2 = new JLabel("VerticalLayout");

		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 25));

		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);

		panel_2.add(lblNewLabel_2);

		JPanel panel_1 = new JPanel();

		panel_1.setBackground(Color.WHITE);

		panel.add(panel_1);

		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_3 = new JLabel("B");

		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);

		panel_1.add(lblNewLabel_3);

		JPanel panel_3 = new JPanel();

		panel_3.setBackground(Color.WHITE);

		panel.add(panel_3);

		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_4 = new JLabel("D");

		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);

		panel_3.add(lblNewLabel_4);

		JPanel panel_4 = new JPanel();

		panel_4.setBackground(Color.WHITE);

		panel.add(panel_4);

		panel_4.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_5 = new JLabel("A");

		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);

		panel_4.add(lblNewLabel_5);

		JPanel panel_5 = new JPanel();

		panel_5.setBackground(Color.WHITE);

		panel.add(panel_5);

		panel_5.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_6 = new JLabel("C");

		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);

		panel_5.add(lblNewLabel_6);

		JPanel panel_6 = new JPanel();

		panel_6.setBackground(Color.WHITE);

		panel.add(panel_6);

		panel_6.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_7 = new JLabel("E");

		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);

		panel_6.add(lblNewLabel_7);

		setLayout(groupLayout);

	}

}
