package level2AndLevel3.mainRunner;

import level2AndLevel3.interfaces.JsonSerializable;
import level2AndLevel3.model.Car;
import level2AndLevel3.model.Person;
import level2AndLevel3.services.JsonProcessor;

public class RunMain {
    public static void run() {

        try {
            validateSerializableClass(Person.class);
            validateSerializableClass(Car.class);
        } catch (IllegalStateException e) {
            System.out.println("Error, " + e.getMessage());
        }

        Person samplePerson = new Person("Jason", 34);
        Person anotherPerson = new Person("Marie", 25);
        Car smallCar = new Car("Yaris", "Toyota");

        JsonProcessor.serializeObjectToJson(samplePerson, samplePerson.getName());
        JsonProcessor.serializeObjectToJson(anotherPerson, anotherPerson.getName());
        JsonProcessor.serializeObjectToJson(smallCar, smallCar.getName());


    }

    public static <T> void validateSerializableClass(Class<T> clazz) {
        if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
            throw new IllegalStateException(
                    "la anotación \"@JsonSerializable\" no esta disponible en la clase " + clazz.getSimpleName()
            );
        } else {
            System.out.println(clazz.getSimpleName() + " ha accedido correctamente a la anotación \"@JsonSerializable\"");
        }
    }

}
