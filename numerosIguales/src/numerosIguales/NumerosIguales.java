/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosIguales;

/**
 *
 * @author pabloarqueros
 */
public class NumerosIguales {

    public static void main(String[] args) {
        int numero1, numero2;
        System.out.print("Introduce un número: ");
        numero1 = Entrada.entero();
        System.out.print("Introduce otro número: ");
        numero2 = Entrada.entero();
        if (numero1 == numero2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}
