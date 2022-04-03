import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import checkbox.JCheckBoxCustom;
import combo_suggestion.ComboBoxSuggestion;
import combobox.Combobox;
import dynamic_subjtable.Header;
import progressbar.ProgressBarCustom;
import radio_button.RadioButtonCustom;
import scrollbar.ScrollBarCustom;
import slider.JsliderCustom;
import spinner.Spinner;
import text_image.TextImage;
import textarea.TextArea;
import textarea.TextAreaScroll;
import textfield.PasswordField;
import textfield.TextField;
import textfield_suggestion.TextFieldSuggestion;

@SuppressWarnings("serial")

public class Test extends javax.swing.JFrame {

	private static Spinner spinner1;

	private JCheckBoxCustom jCheckBoxCustom1;

	private JCheckBoxCustom jCheckBoxCustom2;

	private JCheckBoxCustom jCheckBoxCustom3;

	private JCheckBoxCustom jCheckBoxCustom4;

	private JCheckBoxCustom jCheckBoxCustom5;

	Combobox<Object> combobox1;

	private JList<String> jList1;

	public Test() {

		initComponents();

		getContentPane().setBackground(new Color(245, 245, 245));

	}

	public DefaultTableModel getSubTableData() {

		DefaultTableModel data = new DefaultTableModel();

		data.setColumnCount(4);

		data.addRow(new Object[] { new Header("No", 10), new Header("Item"), new Header("Total", 200),
				new Header("Detail", 200) });

		data.addRow(new Object[] { 1, "ABC", "$ 50", getSubTableData1() });

		data.addRow(new Object[] { 1, "Vital", "$ 70", getSubTableData1() });

		data.addRow(new Object[] { 1, "Fanta", "$ 20", getSubTableData1() });

		data.addRow(new Object[] { 1, "Coca", getSubTableData1(), getSubTableData1() });

		return data;

	}

