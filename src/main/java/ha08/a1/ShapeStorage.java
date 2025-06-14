package ha08.a1;

import java.util.ArrayList;

public class ShapeStorage<T extends Shape> extends ArrayList<T> {
    public double getTotalArea(){
        double sum = 0;
        for(T t: this){
            sum += t.getArea();
        }
        return sum;
    }

    public void displayAllShapes(){
        for (T t : this) {
            System.out.println(t.toString());
        }
    }

    public <U extends T> void importLargeShapes(ShapeStorage<U> other, double minArea){
        for(U u: other){
            if(u.getArea() > minArea){
                this.add(u);
            }
        }
    }
}
