package arbol;

public class protezoico {
    public void forM(){
        System.out.println("Arbol:");
    }
    public protezoico(int MGnivel) {
        imprimirIndentacion(MGnivel);
        System.out.println(this.getClass().getSimpleName());
    }

    private void imprimirIndentacion(int MGnivel) {
        for (int i = 0; i < MGnivel; i++) {
            System.out.print("----");
        }
    }
}
