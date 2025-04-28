package ue03.a2;

import java.util.List;

public class Configuration {

    public final String appName;
    public final List<String> modules;

    public Configuration(String appName, List<String> modules) {
        this.appName = appName;
        this.modules = modules;
    }

    public final void describe(){
        System.out.println("appName: " + appName);
        for(String module : modules){
            System.out.println("modules: " + module);
        }
    }
}
