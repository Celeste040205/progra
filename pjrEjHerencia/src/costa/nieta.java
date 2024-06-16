package costa;
import oriente.hijo;

public class nieta extends hijo {
    private String nombre;
    public nieta(String nombre, String nombrePapa) {
        super(nombrePapa);
        this.nombre = nombre;
    }

    @Override
    public void saludar(){
        System.out.println("Hi, soy " + nombre);
        System.out.println("soy hija de " + getNombre());
        System.out.println("y nieta de " + getNombreAbuelo());
    }

}

