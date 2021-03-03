package com.company.adapter;

public class SquarePeg {
    double width;

    public SquarePeg(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public double getSquare(){
        double result;
        result = Math.pow(this.width,2);
        return result;
    }
}
