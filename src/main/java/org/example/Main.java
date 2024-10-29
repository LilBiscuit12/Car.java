package org.example;

public class Main {
    public static void main(String[] args) {
    Car myCar = new Car (" Ford"," Camaro SS" , 1969);
        System.out.println("showInfo");
        myCar.showInfo();
        myCar.drive(0);
        myCar.drive(60);
        myCar.showInfo();
    }

}
