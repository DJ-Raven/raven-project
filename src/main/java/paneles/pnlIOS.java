package paneles;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.checkbox.CheckBoxCustom;
import com.radiobutton.RadioButtonCustom;
import com.slider.JSliderCustom;
import com.slider.JSliderCustom2;
import com.spinner.decimal.DecimalSpinner;
import com.spinner.simple.Spinner;

public class pnlIOS extends javax.swing.JPanel {

	private Spinner panel;

	public pnlIOS() {

		initComponents();

	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		setBackground(new java.awt.Color(255, 255, 255));

		panel = new Spinner();

		DecimalSpinner panel_1 = new DecimalSpinner();

		JSliderCustom panel_2 = new JSliderCustom();

		JSliderCustom2 panel_2_1 = new JSliderCustom2();

		RadioButtonCustom panel_4 = new RadioButtonCustom("RadioButtonCustom");

		CheckBoxCustom panel_2_2 = new CheckBoxCustom("CheckBoxCustom");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);

		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(38)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2_2, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(522, Short.MAX_VALUE)));

		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(Alignment.LEADING, false).addGroup(layout.createSequentialGroup()
						.addGap(27)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(35).addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_2_2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(256, Short.MAX_VALUE)));

		this.setLayout(layout);

	}

}
