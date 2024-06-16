import java.util.Scanner;

public class persona {
String nombres;
int edad;
int edad2;
public int getEdad2() {
    return edad2;
}

public void setEdad2(int edad2) {
    this.edad2 = edad2;
}

public persona(String nombres, int edad) {
    this.nombres = nombres;
    this.edad = edad;
}

public String getNombres() {
    return nombres;
}

public void setNombres(String nombres) {
    this.nombres = nombres;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public void ponerEdad(){
    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la edad: ");
        edad2+=sc.nextInt();
    } catch (Exception e) {
        System.out.println("ingrese solo numeros: ");
        ponerEdad();
    }
    
}


}