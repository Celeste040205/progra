package creacionespecie;
import java.util.Scanner;

public class TanquedeMutacion {
    
    private String usuario;
    private String clave;
    private String nombre;
    
    public TanquedeMutacion(){
        setClave("321mutar");
        setUsuario("Celes");
        setNombre("Celeste");
        }
        
        public boolean login () {
            String usuario = "";
            String clave = "";
            boolean sinLogeo = false;
            
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingresa el usuario: ");
            usuario = sc.nextLine();
            System.out.print("Ingresa la clave: ");
            clave = sc.nextLine();
        
            if  (this.usuario.equalsIgnoreCase(usuario) 
                && this.clave.equalsIgnoreCase(clave))
                return true;
    
                System.out.print("para salir (s): ");
                if (sc.nextLine(). toUpperCase().equals("S"))
                    sinLogeo = true;
        } while (sinLogeo);
        return false;
        }
    
    
        public String getUsuario() {
            return usuario;
        }
        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }
        public String getClave() {
            return clave;
        }
        public void setClave(String clave) {
            this.clave = clave;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            if(nombre != null)
                this.nombre = nombre.toUpperCase();
            else 
                this.nombre = "";
        }
    }
    


