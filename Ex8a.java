public class Ex8a {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}


class A extends Thread {
    public void run() {
        for(int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i = 51; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

