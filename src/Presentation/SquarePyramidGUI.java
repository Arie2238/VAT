package Presentation;

import Domain.Shape;

import javax.swing.*;
import java.awt.*;

public class SquarePyramidGUI extends ShapeGUI {

	private JLabel heightLabel;
	private JTextField lengthField;
	private JTextField heightField;
	private JButton saveButton;
	private JButton cancelButton;


public SquarePyramidGUI(Shape shape, OverviewGUI overviewGUI){
	super(shape, overviewGUI);
	setLayout(new GridBagLayout());

	GridBagConstraints gbc = new GridBagConstraints();
	gbc.anchor = GridBagConstraints.NORTHWEST;
	gbc.insets = new Insets(0,10,0,0);
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbc.weightx = 1;
	gbc.gridx = 0; // Determine starting point x-axis
	gbc.gridy = 0; // Determine starting point y.axis

	heightLabel = new JLabel("Length");
	add(heightLabel, gbc);

	gbc = new GridBagConstraints();
	gbc.insets = new Insets(0,10,5,10);
	gbc.weightx = 1;
	gbc.gridx = 1;
	gbc.gridy = 0;
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbc.gridwidth =2;

	lengthField = new JTextField();
	add(lengthField, gbc);

	gbc = new GridBagConstraints();
	gbc.anchor = GridBagConstraints.NORTHWEST;
	gbc.insets = new Insets(0,10,0,10);
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbc.weightx = 1;
	gbc.gridx = 0; // Determine starting point x-axis
	gbc.gridy = 1; // Determine starting point y.axis

	heightLabel = new JLabel("Height");
	add(heightLabel, gbc);

	gbc = new GridBagConstraints();
	gbc.insets = new Insets(0,10,0,10);
	gbc.weightx = 1;
	gbc.gridx = 1;
	gbc.gridy = 1;
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbc.gridwidth =2;

	heightField = new JTextField();
	add(heightField, gbc);


	gbc = new GridBagConstraints();
	gbc.weightx = 1;
	gbc.insets = new Insets(10,10,0,0);
	gbc.gridx = 1;
	gbc.gridy = 3;
	gbc.fill = GridBagConstraints.HORIZONTAL;

	cancelButton = new JButton(("Cancel"));
	add(cancelButton, gbc);

	gbc = new GridBagConstraints();
	gbc.weightx = 1;
	gbc.insets = new Insets(10,10,0,10);
	gbc.gridx =2;
	gbc.gridy = 3;
	gbc.fill = GridBagConstraints.HORIZONTAL;

	saveButton = new JButton("Save ");
	add(saveButton, gbc);

	}

	@Override
	public Shape toShape() {
		return null;
	}

}