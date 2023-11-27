# Nombre del Proyecto

Registro de Cliente y Vehiculos 

## Dependencias necesarias
- Spring web
- Sprign Data JPA
- PostgreSQL Driver
- Lombok
- H2 Database
- maven
 
## Requerimiento

Aquí se detallan los pasos necesarios para instalar y ejecutar el proyecto. Además, se incluye cómo cambiar la versión de Java en un proyecto Spring Boot.

 **Configura tu entorno:**
   Asegúrate de tener Java 11 instalado en tu sistema y configurado en las variables de entorno para que el sistema pueda encontrar la instalación de Java 11.




## Configuración de la Base de Datos

Para que la aplicación funcione correctamente, necesitarás configurar la base de datos. Sigue estos pasos:

### 1. Requisitos previos
- Asegúrate de tener instalada la base de datos que planeas utilizar PostgreSQL.
- Verifica que tengas los controladores (drivers) JDBC correspondientes para tu base de datos.

### 2. Configuración del archivo `application.properties`

En el proyecto, encontrarás un archivo llamado `application.properties` ubicado en la ruta `/src/main/resources`. Este archivo contiene la configuración de la base de datos. Sigue los pasos a continuación para configurarlo:

1. Abre el archivo `application.properties`.
2. Busca la sección destinada a la configuración de la base de datos. Podría verse así:

    ```properties
    # Configuración de la base de datos H2 (ejemplo)
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.username=sa
    spring.datasource.password=password
    ```

3. Modifica los valores de acuerdo con tu base de datos:

    ```properties
    # Configuración de MySQL (ejemplo)
    spring.datasource.url=jdbc:mysql://localhost:3306/tu_basedatos
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    ```

   Reemplaza `tu_basedatos`, `tu_usuario` y `tu_contraseña` con los valores específicos de tu base de datos.

### 3. Ejecución del proyecto

Una vez que hayas configurado correctamente el archivo `application.properties`, puedes ejecutar el proyecto Spring Boot.

