package ha04.a3;

public class Lamp implements Switchable, Dimmable {
    public boolean on;
    public int brightness;

    @Override
    public void setBrightness(int level) {
        if(this.isOn() && level >= 0 && level <= MAX_BRIGHTNESS){
            this.brightness = level;
        }
    }

    @Override
    public int getBrightness() {
        return this.brightness;
    }

    @Override
    public void turnOn() {
        this.on = true;
    }

    @Override
    public void turnOff() {
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }
}
