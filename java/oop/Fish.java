package oop;

public class Fish implements Predator,Prey {

    @Override
    public void flee() {
        // TODO Auto-generated method stub
        System.out.println("the fish is hunting the smaller fish");
    }

    @Override
    public void hunt() {
        // TODO Auto-generated method stub
        System.out.println("the fish is fleeing from the biger fish");
    }
    
}
