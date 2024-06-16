package sierra;

public class padre {
    private String nombre;

    public padre(String nombre){
        setNombre("Jack");
    }
    public String getNombre(){
        return nombre;
    }
    public String getNombreAbuelo(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = " ";
        if(nombre != null)
        this.nombre = nombre;
    }
    
    public void saludar(){
        System.out.println("Buenos dias, soy  " + this.nombre);
    }
}
