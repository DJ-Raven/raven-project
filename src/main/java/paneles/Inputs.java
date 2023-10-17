package paneles;

import java.awt.Color;
import java.awt.Font;
import java.util.LinkedList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.comboBox.comboFont.ComboFont;
import com.comboBox.comboSuggestion.ComboBoxSuggestion;
import com.comboBox.simple.SimpleComboBox;
import com.search.SearchInput;
import com.textField.passwordField.PasswordField;
import com.textField.passwordField.PasswordFieldShadow;
import com.textField.passwordField.PasswordFieldWithBackgroundImage;
import com.textField.passwordField.PasswordFieldWithIcon;
import com.textField.passwordField.PasswordFieldWithPlaceholder;
import com.textField.passwordField.PasswordIcons;
import com.textField.passwordField.SimplePasswordField;
import com.textField.passwordField.SimplePasswordFieldWithIcon;
import com.textField.text.MaterialTextField;
import com.textField.text.NTextField;
import com.textField.text.NewTextField;
import com.textField.text.SimpleTextField;
import com.textField.text.TextFieldIcons;
import com.textField.text.TextFieldShadow;
import com.textField.text.TextFieldSuggestion;
import com.textField.text.TextFieldWithBackgroundImage;
import com.textField.text.TextFieldWithPlaceholder;

@SuppressWarnings("serial")

public class Inputs extends javax.swing.JPanel {

	@SuppressWarnings("rawtypes")

	private ComboBoxSuggestion panel;

	private ComboFont panel1;

	private MaterialTextField panel3;

	public Inputs() {

		initComponents();

	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		setBackground(new java.awt.Color(255, 255, 255));

		panel = new ComboBoxSuggestion<>();

		panel.setFont(new Font("Dialog", Font.PLAIN, 30));

		panel.addItem("Hi");

		panel.addItem("Hello");

		panel.addItem("World");

		panel1 = new ComboFont();

		panel1.setFont(new Font("Dialog", Font.PLAIN, 30));

		SimpleComboBox panel2 = new SimpleComboBox();

		panel2.setFont(new Font("Dialog", Font.PLAIN, 20));

		panel2.setLabeText("Test");

		panel2.addItem("Hi");

		panel2.addItem("Hello");

		panel2.addItem("World");

		panel3 = new MaterialTextField();

		panel3.setText("MaterialTextField");

		NewTextField panel_3_1_1 = new NewTextField();

		panel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);

		panel_3_1_1.setText("NewTextField");

		SimpleTextField panel_3_1_1_1 = new SimpleTextField();

