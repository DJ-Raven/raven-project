package paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import com.buttons.round.NButton;
import com.draganddrop.DragAndDrop;
import com.draganddrop.FileDragAndDrop;
import com.draganddrop.UtilDragAndDrop;
import com.materialfilechooser.JFileChooserPanel;
import com.nativeChooser.NativeFileChooser;

@SuppressWarnings("serial")

public class pnlMarket extends javax.swing.JPanel {

	public pnlMarket() {

		initComponents();

	}

	private void initComponents() {

		setBackground(new java.awt.Color(255, 255, 255));

		JFileChooserPanel lblNewLabel = new JFileChooserPanel("aa", "bb", false);

		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 40));

		FileDragAndDrop panel = new FileDragAndDrop("a", "b", false);

		panel.setButtonFont(new Font("Dialog", Font.PLAIN, 40));

		panel.setRound(true);

		panel.setDashed(true);

		panel.setBackground(Color.WHITE);

		DragAndDrop panel_1 = new DragAndDrop("a");

		panel_1.setText("Suelte aquí los archivos");

		panel_1.setThickness(5);

		panel_1.setAngulo(200);

		panel_1.setBackground(Color.ORANGE);

		try {

			new UtilDragAndDrop(panel_1, panel_1.dragBorder, true, new UtilDragAndDrop.Listener() {

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

		NButton panel_2 = new NButton("Native");

		panel_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					new NativeFileChooser(false, "all");

				}

				catch (Exception e1) {

				}

			}

		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);

		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(48)
				.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE).addGap(53)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
								.addGap(81)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(117, Short.MAX_VALUE)));

		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(26)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(27).addComponent(panel,
										GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(57).addComponent(panel_2,
										GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(413, Short.MAX_VALUE)));

		this.setLayout(layout);

	}

}
