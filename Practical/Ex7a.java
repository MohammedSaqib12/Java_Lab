class A extends Thread {
    public void run() {
        for(int i = 0; i <= 10; i++) {
            System.out.println("Thread A: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i = 11; i <= 20; i++) {
            System.out.println("Thread B: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ex7a {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();   
    }
}
