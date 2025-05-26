package ha04.a3;

public interface Dimmable {
    int MAX_BRIGHTNESS = 100;
    void setBrightness(int level);
    int getBrightness();
    default void dimToHalf(){
        setBrightness(MAX_BRIGHTNESS/2);
    }
}
