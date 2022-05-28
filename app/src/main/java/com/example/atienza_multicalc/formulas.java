package com.example.atienza_multicalc;
import java.lang.Math;


public class formulas {
    //Geometry//
    //Formula for Square//
    public double square(double square, double answer){
        answer = square * square;
        return(answer);
    }
    //Formula Rectangle//
    public double rectangle(double length, double width){
        return length * width;
    }
    //Formula Triangle//
    public double triangle(double base, double height){
        return base * height / 2;
    }
    //Formula Circle//
    public double circle(double r, double cans){
        cans = (4 / 3) * Math.PI * (r * r * r);
        return(cans);
    }
    //P6//
    //Average Speed//
    public double speed(double distance, double time){
        return distance / time ;
    }
    //Newton's Law of Motion//
    public double nlm(double mass, double accelration){
        return mass * accelration;
    }
    //Density//
    public double density(double mass, double volume){
        return mass * volume;
    }
    //Ohm's Law//
    public double ohms(double current, double resistance){
        return current * resistance;
    }
}
