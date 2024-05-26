# Backend-CedulaMedica

## Diseño del Modelo de Datos:

Definir el modelo de datos
  
- *Usuario:* Sera quien tenga la aplicacion y quien ingrese sus datos como: Nombre, Celular, Contactos de Emergencia, Alergias, Cirugias, Medicamentos, entre otros esto con el fin de tener la información importante a la mano.

## Arquitectura 

## Iniciando  
  
  Para iniciar se debe configurar en las variables de entrono del IDE, esto:

* Name:SERVER_1
* Value:[valor que se le entrega al equipo de ADA]

  ![image](https://github.com/JordyBautista10/Backend-CedulaMedica/assets/123812926/bba3acfc-f4de-486b-8dab-17b3f35f06a8)

  En caso de no funcionar configurar esto mismo en las variables de entorno del sistema y reiniciar el equipo, para comprobar que esto ya esta funcionando escribimos el comando:

  ~~~
      $env:SERVER_1
  ~~~

  ![image](https://github.com/JordyBautista10/Backend-CedulaMedica/assets/123812926/e37610bb-7d6e-4c25-a852-4fa4ca9e9c01)

Luego de esto, en el ID se deben instalar todos los componentes adicionales de lombok.

## Funcionamiento



## Pruebas Unitarias

Se puede ver que se protegió el endpoint `/auth`, debido a que se intenta acceder sin previa autenticación y nos muestra una respuesta 403, como se ve a continuación:

![image](https://github.com/JordyBautista10/Backend-CedulaMedica/assets/123812926/d070e76b-f515-419b-bf26-97d599791252)

De forma contraria, el endpoint `/noauth` no esta protegido, por lo cual podemos ver la información que contiene ese endpoint:

![image](https://github.com/JordyBautista10/Backend-CedulaMedica/assets/123812926/44e4b427-2c1d-4da8-95a2-a7c78f6b9507)

Ademas, se implemento un registro `/api/auth/register` este permite agregar a usuarios en las bases de datos y a su ves genera un token:

![image](https://github.com/XimenaRodriguez20/cedulamedica/assets/123812926/5feaa90c-023d-42ce-a51b-643b30bcf118)

Base de datos

![image](https://github.com/XimenaRodriguez20/cedulamedica/assets/123812926/a8710793-5e89-4630-907d-24b6491d1717)

Tambien se cuenta con una autenticacion `/api/auth/authenticate` este permite verificar si el usuario se encuentra en la base de datos y si esto es correcto se genera un token:

![image](https://github.com/XimenaRodriguez20/cedulamedica/assets/123812926/3d43145d-0e82-4091-8971-72d8b9bd3959)

En caso de enviar los datos incorrectos no genera el token y muestra un error 403:

![image](https://github.com/XimenaRodriguez20/cedulamedica/assets/123812926/7a304f8a-846a-4ec6-9c80-f57b78360fc3)

Por utlimo para verificar que este token de autenticacion es validdo probamos el endopint `/auth`, introducimos el repectivo token que nos genero la autenticacion y como podemos ver, ahora si deja ver el contenido que esta dentro de este endpoint:

![image](https://github.com/XimenaRodriguez20/cedulamedica/assets/123812926/bab5e1c2-be1e-4451-abb1-afc79fe99110)

Se realizaron distintas pruebas para probar la funcionalidad de algunos de los metodos más importantes de este proyecto, el resultado es:

![image](https://github.com/JordyBautista10/Backend-CedulaMedica/assets/123812926/dd913167-c589-4f0a-a490-6bf8a4b2f204)


