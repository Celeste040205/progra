import costa.nieta;
import oriente.hijo;
import sierra.padre;

public class App {
    public static void main(String[] args) throws Exception {
        padre p = new padre("Jack");
        hijo h = new hijo("Misako");
        nieta n = new nieta("Hikari","Misako");
        p.saludar();
        h.saludar();
        n.saludar();
    }
}
