package org.example;


class Car {
    String brand;
    String model;
    int year;
    double mileage;

    public Car (String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = 0;
    }
    public void drive (double km){
        mileage = km;
        System.out.println("You´ve driven" + km + "mileage");
        System.out.println("Total mileage" + mileage);
    }



    public void showInfo(){
        System.out.println("Brand" + brand);
        System.out.println("Model" + model);
        System.out.println("Year " + year);
        System.out.println("Mileage "  +  mileage + " km");
    }

    }



