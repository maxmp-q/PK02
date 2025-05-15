package ha05.a3;

public class Calculator1 {
    public static double divide(double a, double b){
        try{
            if(b == 0){
                throw new ArithmeticException("B is zero");
            }
            return a/b;
        } catch (ArithmeticException e){
            System.out.println("error: " + e.getMessage());
        }
        return -1;
    }
    //...
    public static void main(String[] args){
        System.out.println(Calculator1.divide(3, 0));
    }
}