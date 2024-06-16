package oriente;
import sierra.padre;

public class hijo extends padre{
    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public hijo(){
        super("papá");
    }

    public hijo(String nombre){
        super("Misako");
        this.nombre = nombre;
    }

    @Override
    public void saludar(){
        System.out.println("Hola, soy " + nombre);
        System.out.println("soy hijo de "+getNombreAbuelo());
    }

    
}
