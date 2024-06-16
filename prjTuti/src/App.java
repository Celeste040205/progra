import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // persona oP = new persona();
        // persona oP2 = new persona(null, null, null);
        cliente cP = new cliente();
        Cajero oC = new Cajero();
        supervisor oS = new supervisor();

        // oP.setNombre("Shato");
        // oP.setCedula("1752073048");
        // oP.setApellido(null);
        
        oC.setNombre("Shato");
        oC.setCedula("1752073048");
        oC. se apellido ("Atai")

        // System.out.println(oP.getNombre());
        // System.out.println(oP.getApellido());
        // System.out.println(oP.getCedula());
        
        System.out.println(oP2.getNombre());
        System.out.println(oP2.getApellido());
        System.out.println(oP2.getCedula());
    }

    private static void flujoString() {
        int total=0;
        String datos = "1-2-3";
        Scanner sc = new Scanner(datos);
        sc.useDelimiter("-");

        while (sc.hasNextInt()) {
            total+=sc.nextInt();
        }
        System.out.println("total es:" +total);
        sc.close();
    }

    private static void flujotrabajoTeclado() {
        int total = 0;
        System.out.println("ingresa los numeros para la suma: "+total);

        while (sc.hasNextInt()) {
            total+= sc.nextInt();
        }
        System.out.println("la suma de todos los numeros es: "+total);
        sc.next();
    }

    private static void argumentoMain(String[] args) {
        if  (   (args.length == 2) && 
                (args[0].equals("Celeste") && args[1].equals("dekutodo")) ) {  
            System.out.println("Hola Celeste, bienvenida al digimundo");
            System.err.println("los parametros que ingresaste son:  " + args);
        }
        else{
            System.out.println("¿quien eres tu, un  maldito espia?"); 
            System.exit(0);
        }
    }
}
