public class Ex8b {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }
}

class A extends Thread {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i = 11; i <= 20; i++) {
            System.out.println(i);
        }
    }
}


