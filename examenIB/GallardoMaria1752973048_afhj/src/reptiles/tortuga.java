package reptiles;

public class tortuga extends reptiles implements IComportamientoTortuga, IcomportamientoNotural {
    public tortuga (String nombre){
        setNombre(nombre);
        comer();
    }
    
    @Override
    public String nombre() {
        return "Celeste es una tortuga";
    }

    @Override
    public String comer(String comida) {
       return "Esta tortuga tiene hambre";
        
    }
    @Override
    public String comer() {
        return "Esta tortura esta comiendo";
    }

    @Override
    public String comer(tortuga plantas) {
        return "Esta tortuga esta comiendo" + getNombre();
    }
    
}
