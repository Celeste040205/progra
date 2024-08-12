import java.util.Random;
public class retos {

    public void cgA02(){    
        
        System.out.print("Ingrese el tamaño de las letras: ");
        int size = App.sc.nextInt();
        
        
        System.out.print("Ingrese el carácter para formar las iniciales: ");
        char ch = App.sc.next().charAt(0);
        
        
        char[][] matrix = new char[size][2 * size + 1]; 
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2 * size + 1; j++) {
                matrix[i][j] = ' ';
                }
                }
                
                for (int i = 0; i < size; i++) {
                    matrix[i][0] = ch; 
                    matrix[i][size - 1] = ch; 
                    if (i <= size / 2) {
                        matrix[i][i] = ch; 
                        matrix[i][size - 1 - i] = ch; 
                        }
                        }
                        
                        int offset = size + 1; 
                        for (int i = 0; i < size; i++) {
                            matrix[0][offset + i] = ch; 
                            matrix[size - 1][offset + i] = ch; 
            matrix[i][offset] = ch; 
            if (i >= size / 2) {
                matrix[size / 2][offset + i] = ch; 
                if (i > size / 2) {
                    matrix[i][offset + size - 1] = ch; 
                    }
                    }
                    }
                    
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < 2 * size + 1; j++) {
                            System.out.print(matrix[i][j] + " ");
                            }
                            System.out.println();
        }
        App.sc.close();
        }
    public void cgA03(){
        
            
        String name = "Celeste";
        int nameLength = name.length();
        
                
        int width = 20; 
        int height = 15; 
                
        for (int y = height; y >= 0; y--) {
            if (y == 0) {
                System.out.print("0 |");
                for (int x = 1; x <= width; x++) {
                    System.out.print("_");
                }
                    System.out.println();
            } else {
                System.out.print(y + " |");
                for (int x = 1; x <= width; x++) {
                    if (2 * x == y) {
                        System.out.print(name.charAt((x - 1) % nameLength));
            } else {
                    System.out.print(" ");
            }
            }
            System.out.println();
            }
        }
    }
    public void cgA04(){
            String name = "Celeste Gallardo";
            int length = name.length();
            char[][] matrix = new char[length][length];
    
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    matrix[i][j] = ' ';
                }
            }
    
            for (int i = 0; i < length; i++) {
                matrix[i][i] = name.charAt(i);
                matrix[i][length - 1 - i] = name.charAt(i);
            }
    
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    }
    public void cgA05() throws InterruptedException {
        String fullName = "Celeste Gallardo";
        int length = fullName.length();
        char[][] matrix = new char[length][length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = ' ';
            }
        }

        for (int i = 0; i < length; i++) {
            int row, col;
            do {
                row = random.nextInt(length);
                col = random.nextInt(length);
            } while (matrix[row][col] != ' ');

            char currentChar = fullName.charAt(i);
            if (matrix[row][col] == ' ') {
                matrix[row][col] = currentChar;
            } else {
                matrix[row][col] = '*';
            }

            printMatrixWithDelay(matrix, length);
            Thread.sleep(500); 
        }
    }
    private static void printMatrixWithDelay(char[][] matrix, int length) {
        System.out.println();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void cgL10(){
        Random random = new Random();
        int fileSize = random.nextInt(91) + 10; // Generar número entre 10 y 100

        System.out.printf("Downloading ArchivoYarl-win_amd64.whl (%d kB)\n", fileSize);

        for (int i = 0; i <= fileSize; i++) {
            System.out.print("\r[");
            int progress = (int) ((i / (float) fileSize) * 30); // Calcular el progreso en 30 pasos

            for (int j = 0; j < 30; j++) {
                if (j < progress) {
                    System.out.print("\u001B[32m━\u001B[0m"); // Parte cargada en verde
                } else {
                    System.out.print(" ");
                }
            }
            System.out.printf("] %d / %d kB", i, fileSize);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            } 
        }
        System.out.println();
    }
    public void cgL11(){
        Random random = new Random();
        int levels = 10; 

        for (int i = 0; i < levels; i++) {
            int signalLength = random.nextInt(11);
            printSignal(signalLength, i + 1);
        }
    }
    private static void printSignal(int length, int level) {
        for (int i = 0; i < level; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("-");
            }
            System.out.print("|");
            for (int j = 0; j < length; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public void cgL12(){

        String[] figure = {
            "   \\|||/   ",
            "    (> <)   ",
            " ooO-(_)-Ooo"
                };
        
                int width = 30; // Ancho del movimiento
                for (int i = 0; i <= width; i++) {
                    printFigure(figure, i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        
                        e.printStackTrace();
                    } 
                }
        
                for (int i = width; i >= 0; i--) {
                    printFigure(figure, i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        
                        e.printStackTrace();
                    } 
                }
            } 
    private static void printFigure(String[] figure, int offset) {
        System.out.print("\033[H\033[2J"); // Limpiar pantalla
        System.out.flush();
            for (String line : figure) {
                for (int i = 0; i < offset; i++) {
                    System.out.print(" ");
                }
                System.out.println(line);
            }
    }   

}
