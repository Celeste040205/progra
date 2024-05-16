import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario();

        System.out.println(" ");
        usuario.ingresar();
        usuario.crearDino();
        usuario.getEdad();

        System.out.println(" ");
    }
}
