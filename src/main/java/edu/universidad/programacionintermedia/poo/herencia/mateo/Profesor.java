package edu.universidad.programacionintermedia.poo.herencia.mateo;
public class Profesor extends Persona {

    private String departamento;
    private double salario;
    public Profesor() {
    }

    public Profesor(String nombre, String cedula, int edad,String departamento, double salario) {
        super(nombre, cedula, edad);
        this.departamento = departamento;
        this.salario = salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void dictarClase() {
        System.out.println(getNombre() + " está dictando clase en el departamento de " + departamento + ".");
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(departamento);
        System.out.println(salario);
    }
}
