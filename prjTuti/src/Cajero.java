public class Cajero{

    private String usuario;
    private String clave;
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        if (usuario != null)
            this.usuario = usuario;
        else
            this.usuario = "";
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        if (clave != null)
            this.clave = clave;
        else
            this.clave = "Clave no ingresada";
    }

}