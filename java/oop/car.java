package oop;

public class car extends Vehicle {
  /*   private String make;
    private String model;
    private int year; */
    // String color = "blue";
    // double price = 50000.00;
/* 
    car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);

    }

    public car(car x) {
        this.copy(x);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public void copy(car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());

    } */

    // void drive(){
    // System.out.println("you drive the car");

    // }

    // void breake(){
    // System.out.println("you step on the breake");
    // }
    @Override
      void go(){
     System.out.println("the car begins moving");
     }


}
