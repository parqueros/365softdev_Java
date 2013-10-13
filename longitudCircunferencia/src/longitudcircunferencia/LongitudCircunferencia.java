/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package longitudcircunferencia;

/**
 *
 * @author pabloarqueros
 */
public class LongitudCircunferencia {

    public static void main(String[] args) {

        double longiud, radio; // longitud y radio
        System.out.print("Introduce el radio de una circunferencia: ");
        radio = Entrada.real();
        longiud = 2 * Math.PI * radio;
        System.out.println("La longitud de una circunferencia de radio " + radio + " es: " + longiud);
    }
}
