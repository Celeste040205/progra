package arbol;

public class spinner {
    public void dcMostrarSpinner() {
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            System.out.print("\r" + i + "% " + (i % 4 == 0 ? "|" : i % 4 == 1 ? "/" : i % 4 == 2 ? "-" : "\\"));
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("100%");
        System.out.println("Carga completa");
    }
}
