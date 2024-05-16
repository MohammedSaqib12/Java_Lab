interface Movable {
    void move();
}

interface EnginePowered {
    void startEngine();
    void stopEngine();
}

interface FuelConsumable {
    void refuel();
}

class Car implements Movable, EnginePowered, FuelConsumable {
    @Override 
    public void move() {
        System.out.println("Car is moving...");
    }

    @Override 
    public void startEngine() {
        System.out.println("Car engine is started...");
    }

    @Override 
    public void stopEngine() {
        System.out.println("Car engine is stopped...");
    }

    @Override 
    public void refuel() {
        System.out.println("Car is refueled...");
    }
}


public class Ex6 {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.move();
        mycar.startEngine();
        mycar.stopEngine();
        mycar.refuel();
    }
}
