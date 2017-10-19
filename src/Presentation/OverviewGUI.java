package Presentation;


import BusinessLogic.ShapeManager;
import Domain.Shape;
import Domain.Sphere;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;


public class OverviewGUI extends JPanel {


    private JLabel shapeLabel;
    private JComboBox shapeSelectorField;
    private JLabel totalVolumeLabel;
    private JTextField totalVolumeField;
    private JScrollPane shapeListField;
    private JList<Shape> shapeList;
    private JButton totalVolumeButton;
    private JButton addButton;
    private JButton deleteButton;
    private JButton saveButton;
    private JButton loadButton;
    private JButton editButton;
    private JButton importButton;
    private JButton exportButton;
    private ShapeManager shapeManager;


    GridBagConstraints gbc = new GridBagConstraints();

    public OverviewGUI(ShapeManager shapeManager) {
        this.shapeManager = shapeManager;
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        //align uiteinden

        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 1;
        gbc.gridx = 0; //bepaal startplaats x-as
        gbc.gridy = 0; //bepaal startplaats y-as

        shapeLabel = new JLabel("Shape");

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 10, 0, 0);

        add(shapeLabel, gbc);

        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.gridx = 1;
        gbc.gridy = 0;
        shapeSelectorField = new JComboBox();
        for (String item : this.shapeManager.getShapeTypes()) {
            this.shapeSelectorField.addItem(item);
        }
        add(shapeSelectorField, gbc);


        gbc.weightx = 1;
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        totalVolumeLabel = new JLabel("Total Volume");
        add(totalVolumeLabel, gbc);


        gbc.weightx = 1;
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        totalVolumeField = new JTextField("");
        add(totalVolumeField, gbc);


        gbc.weightx = 1;
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.gridheight = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        shapeList = new JList(this.shapeManager.getShapes().toArray());
        shapeListField = new JScrollPane(shapeList);
        add(shapeListField, gbc);

        gbc = new GridBagConstraints();

        gbc.weightx = 1;
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        totalVolumeButton = new JButton("Calculate Total Volume");
        totalVolumeButton.addActionListener(new OverviewButtonHandler(this));
        add(totalVolumeButton, gbc);

        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.gridx = 1;
        gbc.gridy = 5;
        deleteButton = new JButton("Delete Shape");
        deleteButton.addActionListener(new OverviewButtonHandler(this));
        add(deleteButton, gbc);

        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.gridx = 1;
        gbc.gridy = 6;
        saveButton = new JButton("Save Shape");
        saveButton.addActionListener(new OverviewButtonHandler(this));
        add(saveButton, gbc);

        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.gridx = 1;
        gbc.gridy = 7;
        loadButton = new JButton("Load Shapes");
        loadButton.addActionListener(new OverviewButtonHandler(this));
        add(loadButton, gbc);

        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.gridx = 1;
        gbc.gridy = 8;
        addButton = new JButton("Add Shape");
        addButton.addActionListener(new OverviewButtonHandler(this));
        add(addButton, gbc);

        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.gridx = 1;
        gbc.gridy = 9;
        editButton = new JButton("Edit Shape");
        editButton.addActionListener(new OverviewButtonHandler(this));
        add(editButton, gbc);

        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.gridx = 1;
        gbc.gridy = 10;
        importButton = new JButton("Import Shapes");
        importButton.addActionListener(new OverviewButtonHandler(this));
        add(importButton, gbc);

        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.gridx = 1;
        gbc.gridy = 11;
        exportButton = new JButton("Export shapes");
        exportButton.addActionListener(new OverviewButtonHandler(this));
        add(exportButton, gbc);


    }

    public ShapeManager getShapeManager() {
        return shapeManager;
    }

    public void refreshShapeList() {
        this.shapeList.setListData(new Vector<>(this.shapeManager.getShapes()));
    }

    public class OverviewButtonHandler implements ActionListener {
        private OverviewGUI overviewGUI;

        public OverviewButtonHandler(OverviewGUI overviewGUI) {
            this.overviewGUI = overviewGUI;
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == deleteButton) {
                shapeManager.delete(shapeList.getSelectedValue());
                refreshShapeList();
            }
            if (e.getSource() == saveButton) {
                shapeManager.save();
            }
            if (e.getSource() == loadButton) {
                shapeManager.load();
                refreshShapeList();
            }
            if (e.getSource() == totalVolumeButton) {
                totalVolumeField.setText(String.format("%.2f", shapeManager.calculateTotalVolume()));
            }
            if (e.getSource() == addButton) {
                String shapeType = shapeSelectorField.getSelectedItem().toString();
                Frame frame = new Frame(shapeType);

                System.out.println(shapeType);
                switch (shapeType) {
                    case "Sphere":
                        frame.addPanel(new SphereGui(new Sphere(0.0), this.overviewGUI));
                        break;
                }

                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }

            if (e.getSource() == editButton) {
                Shape shape = shapeList.getSelectedValue();
                Frame frame = new Frame(shape.getType());

                switch (shape.getType()) {
                    case "Sphere":
                        frame.addPanel(new SphereGui((Sphere) shape, this.overviewGUI));
                        break;
                }
            }

            System.out.println("wrong text use");

        }

    }
}


