import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;

import com.info.file.InfoFile;
import com.languages.ComboBoxLanguage;
import com.languages.ComboBoxLanguage.Language;
import com.raven.datechooser.DateChooser;
import com.raven.swing.ImageAvatar;
import com.raven.swing.NButton;

import button.SimpleButton;
import button.SimpleButton.FormTypes;
import checkbox.JCheckBoxCustom;
import comboFonts.ComboFont;
import combo_suggestion.ComboBoxSuggestion;
import combobox.SimpleComboBox;
import componente.PopupAlerts;
import drag_and_drop.DragAndDrop;
import drag_and_drop.UtilDragAndDrop;
import javaswingdev.message.MessageDialog;
import javaswingdev.swing.ButtonCustom;
import net.java.dev.colorchooser.demo.CopyColor;
import progressbar.ProgressBarCustom;
import radio_button.RadioButtonCustom;
import roundedButtonsWithImage.ButtonRoundedWithImage;
import scrollbar.ScrollBarCustom;
import simple.chooser.NativeFileChooser;
import slider.JSliderCustom2;
import slider_material.JsliderCustom;
import spinner.DecimalSpinner;
import spinner.Spinner;
import swing.SwitchButton;
import text_image.TextImage;
import textarea.NTextArea;
import textarea.TextAreaScroll;
import textfield.NTextField;
import textfield.PasswordField;
import textfield_suggestion.TextFieldSuggestion;
import util.Mthos;

@SuppressWarnings("all")

public class Main extends javax.swing.JFrame {

	private DateChooser dateChooser;

	DecimalSpinner spinner1;

	private TextFieldSuggestion textField;

	public Main() throws IOException {

		setTitle("Test");

		initComponents();

		this.setVisible(true);

	}

	public static void main(String[] args) throws IOException {

		new Main().setVisible(true);

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		MessageDialog obj = new MessageDialog(this);

		obj.showMessage("¿Quieres", "");

		if (obj.getMessageType() == MessageDialog.MessageType.OK) {

			System.out.println("OK");

		}

	}

