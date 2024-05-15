public class Usuario {
    private String nombre;

    public void setNombre(String nombre){
        this.nombre = nombre.toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean ingresar() {
        System.out.println("listo para el ingreso");
        return true;
    }

    public void crearDino() {
        System.out.println("crear un dino");
        
    }
}
