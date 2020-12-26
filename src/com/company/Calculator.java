package com.company;

public class Calculator {
    Carpet carpet = new Carpet(3.5);
    Floor floor = new Floor(2.75, 4.0);

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;

    }

    public double getTotalCost() {

        return floor.getArea() * carpet.getCost();
    }
}
