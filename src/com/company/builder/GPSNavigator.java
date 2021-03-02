package com.company.builder;

public class GPSNavigator {
    private String route;

    public GPSNavigator(){
        this.route = "Gdzieś tam";
    }

    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }
    public String getRoute(){
        return route;
    }
}
