package entities.concretes;

import entities.abstracts.ICalculable;

public class Employee implements ICalculable {
    private String name;
    private double salary;
    private int workHours; //haftalik calisma saati
    private int hireYear;

    //method implementasyonlari
    @Override
    public double raiseSalary() {
        int workingYears = 2021 - hireYear;

        if (workingYears < 10) {
            return salary * 0.05;
        }
        if (workingYears > 19) {
            return salary * 0.15;
        }
        return salary * 0.10;

    }

    @Override
    public double tax() {
        if (salary < 1000) {
            return 0;
        }
        return salary * 0.03;
    }

    @Override
    public double bonus() {
        int overworkingHours = workHours > 40 ? workHours - 40 : 0;
        double overworkingRate = 30; //fazla calisilmis ise saat basi ucret
        return overworkingRate * overworkingHours;
    }
    @Override
    public String toString() {
        return "Adı : " + name +
                "\nMaaşı : " + salary +
                "\nÇalışma Saati : " + workHours +
                "\nBaşlangıç yılı : " + hireYear +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş Artışı : " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : " + (salary + bonus() - tax()) +
                "\nToplam Maaş : " + (salary + bonus() - tax() + raiseSalary());
    }

    //constructor
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
}
