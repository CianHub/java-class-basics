package cian.og;

public class Main {

    public static void main(String[] args) {
	Car car = new Car("BMW");
	Car myOtherCar = new Car("Volkswagen");
	car.accelerate();
	myOtherCar.brake();
    }
}

class Car {

    private int speed = 0;
    private String name;

    public Car(String carName) {
        name = carName;
    }

    public void accelerate(){
        speed++;
        System.out.printf("%s is going %d km%n",name, speed);
    }

    public void brake() {
        if (speed == 1) {
            speed--;
        }

        System.out.printf("%s is going %d km%n", name, speed);
    }
}
