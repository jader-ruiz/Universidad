public class DepositoAgua {
    private double capacidad;
    private double volumenActual;
    private DepositoAgua depositoDesborde;

    public double getCapacidad() {
        return capacidad;
    }
    public double getVolumenActual() {
        return volumenActual;
    }

    public DepositoAgua getDepositoDesborde() {
        return depositoDesborde;
    }

    public void setCapacidad(double capacidad) {
        if(capacidad > 0){
            this.capacidad = capacidad;
        }else{
            System.out.println("Capacidad ingresada invalida.");
        }
    }

    public void setVolumenActual(double volumenActual) {
        if(volumenActual > 0 && volumenActual <= capacidad){
            this.volumenActual = volumenActual;
        }else{
            System.out.println("Volumen ingresado invalido.");
        }
    }

    public void setDepositoDesborde(DepositoAgua depositoDesborde) {
        this.depositoDesborde = depositoDesborde;
    }

    public void mostrarEstado(){
        System.out.println("Capacidad: "+capacidad);
        System.out.println("Volumen actual: "+volumenActual);
        System.out.println("Espacio libre: "+(capacidad-volumenActual));
    }

    public void agregarAgua(double cantidad){
        double espacioLibre = capacidad - volumenActual;   
        boolean desbordamiento = false; 

        if((cantidad+volumenActual) > capacidad){
            System.out.println("Se generará un desbordamiento porque ya se lleno el tanque.");

            double desborde = cantidad - espacioLibre;
            volumenActual = capacidad;

            if(depositoDesborde != null){
                depositoDesborde.agregarAgua(desborde);
            }else{
                System.out.println("Alerta: Se derramaron " + desborde + "L de agua.");
            }
            desbordamiento = true;

            
        }else if(desbordamiento && cantidad > 0 && cantidad+volumenActual <= capacidad){
            System.out.println("Se agrego "+cantidad+"L más de agua");
            volumenActual += cantidad;
            desbordamiento = false;
        }
    }

    public void quitarAgua(double cantidad){
        if(cantidad < 0){
            System.out.println("No puedes ingresar valores menores a 0");
            return;
        }

        if(cantidad > volumenActual){
            System.out.println("No puedes quitar más agua de la que hay");
            volumenActual = 0;
        }else if (cantidad <= volumenActual) {
            volumenActual -= cantidad;
        }
    }

}
