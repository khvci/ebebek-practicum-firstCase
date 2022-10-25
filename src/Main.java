import entities.concretes.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("kemal", 2000, 45, 1985));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
