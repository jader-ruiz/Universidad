public class Libro {
    
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(){
        disponible = true;
    }
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
    }

    public Libro(String titulo, String autor, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        if(!titulo.isEmpty()){
            this.titulo = titulo;
        }else{
            System.out.println("El titulo está vacio.");
        }
        
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public boolean isDisponible() {
        return disponible;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: "+getTitulo());
        System.out.println("El autor es: "+getAutor());
        if(isDisponible()){
            System.out.println("Esta disponible.");
        }
    }

    public void prestar(){
        if(disponible){
            setDisponible(false);
            System.out.println("Te prestamos el libro.");
        }else{
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolver(){
        if(!disponible){
            setDisponible(true);
            System.out.println("Libro devuelto.");
        }else{
            System.out.println("El libro ya está entregado.");
        }
    }

}
