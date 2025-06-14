package ha08.a3;

import ha08.a1.Circle;
import ha08.a1.Rectangle;
import ha08.a1.Shape;

import java.lang.IllegalArgumentException;

public class ShapeFactory {

    public static Shape fromString(String input) {
        if (input == null || !input.contains(":")) {
            throw new IllegalArgumentException("Invalid input format: " + input);
        }

        String[] parts = input.split(":", 2);
        String shapeType = parts[0].trim();
        String params = parts[1].trim();

        try {
            if (shapeType.equalsIgnoreCase("Circle")) {
                double radius = extractDouble(params, "radius");
                return new Circle(radius);

            } else if (shapeType.equalsIgnoreCase("Rectangle")) {
                double width = extractDouble(params, "width");
                double length = extractDouble(params, "length");
                return new Rectangle(width, length);

            } else {
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error parsing shape: " + e.getMessage());
        }
    }

    private static double extractDouble(String paramStr, String key) {
        String[] tokens = paramStr.split(",");
        for (String token : tokens) {
            String[] pair = token.trim().split("=");
            if (pair.length == 2 && pair[0].trim().equalsIgnoreCase(key)) {
                return Double.parseDouble(pair[1].trim());
            }
        }
        throw new IllegalArgumentException("Missing or invalid parameter: " + key);
    }
}

