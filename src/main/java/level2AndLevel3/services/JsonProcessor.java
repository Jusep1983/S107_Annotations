package level2AndLevel3.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import level2AndLevel3.interfaces.JsonSerializable;

import java.io.*;
import java.nio.file.Paths;

public class JsonProcessor {

    public static <T> void serializeObjectToJson(T object, String customFileName) {

        try {
            Class<?> clazz = object.getClass();
            JsonSerializable annotation = clazz.getAnnotation(JsonSerializable.class);
            if (annotation == null) {
                checkForNullAnnotation();
            } else {
                String directory = Paths.get("src", "main", "java", "level2AndLevel3"
                        , annotation.directory()).toString();
                String filePath = directory + File.separator + customFileName + ".json";
                new File(directory).mkdirs();
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.writeValue(new File(filePath), object);
                System.out.println("Archivo Json generado en " + filePath);

            }
        } catch (NullPointerException e) {
            System.out.println("Error al serializar objetos tipo " + object.getClass().getSimpleName()
                               + ", " + e.getMessage()
            );
        } catch (IOException e) {
            System.out.println("Error en serialización" + e.getMessage());
        }

    }

    private static void checkForNullAnnotation() {
        throw new NullPointerException("\"@JsonSerializable\" no disponible.");
    }

}
