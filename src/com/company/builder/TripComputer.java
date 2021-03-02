package com.company.builder;

public class TripComputer {

    private Car car;

    public void setCar(Car car){
        this.car = car;
    }

    public void showFuelLevel(){
        System.out.println("Fule level" + car.getFuel());
    }

    public void showStatus(){
        if(this.car.getEnginge().isStarted()){
            System.out.println("Car is started!");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
