# Backend-CedulaMedica

## 2. Diseño del Modelo de Datos:

Definir el modelo de datos
- Se va a manejar tres perfiles (usuario, paramedico, gente externa).

  Lo que se encarga cada perfil:
  - *Usuario:* Sera quien tenga la aplicacion y quien ingrese sus datos como: Nombre, Celular, Contactos de Emergencia, Alergias, Cirugias, Medicamentos.
  - *Paramedico:* Cuando ocurra un accidente les llegara una notificación si se encuentran cerca del area donde ocurrio el accidente, podrán reaccionar a tiempo y además cuando lleguen al lugar de los hechos        podrán escanear el codigo y obtener más información que culaquier persona que escanee el codigo.
  - *Gente externa:* Podrá ayudar a la persona que se accidento escaneando el QR, asi esto alertara de una a los contactos de emergencia que paso algo y asi mismo, sera enviada una  notificacion a todas las         ambulancias que se encuentren cerca al accidente lo que generara una pronta respuesta, además le aparecera cierta información del accidentado, lo cual servira en casos de que él que este ayudando sepa de       primeros auxilios y le sirva cierta información para poder actuar.

## 3. Prototipo Visual con IA Generativa:

Investigar y seleccionar herramientas de IA Generativa.
  Aunque en la actualidad hay varias herramientas muchas de estas requieren algun metodo de pago, por lo cual, por el momento se va hacer uso de la IA COPILOT
  
  - Esta es la interfaz del usuario:

    ![image](https://github.com/JordyBautista10/Backend-CedulaMedica/assets/123812926/be461af2-f965-4208-b32c-71c380807dcb)

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

Finalmente, se puede ver que se protegió el endpoint `/auth`, debido a que se intenta acceder sin previa autorización y nos muestra una respuesta 403, como se ve a continuación:

![image](https://github.com/JordyBautista10/Backend-CedulaMedica/assets/123812926/d070e76b-f515-419b-bf26-97d599791252)

De forma contraria, el endpoint `/noauth` no esta protegido:

![image](https://github.com/JordyBautista10/Backend-CedulaMedica/assets/123812926/44e4b427-2c1d-4da8-95a2-a7c78f6b9507)

Adicional a lo anterior, se puede ver la implementacion de un token de usuario a la hora de su registro:

![image](https://github.com/JordyBautista10/Backend-CedulaMedica/assets/123812926/4ca3cebf-3435-460f-9b2e-528aec582dd9)

## Pruebas Unitarias

Se realizaron distintas pruebas para probar la funcionalidad de algunos de los metodos mas importantes de este proyecto, el resultado es:

![image](https://github.com/JordyBautista10/Backend-CedulaMedica/assets/123812926/dd913167-c589-4f0a-a490-6bf8a4b2f204)

