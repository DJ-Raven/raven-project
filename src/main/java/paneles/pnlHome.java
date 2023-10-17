package paneles;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

import com.copy.textarea.CopyTextArea;
import com.tabbedPane.TabbedPaneRound;
import com.tabbedPane.TabbedPaneTask;
import com.tabbedPane.TabbedPaneVertical;
import com.tabbedPane.TabbedSelector;
import com.tabbedPane.TabbedSelector2;
import com.textarea.NTextArea;
import com.textarea.SimpleTextArea;
import com.textarea.TextArea;

@SuppressWarnings("serial")
public class pnlHome extends javax.swing.JPanel {

	public pnlHome() {

		initComponents();

	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		setBackground(Color.WHITE);

		NTextArea panel = new NTextArea("NTextArea");

		TextArea panel_1 = new TextArea();

		panel_1.setBackground(new Color(238, 238, 238));

		panel_1.setText("TextArea");

		SimpleTextArea panel_2 = new SimpleTextArea();

		panel_2.setBackground(new Color(238, 238, 238));

		CopyTextArea panel_2_1 = new CopyTextArea();

		panel_2_1.setText("CopyTextArea");

		panel_2_1.setBackground(UIManager.getColor("Button.background"));

		TabbedPaneRound panel_3 = new TabbedPaneRound();

		TabbedPaneTask panel_3_1 = new TabbedPaneTask();

		TabbedPaneVertical panel_3_1_1 = new TabbedPaneVertical();

		TabbedSelector panel_3_1_2 = new TabbedSelector();

		panel_3_1_2.setColorBackGround(Color.PINK);

		TabbedSelector2 panel_4 = new TabbedSelector2();

		panel_4.setColorBackGround(Color.LIGHT_GRAY);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);

		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(51).addGroup(layout
						.createParallelGroup(Alignment.TRAILING, false).addComponent(panel, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
						.addComponent(panel_3_1, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE).addComponent(panel_2,
								Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(33)
						.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout
								.createSequentialGroup()
								.addGroup(layout
										.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												panel_2_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
								.addGap(191))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(panel_3_1_2, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(panel_3_1_1, GroupLayout.DEFAULT_SIZE, 337,
														Short.MAX_VALUE))
										.addGap(31).addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 206,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap()))));

		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(31)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(panel_2_1, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
				.addGap(31)
				.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3_1_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_3_1_2, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
				.addGap(228)));

		this.setLayout(layout);

	}

}
