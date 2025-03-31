# S107_Annotations
## 📄 Descripción
Este repositorio contiene los 3 niveles de la Tasca S107_Annotations, los cuales exploran el uso de anotaciones en Java en distintos escenarios:

- Sobrescritura de métodos con @Override, aplicándolo en una jerarquía de clases para calcular salarios de distintos tipos de trabajadores.

- Marcado de métodos obsoletos con @Deprecated, indicando qué funciones ya no deberían usarse y suprimiendo advertencias al invocarlas.

- Creación de una anotación personalizada para serializar objetos en JSON, recibiendo el directorio donde se guardará el archivo.

- Uso de Java Reflection para leer y registrar anotaciones en tiempo de ejecución, demostrando cómo acceder dinámicamente a la metadata de clases anotadas.

🔽 Enunciados:(clicar en desplegable)
   <details>
    <summary>
      Nivel 1
    </summary>

    - Ejercicio 1
    Crea una jerarquía de objetos con tres clases:
    Trabajador, TrabajadorOnline y TrabajadorPresencial.
    
    La clase Trabajador tiene los atributos nombre, apellido, precio/hora,
    y el método calcularSou() que recibe por parámetro el número de horas trabajadas
    y lo multiplica por el precio/hora. Las clases hijas deben sobrescribirlo,
    empleando @Override.
    
    Desde el main() de la clase Principal,
    realiza las invocaciones necesarias para demostrar el funcionamiento de la anotación @Override.
    
    En los trabajadores presenciales,
    el método para calcular su sueldo, recibirá por parámetro el número de horas trabajadas al mes.
    A la hora de calcular el sueldo se multiplicará el número de horas trabajadas por el precio/hora,
    más el valor de un atributo static llamado gasolina que añadiremos en esta clase.
    
    En los trabajadores online,
    el método para calcular su sueldo recibirá por parámetro el número de horas trabajadas al mes.
    A la hora de calcular el sueldo se multiplicará el número de horas trabajadas por el precio/hora
    y se le sumará el precio de la tarifa plana de Internet, que será una constante de la
    clase TrabajadorOnline.

    - Ejercicio 2
    Añade a las clases hijas algunos métodos obsoletos (deprecated),
    y utiliza la anotación correspondiente. Invoca desde una clase externa los métodos obsoletos,
    suprimiendo mediante la anotación correspondiente los warnings para ser obsoletos.

   </details>
   <details>
   <summary>
   Nivel 2
   </summary>

    - Ejercicio 1
    Crea una anotación personalizada que debe permitir serializar un objeto Java en
    un archivo JSON. La anotación debe recibir el directorio donde se colocará el archivo resultante.

   </details>
   <details>
   <summary>
     Nivel 3
   </summary>

    - Ejercicio 1
    Añade la posibilidad de que la anotación creada en el nivel anterior sea registrada
    por la Virtual Machine en tiempo de ejecución. Demuestra que se ejecuta la lectura de
    la anotación utilizando Java Reflection.

   </details>
</details>

## 💻 Tecnologías Utilizadas
El proyecto ha sido desarrollado utilizando:
- Java 23.0.2
- IntelliJ IDEA como entorno de desarrollo
- Git y GitHub para control de versiones.

## 📋 Requisitos
Para ejecutar el proyecto es necesario contar con:
- JDK 23 instalado en el sistema
- Git instalado y configurado
- IntelliJ IDEA
- Conexión a internet para clonar el repositorio.

## 🛠️ Instalación
1. Clonar el repositorio

- Opción 1: Desde GitHub (sin terminal):

    1. Ir al repositorio en GitHub:

           https://github.com/Jusep1983/S107_Annotations.git
    2. Hacer clic en el botón verde "Code" (Código).
    3. Seleccionar la opción "Download ZIP".
    4. Extraer el archivo ZIP en la ubicación de preferencia.

- Opción 2: Desde IntelliJ IDEA:
    1. Abrir IntelliJ IDEA.
    2. En la pantalla de inicio, seleccionar "Get from VCS" (Obtener desde el control de versiones).
    3. En la pestaña "Version Control", seleccionar Git.
    4. En el campo "URL", pegar el enlace del repositorio:

            https://github.com/Jusep1983/S107_Annotations.git
    5. Elegir la carpeta donde se guardará el proyecto y hacer clic en "Clone".
    6. IntelliJ IDEA detectará el proyecto y pedirá importarlo como un proyecto de Java.

- Opción 3: Desde la terminal (con Git instalado):
    1. Abre la terminal o línea de comandos.
    2. Dirígete a la carpeta donde deseas clonar el repositorio:

            cd /ruta/donde/quieres/clonar
    3. Ejecuta el siguiente comando para clonar el repositorio:

            git clone https://github.com/Jusep1983/S107_Annotations.git
    4. Después de que se complete el proceso de clonación, ve a la carpeta del proyecto:

            cd S107_Annotations

2. Configurar el entorno:
    1. Abrir IntelliJ IDEA si no está abierto.
    2. Ir a File → Project Structure → Project.
    3. Asegurarse de que está seleccionado JDK 21.

## ▶️ Ejecución
1. Abrir la clase que contiene el método main().
2. Hacer clic en el botón Run o presionar Shift + F10.
3. Si es necesario, IntelliJ IDEA pedirá sincronizar dependencias, acepta la opción.

## 🌐 Despliegue
El proyecto está diseñado para ejecutarse en un entorno local, por lo que no se ha definido un proceso de despliegue en producción.

## 🤝 Contribuciones
Si deseas contribuir al proyecto, puedes:
- Hacer un fork del repositorio.
- Crear una nueva rama para tus cambios.
- Enviar un pull request con una descripción detallada de tus modificaciones.


¡Gracias por tu interés en este proyecto! 🚀