package ue08.a2;

public abstract class Mammal {
    private String name;

    @Override
    public boolean equals(Object m) {
        if (m instanceof Mammal) {
            return this.getClass().equals(((Mammal)m).getClass());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getClass().hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
