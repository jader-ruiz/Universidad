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

## Metodos:
### Constructores: 
- Son los que le dan vida al objeto
- inicializar una instacia

### Metodos genericos: 
- Realizan acciones utilizando los atributos
- Realizar cualquier accion para el objeto


### Metodos para acceso directo a los atributos (getters & setters): 
- Obtener el valor del atributo o modificar el valor del atributo.
    - get: obtener
    - set: modificar

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

## Polimorfismo
Mismo metodo diferente significado
### Estatico
Sobrecarga de metodos -> Definir 2 o más metodos que van a tener el mismo nombre, pero con parametros diferentes en cantidad o tipo

Tiempo compilacion
### Dinamico 
Sobreescritura de metodos
Tiempo ejecucion


## Relaciones entre clase y UML

### Asociación
Un objeto conoce a otro.
Un objeto tiene una referencia a otro, pero ambos pueden existir de forma independiente.
Medico y paciente. 

### Composición
Un objeto esta formado por otros. Sin el todo, las partes no tienen sentido.
Un lado es el todo. El otro son las partes.

La parte no puede existir sin el todo. TODO Y PARTES.

Nacieron objetos dentro de una clase, si esa clase deja de existir ese objeto se va. 
VUELO: TODO
ASIENTOS: PARTES
Rombo relleno.

### Agregación
Un objeto contiene a otros, pero las partes pueden existir sin él.

Biblioteca, libros
Si se elimina la biblioteca los libros siguen existiendo.
Rombo vacío.

### Multiplicidad




