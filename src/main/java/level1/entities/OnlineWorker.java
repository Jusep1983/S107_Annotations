package level1.entities;

public class OnlineWorker extends Worker {
    private final double INTERNET_RATE = 55;

    public OnlineWorker(String name, String surname, double hourlyPrice) {
        super(name, surname, hourlyPrice);
    }

    @SuppressWarnings("deprecated")
    public String happyWithSalary(boolean isHappy) {
        if (isHappy) {
            return "Estoy contento con mi salario. ";
        } else {
            return "No estoy contento con mi salario. ";
        }
    }

    @Override
    public String calculateSalary(int numberOfHours) {
        return "Mi salario és de  " + (super.hourlyPrice * numberOfHours + INTERNET_RATE) + " €.";
    }

    @Override
    public String toString() {
        return "Soy un trabajador remoto me llamo " + this.name + " " + this.surname
               + " y cobro por hora " + this.hourlyPrice + " €";
    }

}