	public DefaultTableModel getSubTableData1() {
		DefaultTableModel data = new DefaultTableModel();
		data.setColumnCount(3);
		data.addRow(new Object[] { new Header("No", 10), new Header("Type"), new Header("Qty") });
		data.addRow(new Object[] { 1, "Unit", "50" });
		data.addRow(new Object[] { 1, "Case", "70" });
		data.addRow(new Object[] { 1, "Box", "3" });
		return data;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })

	private void initComponents() {

		spinner1 = new Spinner();

		spinner1.setEditable(true);

		spinner1.setNegativo(false);

		spinner1.setPonerMinvalor(true);

		spinner1.setValue(1);

		spinner1.setMinValor(1);

		spinner1.setPonerMaxvalor(true);

		spinner1.setMaxValor(10);

		spinner1.getEditor().addKeyListener(new KeyAdapter() {

			@Override

			public void keyReleased(KeyEvent e) {

				// You can change the number of the spinner and put the filter

				// so that you can put integers greater than or equal to zero

				spinner1.ponerFiltro();

			}

		});

		spinner1.setLabelText("Spinner Test");

		jCheckBoxCustom1 = new checkbox.JCheckBoxCustom();

		jCheckBoxCustom2 = new checkbox.JCheckBoxCustom();

		jCheckBoxCustom3 = new checkbox.JCheckBoxCustom();

		jCheckBoxCustom4 = new checkbox.JCheckBoxCustom();

		jCheckBoxCustom5 = new checkbox.JCheckBoxCustom();

		combobox1 = new Combobox<Object>();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jCheckBoxCustom1.setText("jCheckBoxCustom1");

		jCheckBoxCustom2.setBackground(new java.awt.Color(231, 49, 32));

		jCheckBoxCustom2.setText("jCheckBoxCustom1");

		jCheckBoxCustom3.setBackground(new java.awt.Color(255, 102, 0));

		jCheckBoxCustom3.setText("jCheckBoxCustom1");

		jCheckBoxCustom4.setBackground(new java.awt.Color(21, 129, 28));

		jCheckBoxCustom4.setText("jCheckBoxCustom1");

		jCheckBoxCustom5.setSelected(true);

		jCheckBoxCustom5.setText("jCheckBoxCustom1");

		jCheckBoxCustom5.setEnabled(false);

		ComboBoxSuggestion<Object> comboBoxSuggestion2 = new ComboBoxSuggestion<Object>();

		comboBoxSuggestion2.setEditable(false);

		comboBoxSuggestion2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afghanistan", "Albania",
				"Algeria", "Andorra", "Angola", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba",
				"Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus",
				"Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil",
				"Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Canary Islands",
				"Cape Verde Islands", "Cayman islands", "Central African Republic", "Chad", "Chile", "China",
				"Colombia", "Comoros", "Congo", "Cook Islands", "Costa Rica", "Croatia", "Cuba", "Cyprus",
				"Czech Republic", "Democratic Republic of the Congo (Zaire)", "Denmark", "Djibouti", "Dominica",
				"Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea",
				"Estonia", "Ethiopia", "Federated States of Micronesia", "Fiji", "Finland", "France", "French Guyana",
				"French Polynesia", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Greenland", "Grenada",
				"Guatemala", "Guinea", "Guinea Bissau", "Guyana", "Haiti", "Honduras", "Hong Kong", "Hungary",
				"Iceland", "India", "Indonesia", "Iran", "Iraq", "Israel", "Italy", "Ivory Coast/C�te d�Ivoire",
				"Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kosovo", "Kuwait", "Kyrgyzstan",
				"Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg",
				"Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands",
				"Martinique", "Mauritania", "Mauritius", "Mexico", "Moldova", "Monaco", "Mongolia", "Montenegro",
				"Morocco", "Mozambique", "Myanmar (Burma)", "Namibia", "Nauru", "Nepal", "New Caledonia", "New Zealand",
				"Nicaragua", "Niger", "Nigeria", "North Korea", "Norway", "Oman", "Pakistan", "Palau", "Palestine",
				"Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn Islands", "Poland",
				"Portugal", "Puerto Rico", "Qatar", "Republic of Ireland", "Republic of San Marino", "Romania",
				"Russia", "Rwanda", "Samoa", "Sao Tome", "Saudi Arabia", "Scotland", "Senegal", "Serbia", "Seychelles",
				"Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa",
				"South Korea", "Spain", "Sri Lanka", "St. Kitts and Nevis", "St. Lucia",
				"St. Vincent and The Grenadines", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria",
				"Taiwan", "Tajikistan", "Tanzania", "Thailand", "The Netherlands", "The Vatican", "Togo", "Tonga",
				"Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine",
				"United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu",
				"Venezuela", "Vietnam", "Wales", "West Bank and Gaza", "Western Sahara", "Yemen", "Zambia",
				"Zimbabwe" }));

		combobox1.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Item1", "Item2", "Item3", "Item1", "Item2", "Item3", "Item1", "Item2", "Item3" }));

		combobox1.setSelectedIndex(-1);

		combobox1.setLabeText("Combo Custom");

		JButton btnNewButton = new JButton("Table");

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				new Table().setVisible(true);

			}

		});

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));

		ProgressBarCustom progressBarCustom4 = new ProgressBarCustom();

		ProgressBarCustom progressBarCustom3 = new ProgressBarCustom();

		ProgressBarCustom progressBarCustom2 = new ProgressBarCustom();

		ProgressBarCustom progressBarCustom1 = new ProgressBarCustom();

		progressBarCustom1.setValue(40);

		progressBarCustom2.setForeground(new java.awt.Color(121, 45, 201));

		progressBarCustom2.setValue(40);

		progressBarCustom2.setColorString(new java.awt.Color(175, 35, 35));

		progressBarCustom3.setForeground(new java.awt.Color(106, 147, 44));

		progressBarCustom3.setValue(60);

		progressBarCustom3.setColorString(new java.awt.Color(237, 223, 27));

		progressBarCustom4.setForeground(new java.awt.Color(41, 179, 111));

		progressBarCustom4.setValue(50);

		RadioButtonCustom radioButtonCustom1 = new RadioButtonCustom();

		RadioButtonCustom radioButtonCustom2 = new RadioButtonCustom();

		RadioButtonCustom radioButtonCustom3 = new RadioButtonCustom();

		RadioButtonCustom radioButtonCustom4 = new RadioButtonCustom();

		radioButtonCustom1.setText("radioButtonCustom1");

		radioButtonCustom2.setBackground(new java.awt.Color(19, 146, 57));

		radioButtonCustom2.setSelected(true);

		radioButtonCustom2.setText("radioButtonCustom1");

		radioButtonCustom3.setBackground(new java.awt.Color(186, 118, 11));

		radioButtonCustom3.setText("radioButtonCustom1");

		radioButtonCustom4.setSelected(true);

		radioButtonCustom4.setText("radioButtonCustom1");

		radioButtonCustom4.setEnabled(false);

		ScrollBarCustom scrollBarCustom1 = new ScrollBarCustom();

		scrollBarCustom1.setOrientation(JScrollBar.HORIZONTAL);

		scrollBarCustom1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);

		ScrollBarCustom vertical = new ScrollBarCustom();

		vertical.setForeground(new java.awt.Color(170, 83, 242));

		JScrollPane scroll = new JScrollPane();

		scroll.setBorder(null);

		JsliderCustom jsliderCustom1 = new JsliderCustom();

		jsliderCustom1.setOrientation(SwingConstants.VERTICAL);

		JsliderCustom jsliderCustom2 = new JsliderCustom();

		jsliderCustom2.setOrientation(SwingConstants.VERTICAL);

		JsliderCustom jsliderCustom3 = new JsliderCustom();

		jsliderCustom3.setOrientation(SwingConstants.VERTICAL);

		jsliderCustom1.setOrientation(javax.swing.JSlider.VERTICAL);

		jsliderCustom2.setForeground(new java.awt.Color(30, 151, 48));

		jsliderCustom2.setOrientation(javax.swing.JSlider.VERTICAL);

		jsliderCustom3.setForeground(new java.awt.Color(212, 53, 95));

		jsliderCustom3.setOrientation(javax.swing.JSlider.VERTICAL);

		slider_material.JsliderCustom slider_percent_4 = new slider_material.JsliderCustom();

		slider_material.JsliderCustom slider_percent_2 = new slider_material.JsliderCustom();

		slider_material.JsliderCustom slider_percent_1 = new slider_material.JsliderCustom();

		slider_material.JsliderCustom slider_percent_3 = new slider_material.JsliderCustom();

		slider_percent_1.setBackground(new java.awt.Color(103, 88, 230));

		slider_percent_1.setForeground(new java.awt.Color(103, 88, 230));

		slider_percent_2.setBackground(new java.awt.Color(61, 175, 85));

		slider_percent_2.setForeground(new java.awt.Color(61, 175, 85));

		slider_percent_3.setBackground(new java.awt.Color(59, 142, 206));

		slider_percent_3.setForeground(new java.awt.Color(59, 142, 206));

		slider_percent_4.setBackground(new java.awt.Color(241, 79, 107));

		slider_percent_4.setForeground(new java.awt.Color(115, 118, 120));

		TextImage textImage1 = new TextImage();

		textImage1.setText("HeLLO JAVA");

		textImage1.setFont(new java.awt.Font("Algerian", 1, 50));

		textImage1.setTextImage(new javax.swing.ImageIcon(getClass().getResource("/images/image1.jpg")));

		TextAreaScroll textAreaScroll1 = new TextAreaScroll();

		TextArea textArea1 = new TextArea();

		textAreaScroll1.setViewportView(textArea1);

		textAreaScroll1.setLabelText("Material TextArea");

		textArea1.setColumns(20);

		textArea1.setRows(5);

		textAreaScroll1.setViewportView(textArea1);

		TextField textField1 = new TextField();

		TextField textField2 = new TextField();

		PasswordField passwordField1 = new PasswordField();

		PasswordField passwordField2 = new PasswordField();

		textField1.setLabelText("User Name");

		textField2.setLabelText("Email");

		passwordField1.setLabelText("Password");

		passwordField2.setLabelText("Confirm Password");

		passwordField2.setShowAndHide(true);

		TextFieldSuggestion txt = new TextFieldSuggestion();

		TextFieldSuggestion textFieldSuggestion3 = new TextFieldSuggestion();

		txt.setText("textFieldSuggestion2");

		textFieldSuggestion3.setText("textFieldSuggestion2");
		textFieldSuggestion3.setRound(0);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(19)
				.addComponent(
						vertical, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup().addGap(927).addComponent(textAreaScroll1,
								GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(5).addGroup(layout
								.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGroup(layout
										.createParallelGroup(Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup().addGap(8).addGroup(layout
												.createParallelGroup(Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addGap(28)
														.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 143,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(layout.createParallelGroup(Alignment.LEADING)
																.addGroup(layout.createSequentialGroup().addGap(18)
																		.addComponent(slider_percent_1,
																				GroupLayout.PREFERRED_SIZE, 254,
																				GroupLayout.PREFERRED_SIZE))
																.addGroup(layout.createSequentialGroup().addGap(28)
																		.addGroup(layout
																				.createParallelGroup(Alignment.LEADING)
																				.addComponent(slider_percent_3,
																						GroupLayout.PREFERRED_SIZE, 254,
																						GroupLayout.PREFERRED_SIZE)
																				.addGroup(layout.createSequentialGroup()
																						.addComponent(slider_percent_2,
																								GroupLayout.PREFERRED_SIZE,
																								246,
																								GroupLayout.PREFERRED_SIZE)
																						.addGap(18)
																						.addGroup(layout
																								.createParallelGroup(
																										Alignment.LEADING)
																								.addGroup(layout
																										.createSequentialGroup()
																										.addComponent(
																												combobox1,
																												GroupLayout.DEFAULT_SIZE,
																												450,
																												Short.MAX_VALUE)
																										.addPreferredGap(
																												ComponentPlacement.UNRELATED))
																								.addComponent(
																										scrollBarCustom1,
																										GroupLayout.DEFAULT_SIZE,
																										450,
																										Short.MAX_VALUE)))))))
												.addGroup(layout.createSequentialGroup().addGap(4)
														.addComponent(comboBoxSuggestion2, GroupLayout.PREFERRED_SIZE,
																180, GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(slider_percent_4,
																GroupLayout.PREFERRED_SIZE, 254,
																GroupLayout.PREFERRED_SIZE))))
										.addGroup(
												layout.createSequentialGroup()
														.addComponent(jCheckBoxCustom1, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(18)
														.addComponent(jCheckBoxCustom2, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(jCheckBoxCustom3,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18)
														.addComponent(jCheckBoxCustom4, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(89).addComponent(jCheckBoxCustom5,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)))
										.addGap(34).addComponent(textField2, GroupLayout.PREFERRED_SIZE, 144,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGroup(layout
										.createParallelGroup(Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(Alignment.LEADING)
												.addGroup(layout.createParallelGroup(Alignment.TRAILING)
														.addComponent(progressBarCustom4, GroupLayout.PREFERRED_SIZE,
																251, GroupLayout.PREFERRED_SIZE)
														.addComponent(progressBarCustom1, GroupLayout.PREFERRED_SIZE,
																251, GroupLayout.PREFERRED_SIZE))
												.addGroup(layout.createSequentialGroup().addGap(83)
														.addComponent(radioButtonCustom1, GroupLayout.PREFERRED_SIZE,
																143, GroupLayout.PREFERRED_SIZE)
														.addGap(81).addComponent(radioButtonCustom2,
																GroupLayout.PREFERRED_SIZE, 151,
																GroupLayout.PREFERRED_SIZE)))
												.addGap(24))
										.addGroup(layout.createSequentialGroup()
												.addComponent(textImage1, GroupLayout.DEFAULT_SIZE, 478,
														Short.MAX_VALUE)
												.addPreferredGap(ComponentPlacement.RELATED)))
										.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout
												.createSequentialGroup()
												.addGroup(layout.createParallelGroup(Alignment.LEADING)
														.addGroup(layout.createSequentialGroup()
																.addGroup(layout.createParallelGroup(Alignment.TRAILING)
																		.addComponent(progressBarCustom2,
																				GroupLayout.PREFERRED_SIZE, 251,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(progressBarCustom3,
																				GroupLayout.PREFERRED_SIZE, 251,
																				GroupLayout.PREFERRED_SIZE))
																.addGap(18))
														.addGroup(layout.createSequentialGroup()
																.addComponent(spinner1, GroupLayout.DEFAULT_SIZE, 234,
																		Short.MAX_VALUE)
																.addGap(35)))
												.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout
														.createSequentialGroup()
														.addComponent(textFieldSuggestion3, GroupLayout.PREFERRED_SIZE,
																152, GroupLayout.PREFERRED_SIZE)
														.addGap(49).addComponent(txt, GroupLayout.DEFAULT_SIZE, 147,
																Short.MAX_VALUE))
														.addGroup(layout.createSequentialGroup()
																.addComponent(passwordField1,
																		GroupLayout.PREFERRED_SIZE, 144,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED, 60,
																		Short.MAX_VALUE)
																.addComponent(passwordField2,
																		GroupLayout.PREFERRED_SIZE, 144,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(layout.createSequentialGroup()
																.addComponent(textField1, GroupLayout.PREFERRED_SIZE,
																		144, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED, 204,
																		Short.MAX_VALUE))))
												.addGroup(layout.createSequentialGroup()
														.addComponent(radioButtonCustom3, GroupLayout.PREFERRED_SIZE,
																139, GroupLayout.PREFERRED_SIZE)
														.addGap(36)
														.addComponent(radioButtonCustom4, GroupLayout.PREFERRED_SIZE,
																164, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED, 160,
																Short.MAX_VALUE)
														.addComponent(jsliderCustom2, GroupLayout.PREFERRED_SIZE, 18,
																GroupLayout.PREFERRED_SIZE)
														.addGap(100)))))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jsliderCustom1, GroupLayout.PREFERRED_SIZE, 18,
										GroupLayout.PREFERRED_SIZE)
								.addGap(85).addComponent(jsliderCustom3, GroupLayout.PREFERRED_SIZE, 18,
										GroupLayout.PREFERRED_SIZE)))
				.addGap(32))
				.addGroup(layout.createSequentialGroup().addGap(347).addComponent(btnNewButton).addContainerGap(862,
						Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout
										.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
												.addGap(31).addGroup(layout.createParallelGroup(Alignment.BASELINE)
														.addComponent(jCheckBoxCustom1, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(jCheckBoxCustom2, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(jCheckBoxCustom3, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(jCheckBoxCustom4, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(
												layout.createSequentialGroup().addGap(22)
														.addComponent(jCheckBoxCustom5, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGap(30).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(
										progressBarCustom1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE).addComponent(progressBarCustom2,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout
										.createSequentialGroup().addGap(43).addGroup(layout.createParallelGroup(
												Alignment.BASELINE).addComponent(
														progressBarCustom4, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(
														progressBarCustom3, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(
												Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup().addGap(37).addGroup(layout
																.createParallelGroup(Alignment.BASELINE).addComponent(
																		passwordField1, GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(passwordField2,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)))
												.addGroup(layout
														.createSequentialGroup().addGap(6).addComponent(btnNewButton)))
												.addGap(46).addGroup(layout.createParallelGroup(Alignment.BASELINE)
														.addComponent(spinner1, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFieldSuggestion3, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(txt, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textImage1, GroupLayout.PREFERRED_SIZE, 57,
																GroupLayout.PREFERRED_SIZE))))
								.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
								.addGroup(layout
										.createParallelGroup(Alignment.TRAILING).addGroup(layout
												.createSequentialGroup()
												.addGroup(layout
														.createParallelGroup(Alignment.LEADING).addGroup(
																layout.createParallelGroup(Alignment.BASELINE)
																		.addComponent(radioButtonCustom3,
																				GroupLayout.PREFERRED_SIZE, 23,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(radioButtonCustom2,
																				GroupLayout.PREFERRED_SIZE, 23,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(radioButtonCustom4,
																				GroupLayout.PREFERRED_SIZE, 23,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(layout.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(radioButtonCustom1,
																		GroupLayout.PREFERRED_SIZE, 23,
																		GroupLayout.PREFERRED_SIZE)))
												.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout
														.createSequentialGroup().addGap(29)
														.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 215,
																GroupLayout.PREFERRED_SIZE))
														.addGroup(layout.createSequentialGroup().addGap(38)
																.addGroup(layout
																		.createParallelGroup(Alignment.LEADING, false)
																		.addGroup(layout.createSequentialGroup()
																				.addComponent(scrollBarCustom1,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(51).addComponent(
																						combobox1,
																						GroupLayout.PREFERRED_SIZE, 44,
																						GroupLayout.PREFERRED_SIZE))
																		.addGroup(layout.createSequentialGroup()
																				.addGap(8)
																				.addComponent(slider_percent_1,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.RELATED,
																						GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(slider_percent_2,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)))
																.addGap(51).addComponent(
																		slider_percent_3, GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														layout.createParallelGroup(Alignment.LEADING)
																.addGroup(layout
																		.createSequentialGroup().addGap(30)
																		.addComponent(
																				comboBoxSuggestion2,
																				GroupLayout.PREFERRED_SIZE, 35,
																				GroupLayout.PREFERRED_SIZE))
																.addGroup(layout.createSequentialGroup().addGap(12)
																		.addComponent(slider_percent_4,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))))
										.addGroup(layout.createSequentialGroup()
												.addGroup(layout.createParallelGroup(Alignment.LEADING)
														.addComponent(jsliderCustom3, GroupLayout.PREFERRED_SIZE, 200,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jsliderCustom1, GroupLayout.PREFERRED_SIZE, 200,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jsliderCustom2, GroupLayout.PREFERRED_SIZE, 200,
																GroupLayout.PREFERRED_SIZE))
												.addGap(34).addComponent(textAreaScroll1, GroupLayout.PREFERRED_SIZE,
														142, GroupLayout.PREFERRED_SIZE)))
								.addGap(90))
						.addGroup(layout.createSequentialGroup().addContainerGap(418, Short.MAX_VALUE)
								.addComponent(vertical, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
								.addGap(149)));

		jList1 = new JList<String>();

		jList1.setModel(new javax.swing.AbstractListModel<String>() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3",
					"Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3",
					"Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3",
					"Item 4111111111111111111111111111111", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5",
					"Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
		scroll.setViewportView(jList1);

		scroll.setVerticalScrollBar(new ScrollBarCustom());

		ScrollBarCustom sp_1 = new ScrollBarCustom();
		sp_1.setOrientation(JScrollBar.HORIZONTAL);
		scroll.setHorizontalScrollBar(sp_1);
		getContentPane().setLayout(layout);

		pack();

		setLocationRelativeTo(null);

	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Test().setVisible(true);
			}
		});
	}
}
