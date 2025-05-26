package ue03.a2;

import java.util.ArrayList;
import java.util.List;

public class CostumConfiguration extends Configuration {
    public CostumConfiguration(String appName, List<String> modules) {
        super(appName, modules);
    }

//    @Override
//    public void describe(){
//
//    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Configuration test = new Configuration("test", list);

//        test.appName = "tester";
//
//        test.modules = new ArrayList<>();

        test.modules.add("test");
    }
}
