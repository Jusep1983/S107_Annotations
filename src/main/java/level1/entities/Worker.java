package level1.entities;

public class Worker {
    protected String name;
    protected String surname;
    protected double hourlyPrice;

    public Worker(String name, String surname, double hourlyPrice) {
        this.name = name;
        this.surname = surname;
        this.hourlyPrice = hourlyPrice;
    }

    public String calculateSalary(int numberOfHours) {
        return "Mi salario és de " + (this.hourlyPrice * numberOfHours) + " €.";
    }

    @Override
    public String toString() {
        return "Soy un trabajador a secas me llamo " + this.name + " " + this.surname
               + " y cobro por hora " + this.hourlyPrice + " €";
    }

}
