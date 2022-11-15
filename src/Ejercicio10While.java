import javax.swing.*;

public class Ejercicio10While {
    public static void main(String[] args) {
        int numero, suma = 0;

        for(int i=1; i<=10; i++){
           numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));

           suma += numero; //Suma iterativa
        }
        System.out.println("La suma es: " + suma);
    }
}
