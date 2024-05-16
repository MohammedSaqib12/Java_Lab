class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }
}


class Employee extends Person {
    int empId;
    double salary;

    Employee(String name, int age, int empId, double salary){
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("EmpID " + empId);
        System.out.println("Salary " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, int empId, double salary, String department){
        super(name, age, empId, salary);
        this.department = department;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department " + department);
    }
}


public class Ex4b {
    public static void main(String[] args) {
     Manager m = new Manager("Saqib", 21, 1082, 150000, "Software Engineering");
     m.displayDetails();   
    }
}
