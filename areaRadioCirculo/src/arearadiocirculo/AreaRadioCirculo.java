
package arearadiocirculo;

/**
 * Pedir el radio de un círculo y calcular su área. A=PI*r^2.
 * @author pabloarqueros
 */
public class AreaRadioCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here



        double a, r; // área y radio
        System.out.print("Introduce el radio de un circulo: ");
        r = Entrada.real();
        a = Math.PI * (r * r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        System.out.println("El área de una circunferencia de radio " + r + " es: " + a);
    }
}
