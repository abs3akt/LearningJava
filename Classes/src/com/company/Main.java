package com.company;

public class Main {

    public static void main(String[] args) {
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();
        Bus threeBus = new Bus();

        firstBus.color = "red";
        secondBus.color = "Blue";
        threeBus.color = "yellow";

        firstBus.name = "Mercedess";
        secondBus.name = "Toyota";
        threeBus.name = "Iveco";

        firstBus.showColor();
        firstBus.showName();
        secondBus.showColor();
        secondBus.showName();
        threeBus.showColor();
        threeBus.showName();
    }


}
