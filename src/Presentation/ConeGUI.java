package Presentation;

import Domain.Shape;

import javax.swing.*;
import java.awt.*;

public class ConeGUI extends ShapeGUI {

	private JLabel radiusLabel;
	private JTextField radiusField;
	private JLabel heightLabel;
	private JTextField heightField;
	private JButton saveButton;
	private JButton cancelButton;

	public ConeGUI(Shape shape, OverviewGUI overviewGUI){
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
		radiusField = new JTextField("0.00");
		add(radiusField, gbc);

		gbc = new GridBagConstraints();
		gbc.weightx = 1;
		gbc.insets = new Insets(0, 10, 0, 0);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		heightLabel = new JLabel("Height");
		add(heightLabel, gbc);

		gbc = new GridBagConstraints();
		gbc.weightx = 1;
		gbc.insets = new Insets(0, 10, 0, 0);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 2;
		heightField = new JTextField("0.00");
		add(heightField, gbc);

		gbc = new GridBagConstraints();
		gbc.weightx = 1;
		gbc.insets = new Insets(0, 10, 0, 0);
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		cancelButton = new JButton("Cancel");
		add(cancelButton, gbc);

		gbc = new GridBagConstraints();
		gbc.weightx = 1;
		gbc.insets = new Insets(0, 10, 0, 0);
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		saveButton = new JButton("Save");
		add(saveButton, gbc);
	}

	@Override
	public Domain.Shape toShape() {
		return null;
	}
}