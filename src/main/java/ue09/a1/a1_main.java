package ue09.a1;

public class a1_main {
    public static void main(String[] args) {
        FunctionalCircle diameter = radius -> {
            if(radius <= 0){
                return 0.0;
            }
            return 2 * radius;
        };

        FunctionalCircle surface = radius -> {
            if(radius <= 0){
                return 0.0;
            }
            return Math.PI * radius * radius;
        };

        FunctionalCircle circumference = radius -> {
            if(radius <= 0){
                return 0.0;
            }
            return Math.PI * radius * 2;
        };

        System.out.println(diameter.calculate(5));
        System.out.println(diameter.calculate(-5));
        System.out.println(surface.calculate(5));
        System.out.println(surface.calculate(-5));
        System.out.println(circumference.calculate(5));
        System.out.println(circumference.calculate(-5));
    }
}
