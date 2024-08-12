package animalEcosistema;

import animalClasificacion.Mamifero;
import animalEcosistema.comportamiento.IAccion1;
import animalEcosistema.comportamiento.IAccionCarnivora;

public class Leon extends Mamifero implements IAccionCarnivora, IAccion1{
    
    public Pato alimentoPato;

    public Leon (String nombre){
        setNombre(nombre);
        alimentoPato = new Pato("Lucas");
    }

    @Override
    public String toString(){
        return "\n Clase: " + getClass().getName()
             + "\n Nombre: " + getNombre();
    }

    @Override
    public void comer(Pato alimentoPato) {
       System.out.println("Leon come: " + alimentoPato.toString());

    }

    @Override
    public void correr() {
       
    System.out.println("El leon corre");
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }

}
