public class persona {
    private String cedula;
    private String nombre;
    private String apellido;

    public persona(){
        cedula = " ";
        nombre = " ";
        apellido = " ";
    }

    public persona(String cedula, String nombre, String apellido){
        setCedula(cedula);
        setNombre(nombre);
        setApellido(apellido);
    }

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        if (cedula != null || cedula.length()>=10)
            this.cedula = cedula;
        else
            this.cedula = "noValido";
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre == null)
            this.nombre = nombre.toUpperCase();
        else
            this.nombre = nombre;
 
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        if (apellido == null)
            this.apellido =  apellido.toUpperCase();
        else
            this.apellido = apellido;
    }
}
