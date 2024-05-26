import java.util.Scanner;

public class CelesteGallardo {
    public void cgFormas(int cgancho, int cgaltura){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija la forma o figura que desea generar:");
        System.out.println("1. F1");
        System.out.println("2. F2");
        System.out.println("3. F3");
        System.out.println("4. F4");
        System.out.println("5. F5");
        System.out.println("6. F6");
        System.out.println("7. F7");
        System.out.println("8. F8");
        System.out.println("9. F9");
        System.out.println("10. F10");
        System.out.println("11. F11");
        System.out.println("12. F12");
        System.out.println("13. F13");
        System.out.println("14. F14");
        System.out.println("15. F15");
        System.out.println("16. F16");
        System.out.println("17. F17");
        System.out.println("18. F18");
        System.out.println("19. F19");
    
        int forma = scanner.nextInt();
        switch (forma) {
            case 1:
                //La forma es un cuadrado con asteriscos
                System.out.println(" ");
                System.out.println("F1");
                System.out.println(" ");
                String cga = "*";
                for (int i = 1; i <= cgancho; i++) {
                    System.out.print(cga);
                }
                
                for (int i = 1; i <= cgaltura; i++) {
                    for (int j = 1; j <= 1; j++) {
                        for (int k = 1; k <= cgaltura; k++) {
                            System.out.print(cga);
                        }
                        System.out.print("       ");
                    }
                    System.out.print(cga);
                }
                System.out.println("");
                
                for (int i = 1; i <= cgancho; i++) {
                    System.out.print(cga);
                }
                
                break;
                
            case 2:
                //La forma es un cuadrado con asteriscos y signos
                System.out.println(" ");
                System.out.println("F2");
                System.out.println(" ");
                String cgc = "*";
                String cgb = "+";
            
                for(int i=1; i<cgancho; i++){
                    if (i%2==0) 
                        System.out.print(cgc);
                    else
                        System.out.print(cgb); 
                }                   
                System.out.println("");
                
                for (int i = 1; i <= cgaltura; i++) {
                    for (int j = 1; j <= 1; j++) {
                        for (int k = 1; k <= cgaltura; k++) {
                            if (i%2==0) 
                                System.out.print(cgc);
                            else
                                System.out.print(cgb); 
                        }
                        System.out.print("       ");
                    }
                    System.out.print(cgc);
                }
                System.out.println("");
                    
                for(int i=1; i<cgancho; i++)
                    if (i%2==0) 
                    System.out.print(cgc);
                else
                    System.out.print(cgb);
                System.out.println("");
            
            break;

            case 3:
                System.out.println(" ");
                System.out.println("F3");
                System.out.println(" ");
                
            break;
            
            case 4:
                System.out.println(" ");
                System.out.println("F4");
                System.out.println(" ");

            break;
            case 5:
                System.out.println(" ");
                System.out.println("F5");
                System.out.println(" ");
                
                
            break;
            case 6:
                System.out.println(" ");
                System.out.println("F6");
                System.out.println(" ");
                
                
                
            break;
            case 7:
                System.out.println(" ");
                System.out.println("F7");
                System.out.println(" ");
                

            break;
            case 8:
                System.out.println(" ");
                System.out.println("F8");
                System.out.println(" ");
                

            break;
            case 9:
                System.out.println(" ");
                System.out.println("F9");
                System.out.println(" ");
    
            break;
            case 10:
                System.out.println(" ");
                System.out.println("F10");
                System.out.println(" ");

            break;
            case 11:
                System.out.println(" ");
                System.out.println("F11");
                System.out.println(" ");
            
            break;
            case 12:
                System.out.println(" ");
                System.out.println("F12");
                System.out.println(" ");
            break;
            case 13:
                System.out.println(" ");
                System.out.println("F13");
                System.out.println(" ");
                
            break;
            case 14:
                System.out.println(" ");
                System.out.println("F14");
                System.out.println(" ");
                
            break;
            case 15:
                System.out.println(" ");
                System.out.println("F15");
                System.out.println(" ");
            
            break;
            case 16:
                System.out.println(" ");
                System.out.println("F16");
                System.out.println(" ");
            break;
            case 17:
                System.out.println(" ");
                System.out.println("F17");
                System.out.println(" ");
            break;
            case 18:
                System.out.println(" ");
                System.out.println("F18");
                System.out.println(" ");            

            break;
            case 19:
                System.out.println(" ");
                System.out.println("F19");
                System.out.println(" ");            

            break;
            default:
                break;
        }
    }    
    
}
