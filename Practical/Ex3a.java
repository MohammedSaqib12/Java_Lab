public class Ex3a {
    public static void main(String[] args) {
        int sum1 = calculateSum(10, 20);
        System.out.println("The sum of Sum 1 is "+ sum1);
        int sum2 = calculateSum(10, 20, 30);
        System.out.println("The sum of Sum 2 is "+ sum2);
        int sum3 = calculateSum(10, 20, 30, 40);
        System.out.println("The sum of Sum 3 is "+ sum3);
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateSum(int a, int b, int c) {
        return a + b + c;
    }

    public static int calculateSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
