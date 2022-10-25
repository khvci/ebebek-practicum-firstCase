package service.abstracts;

public interface ICalculatable {
    // method isimleri calculateTax() ve calculateBonus() seklinde daha uygun olsa da
    // isterlere uygun sekilde tax() ve bonus() olarak isimlendirdim
    void tax(double salary);
    void bonus(double salary, int WorkHours);
    void raiseSalary(double salary, int hireYear, int currentYear);
}
