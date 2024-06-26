import java.util.Scanner;

class Ex1e {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subjects");

        int n = sc.nextInt();

        double[] marks = new double[n];

        System.out.println("Enter marks");

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        double grade[] = new double[n];
        double cgpa, sum;

        CGPACalculation s = new CGPACalculation(marks);

        sum = s.sum;
        cgpa = sum / n;

        System.out.println("cgpa=" + cgpa);
        System.out.println("percentage from cgpa=" + cgpa * 
   9.5);
    }
}


class  CGPACalculation {
    double sum = 0;

    CGPACalculation(double marks[]) {
        double grade[] = new double[marks.length];

        for (int i = 0; i < marks.length; i++) {
            grade[i] = (marks[i] / 10);
        }

        for (int i = 0; i < marks.length; i++) {
            sum += grade[i];
        }
    }
}

