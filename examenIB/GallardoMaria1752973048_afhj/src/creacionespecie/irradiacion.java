package creacionespecie;

import java.util.Random;

public class irradiacion{
    this.usuario = new TanquedeMutacion();
    if (!usuario.login()) {
        System.out.println("No se ha ingresado una clave válida. No se puede realizar la mutación.");
        return;
    }

        Random rand = new Random();
        int radiacion = 100 + rand.nextInt(1000);
        System.out.println("El animal " + animal.getNombre() + " ha sido expuesto a " + radiacion + " mSv de radiación.");
}

