package ha08.a2;

import ha08.a1.Shape;

import java.util.*;

public class ShapeAnalyzer {

    public static List<Shape> filterByMinArea(
            Collection<? extends Shape> shapes,
            double minArea
    ) {
        List<Shape> result = new ArrayList<>();

        for (Shape shape : shapes) {
            if (shape.getArea() >= minArea) {
                result.add(shape);
            }
        }
        return result;
    }

    public static Shape findShapeWithMaxArea(
            Collection<? extends Shape> shapes
    ) {
        if(shapes == null || shapes.isEmpty()) return null;
        Shape result = null;

        for(Shape shape : shapes) {
            if(result == null){
                result = shape;
            } else if (shape.getArea() > result.getArea()) {
                result = shape;
            }
        }

        return result;
    }

    public static <T extends Shape> Map<String, List<T>> groupByType(
            Collection<T> shapes
    ) {
        Map<String, List<T>> result = new HashMap<>();

        for (T shape : shapes) {
            String typeName = shape.getClass().getSimpleName();
            result.computeIfAbsent(typeName, k -> new ArrayList<>()).add(shape);
        }
        return result;
    }
}