	public void initComponents() throws IOException {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		setResizable(false);

		DragAndDrop btnNewButton1 = new DragAndDrop("", "");

		btnNewButton1.setText("Drag And Drop Here");

		btnNewButton1.setBackground(Color.WHITE);

		try {

			new UtilDragAndDrop(btnNewButton1, btnNewButton1.dragBorder, true, new UtilDragAndDrop.Listener() {

				@Override

				public void filesDropped(java.io.File[] archivos) {

					for (File f : archivos) {

						System.out.println(f.getAbsolutePath());

					}

				}

			});

		}

		catch (Exception e1) {

			e1.printStackTrace();

		}

		JCheckBoxCustom jCheckBoxCustom1 = new JCheckBoxCustom("jCheckBoxCustom1", SwingConstants.LEFT);
		jCheckBoxCustom1.setText("c1");
		jCheckBoxCustom1.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JCheckBoxCustom jCheckBoxCustom3 = new JCheckBoxCustom("jCheckBoxCustom1", SwingConstants.LEFT);
		jCheckBoxCustom3.setText("c3");
		jCheckBoxCustom3.setFont(new Font("Tahoma", Font.PLAIN, 16));

		jCheckBoxCustom3.setBackground(new Color(255, 102, 0));

		JCheckBoxCustom jCheckBoxCustom2 = new JCheckBoxCustom("jCheckBoxCustom1", SwingConstants.LEFT);
		jCheckBoxCustom2.setFont(new Font("Tahoma", Font.PLAIN, 16));

		jCheckBoxCustom2.setText("c2");

		jCheckBoxCustom2.setBackground(new Color(231, 49, 32));

		JCheckBoxCustom jCheckBoxCustom5 = new JCheckBoxCustom("jCheckBoxCustom1", SwingConstants.LEFT);
		jCheckBoxCustom5.setFont(new Font("Tahoma", Font.PLAIN, 16));

		jCheckBoxCustom5.setText("c4");

		jCheckBoxCustom5.setSelected(true);

		jCheckBoxCustom5.setEnabled(false);

		CopyColor jCheckBoxCustom4 = new CopyColor(Color.BLACK, true);

		ProgressBarCustom progressBarCustom1 = new ProgressBarCustom();

		progressBarCustom1.setValue(40);

		ProgressBarCustom progressBarCustom4 = new ProgressBarCustom();

		progressBarCustom4.setValue(50);

		progressBarCustom4.setForeground(new Color(41, 179, 111));

		TextImage textImage1 = new TextImage();

		textImage1.setTextImage(new ImageIcon(this.getClass().getResource("/images/image1.jpg")));

		textImage1.setText("HELLO JAVA");

		textImage1.setFont(new Font("Algerian", Font.BOLD, 50));

		spinner1 = new DecimalSpinner();

		spinner1.setIncremento(0.5f);

		spinner1.setMinValor(1f);

		spinner1.setMaxValor(10f);

		spinner1.setLabelText("Test");

		spinner1.getEditor().addKeyListener(new KeyAdapter() {

			@Override

			public void keyReleased(KeyEvent e) {

				try {

					spinner1.ponerFiltro();

				} catch (Exception e1) {

				}

			}

		});

		PasswordField passwordField2 = new PasswordField();

		passwordField2.setShowAndHide(true);

		passwordField2.setLabelText("Confirm Password");

		NTextField textField2 = new NTextField();

		textField2.setLabelText("Email");

		PasswordField passwordField1 = new PasswordField();

		passwordField1.setLabelText("Password");

		NTextField textField1 = new NTextField();

		textField1.setLabelText("User Name");

		TextFieldSuggestion textFieldSuggestion3 = new TextFieldSuggestion();

		textFieldSuggestion3.setText("textFieldSuggestion2");

		textFieldSuggestion3.setRound(0);

		TextFieldSuggestion txt = new TextFieldSuggestion();

		txt.setText("textFieldSuggestion2");

		JsliderCustom jsliderCustom3 = new JsliderCustom();
		jsliderCustom3.setBackground(Color.LIGHT_GRAY);

		jsliderCustom3.setOrientation(SwingConstants.VERTICAL);

		jsliderCustom3.setForeground(new Color(212, 53, 95));

		JsliderCustom jsliderCustom2 = new JsliderCustom();
		jsliderCustom2.setBackground(Color.LIGHT_GRAY);

		jsliderCustom2.setOrientation(SwingConstants.VERTICAL);

		jsliderCustom2.setForeground(new Color(30, 151, 48));

		ScrollBarCustom scrollBarCustom1 = new ScrollBarCustom(null, null);

		scrollBarCustom1.setOrientation(JScrollBar.HORIZONTAL);

		SimpleComboBox<Object> combobox1 = new SimpleComboBox<Object>();

		combobox1.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8", "Item9" }));

		combobox1.setSelectedIndex(-1);

		combobox1.setLabeText("Combo Custom");

		TextAreaScroll textAreaScroll1 = new TextAreaScroll();

		textAreaScroll1.setLabelText("Sample Text");

		RadioButtonCustom radioButtonCustom1 = new RadioButtonCustom("Test");

		radioButtonCustom1.setFont(new Font("Tahoma", Font.PLAIN, 18));

		RadioButtonCustom radioButtonCustom2 = new RadioButtonCustom("Test");

		radioButtonCustom2.setFont(new Font("Tahoma", Font.PLAIN, 18));

		radioButtonCustom2.setSelected(true);

		radioButtonCustom2.setBackground(new Color(19, 146, 57));

		JScrollPane scroll = new JScrollPane();

		scroll.setBorder(null);

		try {

			javax.swing.border.TitledBorder dragBorder = new javax.swing.border.TitledBorder("Drop 'em");

		}

		catch (Exception e1) {

			e1.printStackTrace();

		}

		ComboBoxSuggestion comboBoxSuggestion2 = new ComboBoxSuggestion();

		comboBoxSuggestion2.setFont(new Font("Tahoma", Font.PLAIN, 18));

		comboBoxSuggestion2.setEditable(false);

		comboBoxSuggestion2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Test 1", "Test 2" }));

		ScrollBarCustom vertical = new ScrollBarCustom(null, null);

		vertical.setForeground(new Color(170, 83, 242));

		JsliderCustom jsliderCustom1 = new JsliderCustom();

		jsliderCustom1.setForeground(new Color(103, 88, 230));

		jsliderCustom1.setBackground(new Color(103, 88, 230));

		JsliderCustom slider_percent_2 = new JsliderCustom();

		slider_percent_2.setForeground(new Color(61, 175, 85));

		slider_percent_2.setBackground(new Color(61, 175, 85));

		JsliderCustom slider_percent_3 = new JsliderCustom();

		slider_percent_3.setForeground(new Color(59, 142, 206));

		slider_percent_3.setBackground(new Color(59, 142, 206));

		JsliderCustom slider_percent_4 = new JsliderCustom();

		slider_percent_4.setForeground(new Color(115, 118, 120));

		slider_percent_4.setBackground(new Color(241, 79, 107));

		JsliderCustom jsliderCustom1_1 = new JsliderCustom();
		jsliderCustom1_1.setBackground(Color.LIGHT_GRAY);

		jsliderCustom1_1.setOrientation(SwingConstants.VERTICAL);

		NTextField fecha = new NTextField();

		fecha.setLabelText("Fecha de subida");

		fecha.setFont(new Font("Tahoma", Font.PLAIN, 15));

		fecha.setBackground(new Color(255, 241, 253));

		ButtonRoundedWithImage jButton5 = new ButtonRoundedWithImage("");

		jButton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				dateChooser.showPopup();

			}

		});

		dateChooser = new com.raven.datechooser.DateChooser(2);

		dateChooser.setTextRefernce(fecha);

		jButton5.setIcon(new ImageIcon(this.getClass().getResource("/images/oto.png")));

		ImageAvatar btnNewButton_1 = new ImageAvatar();

		btnNewButton_1.setImage(new ImageIcon(this.getClass().getResource("/images/image1.jpg")));

		Language[] lista = null;

		ComboBoxLanguage translate = new ComboBoxLanguage(this, Language.ESPAÑOL, null);

		translate.box.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

			}

		});

		SimpleButton btnNewButton_2 = new SimpleButton("Test");

		btnNewButton_2.setForeground(Color.ORANGE);

		btnNewButton_2.setBackground(new java.awt.Color(0, 102, 0));

		btnNewButton_2.setColor(new java.awt.Color(0, 102, 0));

		btnNewButton_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));

		btnNewButton_2.setForm(FormTypes.RECTANGLE);

		SwitchButton lblNewLabel = new SwitchButton();

		SimpleButton btnNewButton_2_1 = new SimpleButton("aa");

		btnNewButton_2_1.setForeground(Color.WHITE);

		btnNewButton_2_1.setColorOver(Color.LIGHT_GRAY);

		btnNewButton_2_1.setColor(new Color(0, 102, 0));

		btnNewButton_2_1.setColorClick(new Color(0, 102, 0));

		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));

		btnNewButton_2_1.setRadius(500);

		ComboFont jButton5_1 = new ComboFont();

		jButton5_1.setFont(new Font("Tahoma", Font.PLAIN, 18));

		SimpleButton btnNewButton_2_3 = new SimpleButton("TEST");

		btnNewButton_2_3.setColorOver(Color.DARK_GRAY);

		btnNewButton_2_3.setColorClick(Color.DARK_GRAY);

		btnNewButton_2_3.setColor(Color.BLACK);

		btnNewButton_2_3.setForeground(Color.WHITE);

		btnNewButton_2_3.setText("Test");

		btnNewButton_2_3.setForm(FormTypes.ROUNDED_RECTANGLE);

		btnNewButton_2_3.setFont(new Font("Tahoma", Font.BOLD, 18));

		btnNewButton_2_3.setBackground(new Color(0, 102, 0));

		Spinner spinner1_1 = new Spinner();

		spinner1_1.setMinValor(1);

		spinner1_1.setMaxValor(10);

		spinner1_1.setLabelText("Test");

		SimpleButton btnNewButton = new SimpleButton("Alert");

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));

		btnNewButton.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				// PopupAlerts.mensaje("Hello", 4, 18,
				// this.getClass().getResource("/images/image1.jpg").toString());

				PopupAlerts.mensaje("Hello", 4, 18, null);

			}

		});

		textField = new TextFieldSuggestion();

		textField.setText("Test");

		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));

		textField.setHorizontalAlignment(SwingConstants.CENTER);

		LinkedList<String> list = new LinkedList();

		list.add(Mthos.cleanURL(this.getClass().getResource("/images/image1.jpg").toString()));

		SimpleButton btnNewButton_3 = new SimpleButton("Info Viewer");

		btnNewButton_3.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				try {

					InfoFile info = new InfoFile(list);

					info.setFont(Mthos.getFonts()[0], 1);

					info.setBackgroundColor(Color.LIGHT_GRAY);

					info.setTextColor(Color.BLUE);

					info.file.setForeground(Color.RED);

					info.setVisible(true);

				}

				catch (Exception e1) {

					e1.printStackTrace();
				}

			}

		});

		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));

		NTextField txt_1 = new NTextField();

		txt_1.setText("Text");

		TextFieldSuggestion txt_1_1 = new TextFieldSuggestion();

		txt_1_1.setRound(0);

		txt_1_1.setText("Text");

		RadioButtonCustom radioButtonCustom1_1 = new RadioButtonCustom("Test");

		radioButtonCustom1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));

		radioButtonCustom1_1.setSelected(true);

		radioButtonCustom1_1.setText("c1");

		radioButtonCustom1_1.setEnabled(false);

		RadioButtonCustom radioButtonCustom2_1 = new RadioButtonCustom("Test");

		radioButtonCustom2_1.setSelected(true);

		radioButtonCustom2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));

		radioButtonCustom2_1.setBackground(new Color(186, 118, 11));

		NButton btnNewButton_2_1_1 = new NButton();

		btnNewButton_2_1_1.setBackground(Color.RED);

		btnNewButton_2_1_1.setBorderPaint(true);

		btnNewButton_2_1_1.setText("Text Button");

		btnNewButton_2_1_1.setIcon(null);

		SimpleComboBox comboBoxSuggestion2_1 = new SimpleComboBox();

		comboBoxSuggestion2_1.addItem("SimpleTest");

		comboBoxSuggestion2_1.addItem("Test");

		comboBoxSuggestion2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));

		comboBoxSuggestion2_1.setEditable(false);

		SimpleButton btnNewButton1_1 = new SimpleButton("Test");

		btnNewButton1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

		btnNewButton1_1.setText("Option");

		btnNewButton1_1.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				jButton1ActionPerformed(e);

			}

		});

		ButtonCustom btnNewButton1_1_1 = new ButtonCustom();

		btnNewButton1_1_1.setText("Text");

		btnNewButton1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));

		SimpleButton comboBoxSuggestion2_1_1 = new SimpleButton("Open");

		comboBoxSuggestion2_1_1.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				try {

					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

					NativeFileChooser test = new NativeFileChooser();

					LinkedList<File> lista = new LinkedList<File>();

					lista = test.showOpenFileDialog(false, "images");

					for (int i = 0; i < lista.size(); i++) {

						System.out.println(lista.get(i).getAbsolutePath());

					}

				}

				catch (Exception e1) {

				}

			}

		});

		JSliderCustom2 comboBoxSuggestion2_1_1_1 = new JSliderCustom2();

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout
										.createSequentialGroup()
										.addGroup(layout.createParallelGroup(Alignment.TRAILING)
												.addComponent(progressBarCustom1, GroupLayout.DEFAULT_SIZE, 153,
														Short.MAX_VALUE)
												.addComponent(spinner1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE,
														153, Short.MAX_VALUE)
												.addComponent(spinner1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE,
														75, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														153, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(Alignment.TRAILING)
												.addComponent(textField2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														113, Short.MAX_VALUE)
												.addComponent(passwordField2, Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
												.addComponent(textField, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
												.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 113,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(jsliderCustom3, GroupLayout.PREFERRED_SIZE, 18,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(jsliderCustom2, GroupLayout.PREFERRED_SIZE, 18,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(jsliderCustom1_1, GroupLayout.PREFERRED_SIZE, 18,
												GroupLayout.PREFERRED_SIZE)
										.addGap(8)
										.addComponent(vertical, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addGap(4))
										.addGroup(layout.createSequentialGroup()
												.addComponent(
														textAreaScroll1, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(layout.createParallelGroup(Alignment.LEADING)
														.addComponent(slider_percent_2, GroupLayout.DEFAULT_SIZE, 227,
																Short.MAX_VALUE)
														.addComponent(slider_percent_3, GroupLayout.DEFAULT_SIZE, 227,
																Short.MAX_VALUE))))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout
										.createSequentialGroup().addGap(13)
										.addGroup(layout.createParallelGroup(Alignment.TRAILING, false).addGroup(layout
												.createSequentialGroup()
												.addComponent(btnNewButton_2_1_1, GroupLayout.PREFERRED_SIZE, 91,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
														.addGroup(layout.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textFieldSuggestion3,
																		GroupLayout.PREFERRED_SIZE, 0,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(18).addComponent(btnNewButton1_1_1,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addGroup(
																layout.createSequentialGroup().addGap(24).addComponent(
																		btnNewButton1_1, GroupLayout.PREFERRED_SIZE,
																		121, GroupLayout.PREFERRED_SIZE)))
												.addGap(50))
												.addGroup(layout.createSequentialGroup()
														.addComponent(comboBoxSuggestion2_1, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(
																comboBoxSuggestion2_1_1, GroupLayout.PREFERRED_SIZE,
																125, GroupLayout.PREFERRED_SIZE)))
										.addGap(24).addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(jsliderCustom1, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(slider_percent_4, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
												.addGroup(layout.createParallelGroup(Alignment.LEADING)
														.addGroup(layout.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(comboBoxSuggestion2_1_1_1,
																		GroupLayout.PREFERRED_SIZE, 125,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout.createSequentialGroup().addGap(25).addComponent(
																		btnNewButton_2_1, GroupLayout.PREFERRED_SIZE,
																		91, GroupLayout.PREFERRED_SIZE)))))
								.addGap(41))
								.addGroup(layout.createSequentialGroup()
										.addComponent(
												scroll, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addComponent(translate, GroupLayout.PREFERRED_SIZE, 157,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(Alignment.LEADING)
														.addGroup(layout.createSequentialGroup().addGap(4).addComponent(
																btnNewButton1, GroupLayout.PREFERRED_SIZE, 171,
																GroupLayout.PREFERRED_SIZE))
														.addGroup(layout.createSequentialGroup().addGap(10)
																.addGroup(layout.createParallelGroup(Alignment.TRAILING)
																		.addComponent(radioButtonCustom1_1,
																				GroupLayout.PREFERRED_SIZE, 59,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(radioButtonCustom1,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))
																.addGap(10)
																.addGroup(layout.createParallelGroup(Alignment.LEADING)
																		.addComponent(radioButtonCustom2,
																				GroupLayout.PREFERRED_SIZE, 62,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(radioButtonCustom2_1,
																				GroupLayout.PREFERRED_SIZE, 62,
																				GroupLayout.PREFERRED_SIZE))))
														.addGroup(layout.createParallelGroup(Alignment.LEADING)
																.addGroup(layout.createSequentialGroup().addGap(18)
																		.addComponent(comboBoxSuggestion2,
																				GroupLayout.PREFERRED_SIZE, 125,
																				GroupLayout.PREFERRED_SIZE))
																.addGroup(layout.createSequentialGroup()
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(jButton5_1,
																				GroupLayout.DEFAULT_SIZE, 303,
																				Short.MAX_VALUE)))))
										.addPreferredGap(ComponentPlacement.RELATED, 137, Short.MAX_VALUE)))
						.addGap(255))
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(Alignment.LEADING)
								.addGroup(layout
										.createSequentialGroup().addContainerGap()
										.addComponent(scrollBarCustom1, GroupLayout.PREFERRED_SIZE, 90,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(progressBarCustom4,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(22).addGroup(layout
										.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(jCheckBoxCustom3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jCheckBoxCustom1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 53,
												Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(jCheckBoxCustom2, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jCheckBoxCustom5, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
								.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(layout.createSequentialGroup()
												.addComponent(textImage1, GroupLayout.PREFERRED_SIZE, 349,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 54,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addGap(6).addGroup(layout
												.createParallelGroup(Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(Alignment.TRAILING)
														.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 122,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(txt_1, GroupLayout.PREFERRED_SIZE, 122,
																GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(layout.createParallelGroup(Alignment.LEADING)
																.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(txt, GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(combobox1, GroupLayout.PREFERRED_SIZE, 167,
																GroupLayout.PREFERRED_SIZE))
												.addGroup(layout.createSequentialGroup()
														.addComponent(jCheckBoxCustom4, GroupLayout.PREFERRED_SIZE, 119,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
														.addComponent(txt_1_1, GroupLayout.PREFERRED_SIZE, 122,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 36,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(fecha, GroupLayout.PREFERRED_SIZE, 122,
																GroupLayout.PREFERRED_SIZE)))))
								.addGap(8)
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 89,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton_2_3, GroupLayout.PREFERRED_SIZE, 94,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 318, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(15).addGroup(layout.createParallelGroup(
						Alignment.LEADING).addGroup(
								layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textImage1, GroupLayout.PREFERRED_SIZE, 57,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 50,
												GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
				.addGap(10)
				.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(btnNewButton_3,
						GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE).addGroup(
								layout.createSequentialGroup().addGroup(
										layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jCheckBoxCustom1, GroupLayout.PREFERRED_SIZE, 23,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jCheckBoxCustom2, GroupLayout.PREFERRED_SIZE, 23,
														GroupLayout.PREFERRED_SIZE))
										.addGap(20)
										.addGroup(layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(
														jCheckBoxCustom3, GroupLayout.PREFERRED_SIZE, 23,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 39,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jCheckBoxCustom5, GroupLayout.PREFERRED_SIZE, 23,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txt_1, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(combobox1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txt_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
								.addGap(4)
								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
										.addGroup(layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(fecha, GroupLayout.PREFERRED_SIZE, 49,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(btnNewButton_2_3, GroupLayout.PREFERRED_SIZE, 50,
														GroupLayout.PREFERRED_SIZE))
										.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 36,
												GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createSequentialGroup().addGap(18).addGroup(layout
										.createParallelGroup(Alignment.LEADING)
										.addComponent(progressBarCustom4, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
										.addComponent(scrollBarCustom1, GroupLayout.PREFERRED_SIZE, 28,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jCheckBoxCustom4, GroupLayout.DEFAULT_SIZE, 39,
												Short.MAX_VALUE)))))
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jsliderCustom2, GroupLayout.PREFERRED_SIZE, 200,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jsliderCustom3, GroupLayout.PREFERRED_SIZE, 200,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup().addGroup(layout
										.createParallelGroup(Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(17)
												.addGroup(layout.createParallelGroup(Alignment.LEADING)
														.addComponent(spinner1_1, GroupLayout.PREFERRED_SIZE, 50,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(textField, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(layout.createParallelGroup(Alignment.TRAILING)
														.addComponent(progressBarCustom1, GroupLayout.DEFAULT_SIZE, 44,
																Short.MAX_VALUE)
														.addComponent(passwordField2, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(10)
												.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
														.addComponent(textField2, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(spinner1, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(18)
												.addGroup(layout.createParallelGroup(Alignment.BASELINE)
														.addComponent(textField1, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(layout.createSequentialGroup().addGap(83)
												.addGroup(layout.createParallelGroup(Alignment.BASELINE)
														.addComponent(textFieldSuggestion3, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(48)
												.addGroup(layout.createParallelGroup(Alignment.TRAILING)
														.addComponent(comboBoxSuggestion2_1_1,
																GroupLayout.PREFERRED_SIZE, 47,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(comboBoxSuggestion2_1, GroupLayout.PREFERRED_SIZE,
																47, GroupLayout.PREFERRED_SIZE))))
										.addGap(8))
								.addComponent(vertical, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 252,
										Short.MAX_VALUE)
								.addComponent(jsliderCustom1_1, GroupLayout.PREFERRED_SIZE, 200,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup().addGap(11).addGroup(layout
								.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(btnNewButton1_1, GroupLayout.PREFERRED_SIZE, 55,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(btnNewButton1_1_1, GroupLayout.PREFERRED_SIZE, 55,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(btnNewButton_2_1_1, GroupLayout.PREFERRED_SIZE, 84,
										GroupLayout.PREFERRED_SIZE))
								.addGap(113)))
				.addGap(6)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textAreaScroll1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
						.addGroup(
								layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(Alignment.TRAILING)
												.addComponent(slider_percent_2, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jsliderCustom1, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(36)
										.addGroup(layout.createParallelGroup(Alignment.TRAILING)
												.addComponent(slider_percent_3, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(slider_percent_4, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(24)
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addComponent(comboBoxSuggestion2, GroupLayout.PREFERRED_SIZE, 47,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(layout.createParallelGroup(Alignment.BASELINE)
														.addComponent(radioButtonCustom1, GroupLayout.PREFERRED_SIZE,
																23, GroupLayout.PREFERRED_SIZE)
														.addComponent(radioButtonCustom2, GroupLayout.PREFERRED_SIZE,
																23, GroupLayout.PREFERRED_SIZE))
												.addComponent(comboBoxSuggestion2_1_1_1, GroupLayout.PREFERRED_SIZE, 47,
														GroupLayout.PREFERRED_SIZE))
										.addGap(24)
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addGap(125).addComponent(
														translate, GroupLayout.PREFERRED_SIZE, 35,
														GroupLayout.PREFERRED_SIZE))
												.addComponent(btnNewButton1, GroupLayout.PREFERRED_SIZE, 92,
														GroupLayout.PREFERRED_SIZE)))
								.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
								.addContainerGap())
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(radioButtonCustom2_1, GroupLayout.PREFERRED_SIZE, 23,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(radioButtonCustom1_1, GroupLayout.PREFERRED_SIZE, 23,
												GroupLayout.PREFERRED_SIZE))
								.addGap(21)
								.addComponent(jButton5_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addGap(75)))));

		JList<String> jList1 = null;

		scroll.setViewportView(jList1);

		ScrollBarCustom sp_1 = new ScrollBarCustom(null, null);

		sp_1.setOrientation(JScrollBar.HORIZONTAL);

		scroll.setHorizontalScrollBar(sp_1);

		NTextArea textArea1 = new NTextArea("aaa");

		textArea1.setToolTipText("eeee");

		textArea1.setRows(5);

		textArea1.setColumns(20);

		textAreaScroll1.setViewportView(textArea1);

		jList1 = new JList<String>();

		jList1.setModel(new javax.swing.AbstractListModel<String>() {

			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3",
					"Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3",
					"Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3",
					"Item 4111111111111111111111111111111", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5",
					"Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

			@Override
			public int getSize() {

				return strings.length;

			}

			@Override

			public String getElementAt(int i) {

				return strings[i];

			}

		});

		scroll.setViewportView(jList1);

		scroll.setVerticalScrollBar(new ScrollBarCustom(null, null));

		sp_1.setOrientation(JScrollBar.HORIZONTAL);

		scroll.setHorizontalScrollBar(sp_1);

		getContentPane().setLayout(layout);

		setSize(new Dimension(834, 894));

		setLocationRelativeTo(null);

	}

	public void actionPerformed(ActionEvent arg0) {

	}

	public void stateChanged(ChangeEvent e) {

	}
}
