package com.KelasTertutup;

public class Rectangle {
    private double width = 1;
    private double height = 1;

    public Rectangle(){

    }
    public Rectangle(double newWidth,double newHeight){
        width = newWidth;
        height = newHeight;
    }

    public double getArea(){
        double area = width * height;
        return area;
    }

    public double getParameter(){
        double parameter = 2*(width + height);
        return parameter;
    }
}
