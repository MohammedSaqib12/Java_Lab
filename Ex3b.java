public class Ex3b {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(); 
        Vehicle vehicle2 = new Motorcycle(); 


        vehicle1.start(); 
        vehicle1.stop();  

        vehicle2.start(); 
        vehicle2.stop();  
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
    @Override
    public void start() {
        System.out.println("Car started");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }
}


