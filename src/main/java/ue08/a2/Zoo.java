package ue08.a2;

import java.util.HashMap;

public class Zoo<T> {
    private HashMap<T, Integer> zooInhabitants = new HashMap<>();

    public void addAnimal(T t) {
        zooInhabitants.compute(t, (k, v) -> (v == null) ? 1 : v + 1);

        //alternative
//        if(!zooInhabitants.containsKey(t)){
//            zooInhabitants.put(t, 1);
//        } else {
//            zooInhabitants.put(t, zooInhabitants.get(t) + 1);
//        }
    }
}
