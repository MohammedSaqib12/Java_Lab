public class Ex4b {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        Motorcycle motorcycle = new Motorcycle();

        electricCar.start();
        electricCar.accelerate();
        electricCar.chargeBattery();
        electricCar.stop();

        System.out.println();

        motorcycle.start();
        motorcycle.wheelie();
        motorcycle.stop();
    }
}


class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void brake() {
        System.out.println("Car is braking");
    }
}

class ElectricCar extends Car {
    public void chargeBattery() {
        System.out.println("Battery is charging");
    }
}

class Motorcycle extends Vehicle {
    public void wheelie() {
        System.out.println("Motorcycle is doing a wheelie");
    }
}
