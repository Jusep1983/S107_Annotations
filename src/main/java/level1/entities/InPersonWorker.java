package level1.entities;

public class InPersonWorker extends Worker {
    private final double GASOLINE = 111;

    public InPersonWorker(String name, String surname, double hourlyPrice) {
        super(name, surname, hourlyPrice);
    }

    @Deprecated
    public String happyWithSalary(boolean isHappy) {
        if (isHappy) {
            return "Estoy contento con mi salario. ";
        } else {
            return "No estoy contento con mi salario. ";
        }
    }

    @Override
    public String calculateSalary(int numberOfHours) {
        return "Mi salario és de " + (super.hourlyPrice * numberOfHours + GASOLINE) + " €.";
    }

    @Override
    public String toString() {
        return "Soy un trabajador presencial me llamo " + this.name + " " + this.surname
               + " y cobro por hora " + this.hourlyPrice + " €";
    }

}
