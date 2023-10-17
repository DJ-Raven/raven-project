package paneles;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.buttons.aero.ButtonAero;
import com.buttons.aero.ButtonAeroLeft;
import com.buttons.aero.ButtonAeroRight;
import com.buttons.aero.ButtonAeroRound;
import com.buttons.animated.AnimationButton;
import com.buttons.animated.ButtonCustom;
import com.buttons.animated.EffectButton;
import com.buttons.animated.StyledButton;
import com.buttons.animated.UwpButton;
import com.buttons.onoff.OnOffButton;
import com.buttons.onoff.SwitchButton;
import com.buttons.round.NButton;
import com.buttons.round.RoundedButton;
import com.buttons.shadow.AquaButton;
import com.buttons.shadow.NiceButton;
import com.buttons.shadow.ShadowButton;
import com.buttons.shadow.ShadowButton2;
import com.buttons.simple.GeometricButton;
import com.buttons.simple.MetroButton;
import com.buttons.simple.SimpleButton;
import com.buttons.toggle.ToggleButton;

@SuppressWarnings("serial")
public class Botones extends javax.swing.JPanel {

	public Botones() {

		initComponents();

	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		setBackground(new java.awt.Color(255, 255, 255));

		ButtonAeroLeft btnNewButton_2 = new ButtonAeroLeft("ButtonAeroLeft");

		btnNewButton_2.setForeground(Color.WHITE);

		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 30));

		btnNewButton_2.setAngulo(40);

		btnNewButton_2.setBackground(Color.PINK);

		btnNewButton_2.setBounds(161, 5, 117, 25);

		ButtonAeroRight btnNewButton_3 = new ButtonAeroRight("ButtonAeroRight");

		btnNewButton_3.setFont(new Font("Dialog", Font.PLAIN, 30));

		btnNewButton_3.setBackground(Color.PINK);

		btnNewButton_3.setAngulo(40);

		btnNewButton_3.setBounds(39, 35, 117, 25);

		ButtonAeroRound btnNewButton_1 = new ButtonAeroRound("ButtonAeroRound");

		btnNewButton_1.setBorderPainted(false);

		btnNewButton_1.setFocusPainted(false);

		btnNewButton_1.setContentAreaFilled(false);

		btnNewButton_1.setColorDeSombra(Color.BLACK);

		btnNewButton_1.setForeground(Color.WHITE);

		btnNewButton_1.setAngulo(100);

		btnNewButton_1.setOpaque(true);

		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 30));

		btnNewButton_1.setBackground(Color.ORANGE);

		btnNewButton_1.setBounds(161, 35, 117, 25);

		ButtonAero btnNewButton = new ButtonAero("ButtonAero");

		btnNewButton.setDistanciaDeSombra(4);

		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 35));

		btnNewButton.setColorDeSombra(Color.BLACK);

		btnNewButton.setBackground(Color.PINK);

		btnNewButton.setForeground(Color.WHITE);

		btnNewButton.setBounds(39, 5, 117, 25);

		AnimationButton btnNewButton_4 = new AnimationButton("AnimationButton");

		btnNewButton_4.setEffectColor(Color.LIGHT_GRAY);

		btnNewButton_4.setFont(new Font("Dialog", Font.PLAIN, 25));

		btnNewButton_4.setAngle(100);

		ButtonCustom btnNewButton_4_1 = new ButtonCustom("ButtonCustom");

		btnNewButton_4_1.setFont(new Font("Dialog", Font.PLAIN, 30));

		EffectButton btnNewButton_4_2 = new EffectButton("EffectButton");

		btnNewButton_4_2.setFont(new Font("Dialog", Font.PLAIN, 30));

		btnNewButton_4_2.setOpacity(1f);

		btnNewButton_4_2.setSombra(5);

		StyledButton btnNewButton_4_1_1 = new StyledButton("ButtonCustom");

		btnNewButton_4_1_1.setFont(new Font("Dialog", Font.PLAIN, 30));

		UwpButton btnNewButton_4_1_1_1 = new UwpButton("ButtonCustom");

		btnNewButton_4_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 30));

		OnOffButton btnNewButton_4_1_1_1_1 = new OnOffButton();

		btnNewButton_4_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 30));

		SwitchButton btnNewButton_4_1_1_1_1_1 = new SwitchButton();

		btnNewButton_4_1_1_1_1_1.setForeground(Color.ORANGE);

		btnNewButton_4_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 30));

		NButton btnNewButton_4_1_2 = new NButton("NButton");

		btnNewButton_4_1_2.setBorderColor(Color.BLACK);

		btnNewButton_4_1_2.setBorderPaint(true);

		btnNewButton_4_1_2.setBackground(Color.PINK);

		btnNewButton_4_1_2.setFont(new Font("Dialog", Font.PLAIN, 30));

		RoundedButton btnNewButton_4_1_2_1 = new RoundedButton("RoundedButton");

		btnNewButton_4_1_2_1.setForeground(Color.WHITE);

		btnNewButton_4_1_2_1.setIcon(new ImageIcon(Botones.class.getResource("/images/panels/gradiente.png")));

		btnNewButton_4_1_2_1.setRadius(45);

		btnNewButton_4_1_2_1.setGrosor(3);

		btnNewButton_4_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 30));

		btnNewButton_4_1_2_1.setBorderColor(Color.BLACK);

		btnNewButton_4_1_2_1.setBackground(Color.PINK);

		AquaButton btnNewButton_4_1_2_1_1 = new AquaButton("AquaButton");

		NiceButton btnNewButton_4_1_2_1_2 = new NiceButton("NiceButton");

		btnNewButton_4_1_2_1_2.setSegundoColorDeTexto(Color.WHITE);

		btnNewButton_4_1_2_1_2.setSegundoColor(Color.RED);

		btnNewButton_4_1_2_1_2.setForeground(Color.PINK);

		btnNewButton_4_1_2_1_2.setBackground(Color.MAGENTA);

		ShadowButton btnNewButton_4_1_2_1_2_1 = new ShadowButton("ShadowButton");

		ShadowButton2 btnNewButton_4_1_2_1_2_2 = new ShadowButton2("ShadowButton2");

		btnNewButton_4_1_2_1_2_2.setBackground(Color.PINK);

		GeometricButton btnNewButton_4_1_2_1_2_2_1 = new GeometricButton("MaterialButton");

		btnNewButton_4_1_2_1_2_2_1.setColorFondo(Color.WHITE);

		btnNewButton_4_1_2_1_2_2_1.setColorGrosor(Color.ORANGE);

		btnNewButton_4_1_2_1_2_2_1.setLados(6);

		btnNewButton_4_1_2_1_2_2_1.setFont(new Font("Dialog", Font.PLAIN, 30));

		btnNewButton_4_1_2_1_2_2_1.setBackground(Color.PINK);

		MetroButton btnNewButton_4_1_2_1_2_2_2 = new MetroButton("MetroButton");

		btnNewButton_4_1_2_1_2_2_2.setColorTextNormal(Color.WHITE);

		btnNewButton_4_1_2_1_2_2_2.setColorTextPressed(Color.WHITE);

		btnNewButton_4_1_2_1_2_2_2.setColorPressed(Color.LIGHT_GRAY);

		btnNewButton_4_1_2_1_2_2_2.setColorNormal(Color.GRAY);

		btnNewButton_4_1_2_1_2_2_2.setColorHover(Color.ORANGE);

		btnNewButton_4_1_2_1_2_2_2.setBackground(Color.PINK);

		SimpleButton btnNewButton_4_1_2_1_2_2_2_1 = new SimpleButton("SimpleButton");

		btnNewButton_4_1_2_1_2_2_2_1.setColorOver(Color.GRAY);

		btnNewButton_4_1_2_1_2_2_2_1.setColorClick(Color.LIGHT_GRAY);

		btnNewButton_4_1_2_1_2_2_2_1.setColor(Color.ORANGE);

		btnNewButton_4_1_2_1_2_2_2_1.setFont(new Font("Dialog", Font.PLAIN, 30));

		btnNewButton_4_1_2_1_2_2_2_1.setBackground(Color.PINK);

		ToggleButton btnNewButton_4_1_2_1_2_2_2_1_1 = new ToggleButton("SimpleButton");

		btnNewButton_4_1_2_1_2_2_2_1_1.setCircleColorDisabled(Color.ORANGE);

		btnNewButton_4_1_2_1_2_2_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 30));

		btnNewButton_4_1_2_1_2_2_2_1_1.setBackground(Color.PINK);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);

		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(40)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4_1_2, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnNewButton_4_1_2_1, GroupLayout.PREFERRED_SIZE, 312,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_4_1_2_1_2, GroupLayout.PREFERRED_SIZE, 312,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_4_1_2_1_2_2, GroupLayout.PREFERRED_SIZE, 312,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_4_1_2_1_2_2_2, GroupLayout.PREFERRED_SIZE, 312,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_4_1_2_1_2_2_2_1, GroupLayout.PREFERRED_SIZE, 312,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 340,
										Short.MAX_VALUE)
								.addComponent(btnNewButton_4_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton_4_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
				.addPreferredGap(ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4_1_1_1, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1_1, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 180,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_4_1_2_1_1, GroupLayout.PREFERRED_SIZE, 312,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_4_1_1_1_1, GroupLayout.PREFERRED_SIZE, 279,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(
								layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED).addComponent(
										btnNewButton_3, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnNewButton_4_1_2_1_2_2_1, GroupLayout.PREFERRED_SIZE, 312,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 318,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_4_1_2_1_2_1, GroupLayout.PREFERRED_SIZE, 312,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_4_1_2_1_2_2_2_1_1, GroupLayout.PREFERRED_SIZE, 312,
										GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(286, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(27)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
				.addGap(38)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(34)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
				.addGap(33)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4_2, GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
						.addComponent(btnNewButton_4_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(18).addComponent(btnNewButton_4_1_1_1_1,
								GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(35).addComponent(btnNewButton_4_1,
								GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
				.addGap(21)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4_1_2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 48,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1_1_1_1_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 60,
								GroupLayout.PREFERRED_SIZE))
				.addGap(26)
				.addGroup(
						layout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_4_1_2_1, GroupLayout.PREFERRED_SIZE, 48,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_4_1_2_1_1, GroupLayout.PREFERRED_SIZE, 48,
										GroupLayout.PREFERRED_SIZE))
				.addGap(33)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_4_1_2_1_2_1, GroupLayout.PREFERRED_SIZE, 48,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1_2_1_2, GroupLayout.PREFERRED_SIZE, 48,
								GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(31)
								.addComponent(btnNewButton_4_1_2_1_2_2, GroupLayout.PREFERRED_SIZE, 48,
										GroupLayout.PREFERRED_SIZE)
								.addGap(26).addComponent(btnNewButton_4_1_2_1_2_2_2, GroupLayout.PREFERRED_SIZE, 48,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnNewButton_4_1_2_1_2_2_1, GroupLayout.PREFERRED_SIZE, 159,
										GroupLayout.PREFERRED_SIZE)))
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
								.addComponent(btnNewButton_4_1_2_1_2_2_2_1, GroupLayout.PREFERRED_SIZE, 48,
										GroupLayout.PREFERRED_SIZE)
								.addGap(22))
						.addGroup(layout
								.createSequentialGroup().addGap(18).addComponent(btnNewButton_4_1_2_1_2_2_2_1_1,
										GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()))));
		this.setLayout(layout);

	}

}
