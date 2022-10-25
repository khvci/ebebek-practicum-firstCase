package entities.abstracts;

public interface ICalculable {
    public double raiseSalary();
    public double tax();
    public double bonus();

    /*

    Method isimleri olarak calculateTax() ve calculateBonus() daha uygun olsa da
    isterlere uygun sekilde tax() ve bonus() olarak isimlendirildi.

    Ayrica hesaplama methodlarini bir EmployeeManager sinifina koymak daha uygun olsa
    da, yine isterler dogrultusunda Employee seklinde tek bir sinif olarak olusturuldu.

     */



}
