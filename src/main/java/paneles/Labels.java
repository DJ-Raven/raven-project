
package paneles;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import com.avatar.round.ImageAvatar;
import com.image.ResizedImage;
import com.label.others.GeometricLabel;
import com.label.others.LabelBackgroundTitle;
import com.label.others.LabelCustom;
import com.label.others.LabelCustom.Forma;
import com.label.others.LabelCustom.Tipo;
import com.label.others.LabelHeader;
import com.label.others.LabelMetric;
import com.label.others.LabelTask;
import com.label.round.LabelRound;
import com.label.round.RoundLabel;
import com.textimage.TextImage;

@SuppressWarnings("serial")
public class Labels extends javax.swing.JPanel {

	public Labels() {

		initComponents();

	}

	private void initComponents() {

		setBackground(new java.awt.Color(255, 255, 255));

		GeometricLabel lblNewLabel = new GeometricLabel("GeometricLabel");

		lblNewLabel.setLados(6);

		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 25));

		LabelBackgroundTitle lblNewLabel_1 = new LabelBackgroundTitle("LabelBackgroundTitle");

		lblNewLabel_1.setForeground(Color.MAGENTA);

		lblNewLabel_1.setBackground(Color.WHITE);

		lblNewLabel_1.setShadowColor(Color.MAGENTA);

		lblNewLabel_1.setLine(Color.BLUE);

		lblNewLabel_1.setTitleOpacity(1.0f);

		LabelCustom lblNewLabel_2 = new LabelCustom("LabelCustom");

		lblNewLabel_2.setStartColor(Color.PINK);

		lblNewLabel_2.setEndColor(Color.ORANGE);

		lblNewLabel_2.setForeground(Color.MAGENTA);

		lblNewLabel_2.setForma(Forma.RECT);

		lblNewLabel_2.setTipo(Tipo.CURVE);

		lblNewLabel_2.setAnchoDeBorde(3.0f);

		lblNewLabel_2.setBackground(Color.PINK);

		lblNewLabel_2.setBorde(Color.RED);

		lblNewLabel_2.setBorde(true);

		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 40));

		LabelHeader lblNewLabel_3 = new LabelHeader("LabelHeader");

		lblNewLabel_3.setColored(true);

		lblNewLabel_3.setIcon(new ImageIcon(Labels.class.getResource("/images/panels/sombra.png")));

		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_3.setDistanciaSombra(2);

		lblNewLabel_3.setDireccionSombra(10);

		lblNewLabel_3.setForeground(Color.MAGENTA);

		lblNewLabel_3.setBackground(Color.PINK);

		lblNewLabel_3.setSombra(Color.GREEN);

		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 30));

		LabelMetric lblNewLabel_4 = new LabelMetric("LabelMetric");

		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_4.setIcon(new ImageIcon(Labels.class.getResource("/images/panels/gradiente.png")));

		lblNewLabel_4.setBackground(Color.WHITE);

		lblNewLabel_4.setDireccionSombra(60);

		lblNewLabel_4.setDistanciaSombra(5);

		lblNewLabel_4.setSombra(Color.MAGENTA);

		lblNewLabel_4.setForeground(Color.PINK);

		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 30));

		LabelTask lblNewLabel_4_1 = new LabelTask("");

		lblNewLabel_4_1.setAngulo(0);

		lblNewLabel_4_1.setOpacity(0.5f);

		lblNewLabel_4_1.setSegundoBorde(true);

		lblNewLabel_4_1.setReflejo(true);

		lblNewLabel_4_1.setFont(new Font("Dialog", Font.PLAIN, 25));

		LabelRound panel = new LabelRound("LabelRound");

		panel.setBorde(Color.ORANGE);

		panel.setBorde(true);

		panel.setAngulo(100);

		panel.setAnchoDeBorde(2.0f);

		panel.setSegundoBorde(Color.BLUE);

		panel.setSegundoBorde(true);

		TextImage panel_1 = new TextImage("Text");

		panel_1.setAngulo(100);

		panel_1.setFont(new Font("Dialog", Font.BOLD, 50));

		panel_1.setIcon(new ImageIcon(Labels.class.getResource("/images/panels/gradiente.png")));

		panel_1.setText("Text Image");

		panel_1.setBackground(Color.LIGHT_GRAY);

		panel_1.setHorizontalAlignment(SwingConstants.CENTER);

		ResizedImage panel_1_1 = new ResizedImage(true);

		panel_1_1.setAlturaTexto(1.9f);

		panel_1_1.setForeground(Color.ORANGE);

		panel_1_1.setBackground(Color.WHITE);

		panel_1_1.setFont(new Font("Dialog", Font.BOLD, 50));

		panel_1_1.setText("Text");

		panel_1_1.setIcon(new ImageIcon(Labels.class.getResource("/img/actualizar.png")));

		panel_1_1.setHorizontalAlignment(SwingConstants.CENTER);

		ImageAvatar panel_1_2 = new ImageAvatar();

		panel_1_2.setImage(new ImageIcon(Labels.class.getResource("/images/panels/gradiente.png")));

		LabelCustom lblNewLabel_2_1 = new LabelCustom("LabelCustom");

		lblNewLabel_2_1.setEndColor(Color.WHITE);

		lblNewLabel_2_1.setStartColor(Color.LIGHT_GRAY);

		lblNewLabel_2_1.setTipo(Tipo.CENTRAL);

		lblNewLabel_2_1.setDistanciaSombra(5);

		lblNewLabel_2_1.setSombra(Color.BLACK);

		lblNewLabel_2_1.setForeground(Color.ORANGE);

		lblNewLabel_2_1.setForma(Forma.TOP);

		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 35));

		lblNewLabel_2_1.setBorde(Color.RED);

		lblNewLabel_2_1.setBorde(true);

		lblNewLabel_2_1.setBackground(Color.PINK);

		lblNewLabel_2_1.setAnchoDeBorde(5.0f);

		RoundLabel panel_1_3 = new RoundLabel("RoundLabel");

		panel_1_3.setHorizontalAlignment(SwingConstants.CENTER);

		panel_1_3.setGrosor(5);

		panel_1_3.setFont(new Font("Dialog", Font.PLAIN, 35));

		panel_1_3.setBackground(Color.PINK);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);

		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 252,
												GroupLayout.PREFERRED_SIZE)
										.addGap(16).addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 277,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(
										layout.createSequentialGroup().addGap(28).addComponent(lblNewLabel_4_1,
												GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addGap(34).addComponent(lblNewLabel_1,
												GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))))
						.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 263,
												GroupLayout.PREFERRED_SIZE)
										.addGap(34).addComponent(panel, GroupLayout.PREFERRED_SIZE, 311,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(panel_1_3, GroupLayout.PREFERRED_SIZE, 288,
												GroupLayout.PREFERRED_SIZE)
										.addGap(30).addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 334,
												GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(32).addComponent(panel_1_1,
												GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addGap(51).addComponent(panel_1_2,
												GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)))))
				.addGap(138)));

		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4_1, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
						.addGap(44)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
								.addComponent(
										lblNewLabel, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 142,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
								.addGap(52)
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 102,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(panel, GroupLayout.PREFERRED_SIZE, 100,
												GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createSequentialGroup().addGap(18).addComponent(panel_1_1,
										GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)))
						.addGap(84)
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_1_3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1_2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGap(348)));

		this.setLayout(layout);

	}

}
