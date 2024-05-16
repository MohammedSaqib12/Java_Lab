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

public class Ex7b {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);

        obj1.start();
        obj2.start();   
    }
}
