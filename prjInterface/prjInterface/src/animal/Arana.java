package animal;

import clasificacionAnimal.Insecto;

public class Arana extends Insecto implements IComportamientoNatural, IComportamientoInsecto {

    public Arana(String nombre){
        setNombre(nombre);
        nacer();

    }

    @Override
    public void nacer() {
       System.out.println("Leon naciendo...");
    }

    @Override
    public String comer(String comida) {
       return "Este arana ha comido " + comida;
        
    }

    @Override
    public String comer() {
        return "Este arana esta comiendo hambre";
    }
    @Override
    public String comer(Mosca mosca) {
        return "Este arana esta comiendo" + getNombre();
    }
}
