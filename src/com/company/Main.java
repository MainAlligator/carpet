package com.company;

public class Main {

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(3.33, 6.0);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("Total = " + calculator.getTotalCost());

        carpet = new Carpet(-6);
        floor = new Floor(4.4, 7.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("Total = " + calculator.getTotalCost());
    }
}
