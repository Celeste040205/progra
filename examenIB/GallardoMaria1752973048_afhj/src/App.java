import java.util.Scanner;
import arbol.amniota;
import arbol.gnathostomata;
import arbol.osteichthyes;
import arbol.protezoico;
import arbol.sarcopterygii;
import arbol.spinner;
import arbol.tetrapoda;
import creacionespecie.AnimalMutado;
import creacionespecie.TanquedeMutacion;
import reptiles.tortuga;

public class App {
    public static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) throws Exception {

        spinner sp = new spinner();
        sp.dcMostrarSpinner();
        
        protezoico protezoico = new protezoico(0);
        gnathostomata gnathostomata = new gnathostomata(0);
        osteichthyes osteichthyes = new osteichthyes(0);
        sarcopterygii sarcopterygii = new sarcopterygii(0);
        tetrapoda tetrapoda = new tetrapoda(0);
        amniota amn = new amniota(0);
        
        System.out.println(" ");
        
        System.out.println("Animal y sus comportamientos");
        System.out.println(" Carpeta Reptiles");
        
        System.out.println(" ");
        
        tortuga t = new tortuga(" ");
        
        System.out.println(t.nombre());
        System.out.println(t.comer());
        System.out.println(t.comer("hambre"));
        System.out.println(t.comer(t));
        
        System.out.println(" ");
        System.out.println("Mutacion de la tortuga");
        System.out.println(" ");

        // setClave("321mutar");
        // setUsuario("Celes");
        // setNombre("Celeste");

        TanquedeMutacion tm = new TanquedeMutacion();
        tm.login();

        AnimalMutado am = new AnimalMutado();
        System.out.println("CelesteTortugaGallardo esta mutando");
        System.out.println("Irradiando: 183 de 842 (mSv)");

        


    }
}
