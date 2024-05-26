# Backend-CedulaMedica

Este es un proyecto que busca ayudar a personas que puedan presentar un accidente o que cuenten con multiples enfermedades que sean de cuidado.

Esta idea surge al evaluar la realidad de muchas personas, ya que a diario mueren en accidentes, debido a que las ambulancias no llegan a tiempo y asi mismo, tampoco cuentan con la información oportuna para atender a un usuario, con este aplicacion lo que se busca es que se tenga a la mano, la información más impotante para los paramedicos, con el fin de atender de manera oportuna y eficaz en el momento de un accidente.

## Prerequisitos

* Se debe tener minimo: Maven, Java, Git. Si desea el paso a paso de cada uno de estas instalaciones de manera más visual para mejor comprensión, puede buscar una breve explicacion en Youtube, sin embargo, adjunto los links de las paginas oficiales donde indican paso a paso su respectiva instalación.

    - Git <br>
      <https://git-scm.com/book/es/v2/Inicio---Sobre-el-Control-de-Versiones-Instalaci%C3%B3n-de-Git>
    - Maven <br>
      <https://maven.apache.org/install.html>
    - Java <br>
      <https://www.java.com/es/download/help/windows_manual_download.html>


## Construido con

* [Maven](https://maven.apache.org/) - Manejo de dependencias y la estructura de las carpetas
* [Git](https://git-scm.com/) - Control de versiones
* [Java](https://www.java.com/en/download/help/whatis_java.html) - Lenguaje de Programación

## Diseño del Modelo de Datos:

Definir el modelo de datos
  
- *Usuario:* Sera quien tenga la aplicacion y quien ingrese sus datos como: Nombre, Celular, Contactos de Emergencia, Alergias, Cirugias, Medicamentos, entre otros esto con el fin de tener la información importante a la mano.

## Arquitectura 

Se manejan tecnologias como firebase, java, spring boot, javascript, react, mongodbAtlas,css, todo esto para el diseño del backend y fronted. 

![image](https://github.com/XimenaRodriguez20/cedulamedica/assets/123812926/0e0d2184-e80e-454c-86a9-aefe388717c6)


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

Luego de esto, en el ID se deben instalar todos los componentes adicionales de lombok, para ejecutarlo lo puede hacer con ayuda de su IDE, en este caso es Inteligent.

![image](https://github.com/XimenaRodriguez20/cedulamedica/assets/123812926/6a991d65-f041-40fa-ad9a-a8abe5107ba5)


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

## Autores

* **Ximena Rodriguez**
* **Jordy Bautista**
* **Santiago Melo** 


