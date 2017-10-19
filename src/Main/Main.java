package Main;

import BusinessLogic.ShapeManager;
import Presentation.Frame;
import Presentation.OverviewGUI;


public class Main {

    public static void main(String args[]) {


        Frame overviewFrame = new Frame("VAT");
        overviewFrame.addPanel(new OverviewGUI(new ShapeManager()));
        //overviewFrame.addPanel(new ConeGUI());
        //overviewFrame.addPanel(new CylinderGUI());
        //overviewFrame.addPanel(new SphereGui());
//        overviewFrame.addPanel(new SquarePyramidGUI());

    }

}
