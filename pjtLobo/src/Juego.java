import java.util.Arrays;

public class Juego {

    public Jugador usuario;
    private String rio;
    private String[] ladoIzq;
    private String[] ladoDer;
    private Boolean vikingoEstaIzq;
    private String barca;

    
    public Juego() {
        this.usuario        = new Jugador();
        this.rio            = "..".repeat(20);
        this.barca          = "\\_V_,_?_/";
        this.ladoIzq        = new String[] { "V", "L", "C", "U" };
        this.ladoDer        = new String[] { "", "", "", "" };
        this.vikingoEstaIzq = true;
    }
    int opc=-1; 
    public void jugarLobito(){
        System.out.println("Bienvenido al juego de la barca");
        if(!usuario.login())
            System.exit(0);

        System.out.println("Tu objetivo es llevar a todos los personajes a la otra orilla sin que nadie muera");

        do{
            short opcMenu= mostrarMenu();
            String individuo = " ";
            if(vikingoEstaIzq){
                individuo        = ladoIzq[opcMenu];
                ladoIzq[opcMenu] = " ";
            }
            else {
                individuo        = ladoDer[opcMenu];
                ladoDer[opcMenu] = " ";
            }
            moverBarca(individuo);
            vikingoEstaIzq = !vikingoEstaIzq;
            if(vikingoEstaIzq) {
                ladoIzq[opcMenu] = individuo;
                setBarcaRio(1, " ");
            }
            else {
                ladoDer[opcMenu] = individuo;
                setBarcaRio(rio.length(), " ");
            }
        verificarRegla();
        }while (true);
    }
    
    private void verificarRegla(){
        String msg = "";

        //Reglas con las que se pierde el juego
        if (vikingoEstaIzq) {
            //R1: lobo come caperucita
            if (ladoDer[1].equals("L")
            && ladoDer[2].equals("C"))
                msg += "\n Rip Caperucita, perdiste";   
            //R2: Caperucita come uvas
            if (ladoDer[2].equals("C")
            && ladoDer[3].equals("U"))
                msg += "\n Rip Uvas, perdiste";   
        } else {
            //R1: lobo come caperucita
            if (ladoIzq[1].equals("L")
            && ladoIzq[2].equals("C"))
                msg += "\n Rip Caperucita, perdiste";   
            //R2: Caperucita come uvas
            if (ladoIzq[2].equals("C")
            && ladoIzq[3].equals("U"))
            msg += "\n Rip Uvas, perdiste";   
        }
        if (ladoDer[1].equals("L")
            && ladoDer[2].equals("C")
            && ladoDer[3].equals("U"))
            msg = "Bien Hecho! Ganaste";
        if (!msg.isEmpty()){
            System.out.println("\n\n" +msg +"\n\n");
            System.exit(0);
        }

    }

    private Short mostrarMenu(){
        //System.out.println( " ".repeat(10) + barca + rio);
        System.out.println( "\n 0 Vikingo va solo "
                           +"\n 1 Lobo            "
                           +"\n 2 Caperucita      "  
                           +"\n 3 Uvas            "  
                           +"\n 4 Salir           ");
        do{
            try {
                opc=-1;
                String personaje = "";
                System.out.print("\n[+] Ingresa una opc:");
                opc = App.sc.nextInt();
                // verificar que exista un personaje
                personaje =  (vikingoEstaIzq)
                          ? ladoIzq[opc]
                          : ladoDer[opc];
                if(personaje.trim().isEmpty() && opc > 0){
                    opc=-1;
                    System.out.println("no existe ese personaje en el lado");
                }
                // validar la opcion selecionada
                if(opc==4){
                    System.out.println("Game over");
                    System.exit(0);
                }
            } catch (Exception e) { App.sc.next(); }
        }
        while(opc>=4 || opc<0);
        return (short) opc;
    }

    public void moverBarca(String individuo) {
        if (vikingoEstaIzq)
            for (int i = 0; i < rio.length(); i++) {
                setBarcaRio(i, individuo);
            }
            else
            for (int i = rio.length() ; i >= 0; i--) {
                setBarcaRio(i, individuo);
            }

    }

    private void setBarcaRio(int posicionBarca, String individuo) {
        String personajeIzq = Arrays.toString(ladoIzq);
        String personajeDer = Arrays.toString(ladoDer);
        String rioBarca = "\r"
                        + personajeIzq
                        +".".repeat(posicionBarca) 
                        + barca.replace("?", individuo)
                        + ".".repeat(rio.length() - posicionBarca)
                        + personajeDer;
        System.out.print( rioBarca);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {}
    }

}