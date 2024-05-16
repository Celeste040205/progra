public class Usuario {
    private String nombre;
    private Integer edad;

    public void setEdad(Integer edad) {
        if (edad > 0)
            this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre.toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean ingresar() {
        String nombreString;
        System.out.println("Dime tu nombre: ");
        nombreString = App.sc.nextLine();
        setNombre(nombreString);
        return true;
    }

    public void crearDino() {
        
        System.out.println("crear un dino");
        
    }
}
