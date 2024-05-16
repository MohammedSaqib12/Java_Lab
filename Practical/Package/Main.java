import com.example.mypackage.Myclass;

public class Main {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.display();
        System.out.println(obj.add(3, 4));
        System.out.println(obj.sub(8, 2));
        System.out.println(obj.mul(3, 4));
        System.out.println(obj.div(8, 2));
    }
}