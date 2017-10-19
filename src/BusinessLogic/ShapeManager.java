package BusinessLogic;

import Datastorage.DatabaseDAO;
import Domain.Shape;
import Datastorage.ShapeDAO;

import java.util.ArrayList;

public class ShapeManager {
    private ArrayList<String> shapeTypes;
    private ArrayList<Shape> shapes;
    private ShapeDAO shapeDao;

    public ShapeManager() {
        this.shapeTypes = new ArrayList<String>();
        this.shapeTypes.add("Sphere");
        this.shapeTypes.add("Cylinder");
        this.shapeTypes.add("Cone");
        this.shapeTypes.add("RectangularPrism");
        this.shapeTypes.add("SquarePyramid");

        this.shapes = new ArrayList<Shape>();
    }

    public void save() {
        this.shapeDao = new DatabaseDAO();
        this.shapeDao.save(this.shapes);
    }

    public void load() {
        this.shapeDao = new DatabaseDAO();
        this.shapes = this.shapeDao.load();
    }

    public void delete(Shape shape) {
        this.shapes.remove(shape);

    }

    public void add(Shape shape) {
        this.shapes.add(shape);

        if (shape.getId()==0){
            shape.setId(this.shapes.indexOf(shape)+1);
        }
    }

    public double calculateTotalVolume() {
        double totalVolume = 0.0;
        for (Shape shape : this.shapes) {
            totalVolume += shape.calculateVolume();
        }
        return totalVolume;
    }

    public ArrayList<Shape> getShapes() {
        return this.shapes;
    }

    public ArrayList<String> getShapeTypes() {
        return this.shapeTypes;
    }
}

