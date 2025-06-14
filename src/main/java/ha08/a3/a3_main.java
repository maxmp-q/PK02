package ha08.a3;

import ha08.a1.Circle;
import ha08.a1.Rectangle;
import ha08.a1.Shape;

import java.util.ArrayList;
import java.util.List;

public class a3_main {

    public static void main(String[] args) {
        String filename = "./src/main/java/ha08/a3/shapes.txt";
        // 1. Create shapes
        List<Shape> shapesToSave = new ArrayList<>();

        shapesToSave.add(new Circle(3.5));
        shapesToSave.add(new Rectangle(5.5, 3.3));

        // optional: Clear the file before saving to it
        PersistentShapeManager.clearFile(filename);

        // 2. Save to file
        PersistentShapeManager.saveShapesToFile(shapesToSave, filename);

        // 3. Load from file
        List<Shape> loadedShapes = PersistentShapeManager.loadShapesFromFile(filename);

        // 4. Display loaded shapes
        System.out.println("Shapes loaded from file:");
        for (Shape shape : loadedShapes) {
            System.out.println(shape);
        }
    }
}
