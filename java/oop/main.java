package oop;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
 //   car car1 = new car("Chevrolet", "Camaro", 2000);
    //car car2 = new car("Ford", "Musting", 2022);
   // car2 = car1;
   //car2.copy(car1);
 //  car car2 = new car(car1);

 //   System.out.println(car1);  
 //   System.out.println(car2);
 //   System.out.println();
//    System.out.println(car1.getMake());
 //   System.out.println(car1.getModel());
 //   System.out.println(car1.getYear());
 //   System.out.println();
 //   System.out.println(car2.getMake());
 //   System.out.println(car2.getModel());
//    System.out.println(car2.getYear());

    // mycar.drive();
    // mycar.breake();

    // System.out.println(car2.make);
    // System.out.println(car2.model);
    // System.out.println(car2.price);

    // Human human = new Human("mary", 34,57);

    // System.out.println(human.name);
    // human.eat();
    // human.drink();

   /*  Rabbit rabbit = new Rabbit();
    rabbit.flee();


    Hawk hawk = new Hawk();
    hawk.hunt();
 */

 /*    Fish fish = new Fish();
    fish.flee();
    fish.hunt(); */

   /*  car car1 = new car();
    Bicycle bicycle = new Bicycle();
    Boat boat = new Boat();

    Vehicle[] racer = {car1,bicycle,boat};

    for(Vehicle x :racer ){
      x.go();
    } */

    Scanner scanner = new Scanner(System.in);

    Aniaml aniaml;
    System.out.println("Wgat aniamk do you wnat ?");
    System.out.println("(1= dog) or (2= cat) :");
    int choice = scanner.nextInt();

    if(choice==1){
      aniaml = new Dog();
      aniaml.speak();
    }else if(choice ==2){
      aniaml = new Cat();
      aniaml.speak();
    }else{
      aniaml = new Aniaml();
      System.out.println("the choice isnot invalid ");
      aniaml.speak();
    }


  }
}
