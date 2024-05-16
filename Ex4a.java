public class Ex4a {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana(); 
        
        apple.type(); 
        apple.taste(); 
        
        banana.type(); 
        banana.peel(); 
    }
}


class Fruit {
    public void type() {
        System.out.println("This is a fruit.");
    }
}

class Apple extends Fruit {
    public void type() {
        System.out.println("This is an apple.");
    }
    
    public void taste() {
        System.out.println("Apples are sweet.");
    }
}

class Banana extends Fruit {
    public void type() {
        System.out.println("This is a banana.");
    }
  
    public void peel() {
        System.out.println("Bananas need to be peeled before eating.");
    }
}

