package level2AndLevel3.model;

import level2AndLevel3.interfaces.JsonSerializable;

// Car class controls its own serialization directory thanks to the annotation @JsonSerializable
@JsonSerializable(directory = "jsonCars")
public class Car {

    private String name;
    private String brand;

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" + "name: " + name + ", brand: " + brand + "}";
    }

}
