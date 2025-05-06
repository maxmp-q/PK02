package ha04.a3;

public class LampDemo {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        lamp.turnOn();
        lamp.setBrightness(40);
        lamp.turnOff();
        lamp.dimToHalf();
        System.out.println("Brightness: " + lamp.getBrightness());
    }
}
