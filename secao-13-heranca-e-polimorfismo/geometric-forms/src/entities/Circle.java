package entities;

import entitiess.enums.Color;

public class Circle extends Shape{

    private Double radius;

    private Circle(){
        super();
    }

    public Circle(Color color, Double raidus) {
        super(color);
        this.radius = raidus;
    }

    public Double getRaidus() {
        return radius;
    }

    public void setRaidus(Double raidus) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI + radius * radius;
    }
}
