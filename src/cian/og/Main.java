package cian.og;

public class Main {

    public static void main(String[] args) {
	Car car = new Car();
	car.accelerate();
    }
}

class Car {
    public void accelerate(){
        System.out.println("You are going faster.");
    }

    public void brake(){
        System.out.println("You are going slower.");
    }
}
