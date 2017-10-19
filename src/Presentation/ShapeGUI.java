package Presentation;

import Domain.Shape;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class ShapeGUI extends JPanel{
	protected Shape shape;
	protected JButton okButton;
	protected JButton cancelButton;
	private OverviewGUI overviewGUI;

	public ShapeGUI(Shape shape, OverviewGUI overviewGUI) {
		this.shape = shape;
		this.overviewGUI = overviewGUI;
	}

	public void close() {
		SwingUtilities.getWindowAncestor(this).dispose();
	}

	abstract public Shape toShape();

	public class ShapeButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == okButton) {
				Shape shape = toShape();
				if (shape != null) {
					if (e.getActionCommand().equals("add")) {
						overviewGUI.getShapeManager().add(shape);
					}
					overviewGUI.refreshShapeList();
					close();
				}
			} else if (e.getSource() == cancelButton) {
				close();
			}
		}
	}
}