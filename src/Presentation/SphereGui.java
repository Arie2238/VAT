package Presentation;

import Domain.Shape;
import Domain.Sphere;

import javax.swing.*;
import java.awt.*;

public class SphereGui extends ShapeGUI {

	private JLabel radiusLabel;
	private JTextField radiusField;

	public SphereGui(Sphere shape, OverviewGUI overviewGUI){
		super(shape, overviewGUI);

		setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(0, 10, 0, 0);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1;
		gbc.gridx = 0; //bepaal startplaats x-as
		gbc.gridy = 0; //bepaal startplaats y-as

		radiusLabel = new JLabel("Radius");
		add(radiusLabel, gbc);

		gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 10, 0, 0);
		gbc.weightx = 1;
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 2;
		radiusField = new JTextField();
		radiusField.setText(String.format("%.2f", shape.getRadius()));
		add(radiusField, gbc);

		ShapeButtonHandler buttonHandler = new ShapeButtonHandler();

		gbc = new GridBagConstraints();
		gbc.weightx = 1;
		gbc.insets = new Insets(0, 10, 0, 0);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(buttonHandler);
		add(cancelButton, gbc);

		gbc = new GridBagConstraints();
		gbc.weightx = 1;
		gbc.insets = new Insets(0, 10, 0, 0);
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		okButton = new JButton("Save");
		okButton.addActionListener(buttonHandler);
		if (shape.getId() == 0) {
			okButton.setActionCommand("add");
		} else {
			okButton.setActionCommand("edit");
		}

		add(okButton, gbc);
	}

	@Override
	public Shape toShape() {
		this.shape = (Sphere) this.shape;

		try {
			((Sphere) this.shape).setRadius(Double.parseDouble(radiusField.getText().replace(',', '.')));

			if (((Sphere) this.shape).getRadius() == 0.0) {
				radiusLabel.setForeground(Color.RED);
				return null;
			}
		} catch (NumberFormatException exception) {
			radiusLabel.setForeground(Color.RED);
			return null;
		}

		return this.shape;
	}
}