import java.util.Scanner;

public class f1 {
    Scanner scanner = new Scanner(System.in);
    public void F1(){
        System.out.println(" ");
        System.out.println("F1");
        System.out.println(" ");
        String cga = "* ";
        String cgb = "+ ";
        String cgd = "  ";

        System.out.print("Ingrese el número de ancho: ");
        int cgancho = scanner.nextInt();

        System.out.print("Ingrese el número de altura: ");
        int cgalto = scanner.nextInt();

        for (int i = 0; i < cgancho; i++) { 
            for (int j = 0; j < cgalto; j++) { 
                if (i == 0 || i == cgancho - 1 || j == 0 || j == cgalto - 1) {
                    if ((i + j) % 2 == 0) {
                        System.out.print(cga);
                    } else {
                        System.out.print(cgb);
                    }
                } else {
                    System.out.print(cgd); 
                }
            }
            System.out.println();
        }
    }
}
