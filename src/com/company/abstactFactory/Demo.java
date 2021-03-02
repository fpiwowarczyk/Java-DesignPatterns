package com.company.abstactFactory;

import java.util.NoSuchElementException;

public class Demo {

    private static App configApp() {
        App app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        switch (osName)
        {
            case "mac":
                factory = new MacOSFactory();
                app = new App(factory);
                break;
            case "linux":
                factory = new LinuxFactory();
                app = new App(factory);
                break;
            case "windows":
                factory = new WindowsFactory();
                app = new App(factory);
                break;
            default:
                throw new NoSuchElementException("No such system");
        }
        return app;
    }

    public static void main(String[] args) {
        App app = configApp();
        app.paint();
    }
}
