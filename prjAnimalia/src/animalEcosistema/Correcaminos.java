package animalEcosistema;

import animalClasificacion.Ave;
import animalEcosistema.comportamiento.IAccion1;

public class Correcaminos extends Ave implements IAccion1{
    
    public Correcaminos(String nombre){
        setNombre(nombre);
    }

    @Override
    public void correr(){
        System.out.println("El correcaminos corre");
    }

    @Override
    public String toString(){
        return " Clase: " + getClass()
                + " nombre: " + getNombre()
                + " NroAlas: " + getNroAlas();
        
    }

}
