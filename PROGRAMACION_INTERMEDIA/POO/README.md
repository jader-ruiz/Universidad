# DEFINICION DE POO

## Abstracción:
Abstraccion: Identificar y representar las caracteristicas (atributos) y comportamientos (metodos) de objetos de la vida real.

La abstraccion no es unica, puede ser distinta según el contexto.

## Clase: 
Es una abstracción del mundo real, y representa una plantilla para que yo pueda crear objetos:
- Atributos: Caracteristicas
- Metodos: Acciones

Se puede representar de la siguiente manera en Java

Miclase -> nombre -> PascalCase
    atributo1
    atributo2 -> atributos -> camelCase
    atributo3

    metodo1
            -> Metodos -> camelCase
    metodo2

## Objeto:
Ejemplo concreto de una clase

## Ejemplo:

### 1
public class Persona(){
    nombre: String;
    edad: int; -> atributos
    altura: double;
                            -> "PLANTILLA"
    respirar()
                -> metodos
    caminar()
}

obj1: Persona (TIPO CLASE)
nombre: "Jader"
edad: 18
altura 1.69

### 2
Gato
- peso: double
- colorOjos: String 
- colorPelaje: String
+ maullar()
+ dormir()

compota: Gato
peso: 23
colorOjos: "Verde"
colorPelaje: "Gris"  

## Encapsulamiento:
Consiste en formar un "Paquete" de la clase con sus atributos privados y sus metodos publicos
Normalmente, los atributos son privados para que no se accedan directamente, se accede atraves de un metodo publico