		panel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);

		panel_3_1_1_1.setRound(true);

		panel_3_1_1_1.setBackground(Color.WHITE);

		panel_3_1_1_1.setAngulo(100);

		panel_3_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		panel_3_1_1_1.setText("NTextField");

		panel_3_1_1_1.setGrosor(10);

		NTextField panel_3_1_1_1_1 = new NTextField();

		panel_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);

		panel_3_1_1_1_1.setText("NTextField");

		panel_3_1_1_1_1.setLineColor(Color.RED);

		panel_3_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		TextFieldIcons panel_3_1_1_1_2 = new TextFieldIcons();

		panel_3_1_1_1_2.setSuffixIcon(new ImageIcon(Inputs.class.getResource("/img/market.png")));

		panel_3_1_1_1_2.setPrefixIcon(new ImageIcon(Inputs.class.getResource("/img/chat.png")));

		panel_3_1_1_1_2.setText("TextFieldIcons");

		panel_3_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);

		panel_3_1_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 20));

		panel_3_1_1_1_2.setBackground(Color.WHITE);

		TextFieldShadow panel_3_1_1_1_1_1 = new TextFieldShadow();

		panel_3_1_1_1_1_1.setRound(true);

		panel_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);

		panel_3_1_1_1_1_1.setText("TextFieldShadow");

		panel_3_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		TextFieldSuggestion panel_3_1_1_1_1_1_1 = new TextFieldSuggestion();

		panel_3_1_1_1_1_1_1.setOpaque(true);

		panel_3_1_1_1_1_1_1.setBackground(Color.LIGHT_GRAY);

		panel_3_1_1_1_1_1_1.setRound(45);

		panel_3_1_1_1_1_1_1.setText("TextFieldSuggestion");

		panel_3_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);

		panel_3_1_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		TextFieldWithBackgroundImage image = new TextFieldWithBackgroundImage();

		image.setForeground(Color.WHITE);

		image.setIcon(new ImageIcon(Inputs.class.getResource("/images/panels/gradiente.png")));

		image.setText("TextFieldWithBackgroundImage");

		image.setHorizontalAlignment(SwingConstants.CENTER);

		image.setFont(new Font("Dialog", Font.PLAIN, 20));

		TextFieldWithPlaceholder image_1 = new TextFieldWithPlaceholder();

		image_1.setColorDeTextoBackground(Color.WHITE);

		image_1.setLeft(true);

		image_1.setBackground(Color.LIGHT_GRAY);

		image_1.setRound(true);

		image_1.setHorizontalAlignment(SwingConstants.CENTER);

		image_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		PasswordField image_2 = new PasswordField();

		image_2.setText("TextFieldWithBackgroundImage");

		image_2.setHorizontalAlignment(SwingConstants.CENTER);

		image_2.setFont(new Font("Dialog", Font.PLAIN, 20));

		PasswordFieldShadow image_2_1 = new PasswordFieldShadow();

		image_2_1.setText("TextFieldWithBackgroundImage");

		image_2_1.setHorizontalAlignment(SwingConstants.CENTER);

		image_2_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		PasswordFieldWithBackgroundImage image_2_1_1 = new PasswordFieldWithBackgroundImage();

		image_2_1_1.setIcon(new ImageIcon(Inputs.class.getResource("/images/panels/gradiente.png")));

		image_2_1_1.setText("TextFieldWithBackgroundImage");

		image_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);

		image_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		PasswordFieldWithIcon image_2_1_1_1 = new PasswordFieldWithIcon();

		image_2_1_1_1.setText("PasswordFieldWithIcon");

		image_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);

		image_2_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		PasswordFieldWithPlaceholder image_2_1_1_1_1 = new PasswordFieldWithPlaceholder();

		image_2_1_1_1_1.setText("PasswordFieldWithIcon");

		image_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);

		image_2_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		PasswordIcons image_2_1_1_1_1_1 = new PasswordIcons();

		image_2_1_1_1_1_1.setText("PasswordFieldWithIcon");

		image_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);

		image_2_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		SimplePasswordField image_2_1_1_2 = new SimplePasswordField();

		image_2_1_1_2.setText("TextFieldWithBackgroundImage");

		image_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);

		image_2_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 20));

		SimplePasswordFieldWithIcon image_2_1_1_2_1 = new SimplePasswordFieldWithIcon(0);

		image_2_1_1_2_1.setText("ss");

		image_2_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);

		image_2_1_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 20));

		LinkedList<String> lista = new LinkedList<>();

		lista.add("Arte");

		lista.add("Basic");

		lista.add("Casa");

		lista.add("Dedal");

		lista.add("murcielago");

		lista.add("barba");

		lista.add("banana");

		lista.add("abrazo");

		lista.add("candado");

		lista.add("empacar");

		lista.add("poco");

		lista.add("domingo");

		lista.add("dedo");

		lista.add("adios");

		lista.add("felicitacion");

		lista.add("facil");

		lista.add("afiche");

		lista.add("galpon");

		lista.add("agua");

		lista.add("grito");

		lista.add("huelga");

		lista.add("hundir");

		lista.add("ahora");

		lista.add("jueves");

		lista.add("agujero");

		lista.add("juego");

		lista.add("koala");

		lista.add("kilo");

		lista.add("kilometro");

		lista.add("luminoso");

		lista.add("lampara");

		lista.add("alguien");

		lista.add("mar");

		lista.add("moto");

		lista.add("amigo");

		lista.add("novedad");

		lista.add("nacer");

		lista.add("anoche");

		lista.add("pisada");

		lista.add("pasto");

		lista.add("aplastar");

		lista.add("quitar");

		lista.add("querer");

		lista.add("aquejar");

		lista.add("receta");

		lista.add("arco");

		lista.add("cantar");

		lista.add("saludo");

		lista.add("aspirar");

		lista.add("camas");

		lista.add("trompeta");

		lista.add("tornillo");

		lista.add("gato");

		lista.add("viento");

		lista.add("vender");

		lista.add("avion");

		lista.add("xenofobia");

		lista.add("exageracion");

		lista.add("exito");

		lista.add("yerba");

		lista.add("ayer");

		lista.add("ya");

		lista.add("zorro");

		lista.add("zapato");

		lista.add("azul");

		SearchInput image_2_2 = new SearchInput(lista);

		image_2_2.setText("SearchInput");

		image_2_2.setHorizontalAlignment(SwingConstants.CENTER);

		image_2_2.setFont(new Font("Dialog", Font.PLAIN, 20));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);

		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(60)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel1, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_1_1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_1_1_1_1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(image, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(image_2_1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(image_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(image_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(image_2, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(image_2_2, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE))
				.addGap(30)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(image_2_1_1_2, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(image_1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel2, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel3, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_1_1_1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_1_1_1_2, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(image_2_1_1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(image_2_1_1_1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
						.addComponent(image_2_1_1_2_1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(239, Short.MAX_VALUE)));

		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(51).addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(31)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(28)
								.addComponent(panel_3_1_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addGap(38).addComponent(panel_3_1_1_1_1, GroupLayout.PREFERRED_SIZE, 46,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(panel_3_1_1_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addGap(27)
								.addComponent(
										panel_3_1_1_1_2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(panel_3_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 46,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_3_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 46,
												GroupLayout.PREFERRED_SIZE))))
				.addGap(37)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(image_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(image, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
				.addGap(27)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(image_2_1_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(image_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
				.addGap(35)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(image_2_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(image_2_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
				.addGap(16)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(image_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(image_2_1_1_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
				.addGap(26)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(image_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addComponent(image_2_1_1_2_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
				.addGap(49).addComponent(image_2_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
				.addGap(71)));

		this.setLayout(layout);

	}

}
