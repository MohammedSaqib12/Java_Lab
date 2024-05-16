public class Ex4c {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 1001, 
   "Engineering", "Development Team");
        Engineer engineer = new Engineer("Alice Smith", 2001, 
   "Engineering", "Software Engineering");
        System.out.println("Manager Information:");
        manager.display();
        System.out.println("\nEngineer Information:");
        engineer.display();
    }
}


class Employee {
    String name;
    int employeeId;
    String department;

    Employee(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    String team;
    Manager(String name, int employeeId, String department, 
    String team) {
        super(name, employeeId, department);
        this.team = team;
    }

    void display() {
        super.display();
        System.out.println("Team: " + team);
    }
}
class Engineer extends Employee {
    String specialization;
    Engineer(String name, int employeeId, String department, 
    String specialization) {
        super(name, employeeId, department);
        this.specialization = specialization;
    }

    void display() {
        super.display();
        System.out.println("Specialization: " + 
   specialization);
    }
}


