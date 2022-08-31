# CVDS_Lab03_Monroy_Rocha

### Lab 03 CVDS
* Miguel Monroy
* Santiago Rocha


* Actualizar y crear dependencias en el proyecto

![image](https://user-images.githubusercontent.com/99696682/187054004-462e0f97-8590-4e84-8d4a-51841aa549bf.png)


* Ejecute los comandos necesarios de Maven, para compilar el proyecto y verificar que el proyecto se creó correctamente y los cambios realizados al archivo pom no generan inconvenientes


![image](https://user-images.githubusercontent.com/99696682/187054014-6d0be347-b2f9-438a-bfef-45753dc39a20.png)






* Busque el comando requerido para ejecutar las pruebas unitarias de un proyecto desde Maven y ejecútelo sobre el proyecto. Se debe ejecutar la claseAppTest con resultado exitoso. 

![image](https://user-images.githubusercontent.com/99696682/187054022-cfd3462a-bcd3-497a-8454-1b82dfb371e5.png)


  - Ejecutando solo AppTest:
	-	mvn test -Dtest=edu.eci.cvds.tdd.AppTest

![image](https://user-images.githubusercontent.com/99696682/187054027-e6c8561b-343b-4ede-87fc-35b5e8c789da.png)

![image](https://user-images.githubusercontent.com/99696682/187054031-f3197bda-0c82-4b88-8662-d6d46bfc45f1.png)


## EJECUTAR LAS PRUEBAS

![image](https://user-images.githubusercontent.com/99696682/187054038-1437330c-f3cf-4b66-b237-69bfae0a0eff.png)


* La diferencia entre mvn package y mvn test es que al usar package no solo se ejecutan las pruebas sino que además se crea un archivo comprimido .jar de la carpeta



## FINALIZAR EL EJERCICIO
* Piense en los casos de equivalencia que se pueden generar del ejercicio para la registraduría, dadas las condiciones. Deben ser al menos 5.

  * DEAD: El atributo age es mayor o igual a 105 o alive sea true 
```
(!p.isAlive() || (p.getAge() >= 105 || p.getAge() < 120))
```
  * UNDERAGE: El atributo age es mayor a 0 y menor o igual a 17 
```
(p.getAge() > 0 && p.getAge() <= 17)
```
  * INVALID_AGE: Un número menor o igual a 0 o un número mayor a 120 
```
(p.getAge() <= 0 || p.getAge() >= 120)
```
  * VALID:  El atributo age es estrictamente mayor a 17 y estrictamente menor a 105 
```
(age > 17 && age < 105)
```
  * DUPLICATED: Cuando el id de la persona ya está registrado 
```
(regIds.contains(p.getId()))
```

Complete la implementación de la clase RegistryTest.java con (al menos) un método por cada clase de equivalencia, creando diferentes personas y validando que el resultado sea el esperado.


Complete la implementación del método registerVoter en la clase Registry.java para retornar el resultado esperado según la entrada.

![image](https://user-images.githubusercontent.com/99696682/187054042-0032fd8a-97ed-41ac-8565-306429828c8f.png)

