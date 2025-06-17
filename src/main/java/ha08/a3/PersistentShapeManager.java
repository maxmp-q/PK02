package ha08.a3;

import ha08.a1.Shape;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersistentShapeManager {
    public static void saveShapesToFile(Collection<? extends Shape> shapes, String filename){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))){
            for(Shape shape : shapes){
                bw.write(shape.toString());
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Shape> loadShapesFromFile(String filename){
        List<Shape> shapes = new ArrayList<>();

        try(FileReader fr = new FileReader(filename)){
            BufferedReader br = new BufferedReader(fr);
            String line;

            while((line = br.readLine()) != null){
                shapes.add(ShapeFactory.fromString(line));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return shapes;
    }

    public static void clearFile(String filename){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
