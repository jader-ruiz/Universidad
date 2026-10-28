import java.util.Stack;


public class Stack1{
    Stack<StackPersona> personas;

    public Stack1() {
        personas = new Stack<StackPersona>();
    }

    public String adicionar(String nombre, String apellido, int edad){
        StackPersona persona = new StackPersona(nombre, apellido, edad);
        personas.push(persona);
        return "\nSe ingreso a la persona!";
    }

    public String eliminar(){
        if(!personas.isEmpty()){
            personas.pop();
            return "\nPersona Eliminada";
        }
        return "\nLa pila se encuentra vacia...";
    }

    public String imprimir(){
        if(!personas.isEmpty()){
            String listado = "";
            for(int i = 0; i < personas.size(); i++){
                StackPersona persona = personas.get(i);
                listado += (i+1) + ". Nombre: " + persona.getNombre() + "\n" + "Apellido: " + persona.getApellido() + "\n" + "Edad: " + persona.getEdad() + "\n";
            }
            return listado;
        }

       
        return "\nLa pila se encuentra vacia...";
    }
}