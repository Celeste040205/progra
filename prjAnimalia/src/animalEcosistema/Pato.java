package animalEcosistema;
import animalClasificacion.Ave;
import animalEcosistema.comportamiento.IAccion1;
import animalEcosistema.comportamiento.IAccion2;
import animalEcosistema.comportamiento.IAccion3;

public class Pato extends Ave implements IAccion1, IAccion2, IAccion3{
    public Halcon amigHalcon;
    public Pato(String nombre){
        setNombre(nombre);
        amigHalcon = new Halcon("Hawkmon");
    }
    
    @Override
    public String toString(){
        return " Clase: " + getClass().getName()
                + " nombre: " + getNombre()
                + " NroAlas: " + getNroAlas();
        
    }

    @Override
    public void nadar() {
        System.out.println("Pato esta nadando...");
    }

    @Override
    public void volar() {
        System.out.println("Pato esta volando...");
    }

    @Override
    public void correr() {
        System.out.println("Pato esta corriendo...");
    }
}
