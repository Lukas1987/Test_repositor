package sk.itsovy.family.lukas;

import com.sun.deploy.security.SelectableSecurityManager;

public class Calculator {
    private String name;
    private Boolean power;
}

    public Calculator(String name, Boolean power) {
        this.name = name;
        power = false;
    }
    public void turnOn () {
    power=true;
    }
    public void turnOff () {
    power=false;
    }


    public String getName() {
        return name;
    }

    public Boolean getPower() {
        return power;
    }

    public int add(int a, int b) {
    if(isPower()) {
        return a + b;
    }
    else {
        return 0;
    }

}
public int calculateSquareArea (int a) {
    if(isPower())
    return a*a;
    else
        return 0;
}
public double convertCmToInch(double value) {
    if (isPower())
    return value * 0.393;
    else
        return 0;
}
    public double convertInchToCm(double value) {
    if (isPower())
        return value / 0.393;
    else
        return 0;
    }
    public void toggle() {
    power=!power;
    }
    public String convertDecimalToBinary(int value) {
    if(isPower());
    return Integer.toBinaryString(value);
    }
    public double calculateRectDiagonal(int a, int b) {
    if(isPower())
    return Math.sqrt(a*a+b*b);
    else
        return 0;
    }
    public double calculateCircleArea(double radius) {
    if (isPower())
        return (Math.PI * (radius*radius));
    else
        return 0;
    }
    public double calcAverage(int a, int b, int c) {
        //return (a+b+c)/3.0;
        return (double) (a+b+c)/3;

    }
    public double ballVolume(int radius, int PI) {
    if (isPower())
        return 4*(Math.PI * radius*radius*radius)/3;
    else
        return 0;
    }
    public double Surfaceofblock(int a, int b, int c) {
    if(isPower())
        return 2*((a*b)+(a*c)+(b*c));
    else
        return 0;
    }
    public double loans(int month, int interest, int sum) {

}
