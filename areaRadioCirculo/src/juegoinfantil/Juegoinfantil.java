/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoinfantil;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author pabloarqueros
 */
public class Juegoinfantil {

    public static void main(String[] args) {


        int pos1 = 0;
        int pos2 = 0;
        System.out.println(juegoinfantil(pos1, pos2));
    }
    
    
    
    /*  Metodo recursivo del famoso juego infantil de Piedra, Papel o Tijera*/
    
    private static int numpartidas = 0;

    public static int juegoinfantil(int eleccion1, int eleccion2) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Piedra(1), papel(2) o tijera(3): ");
        eleccion1 = entrada.nextInt();
        Random teclado = new Random();
        eleccion2 = teclado.nextInt(3) + 1;
        numpartidas++;

        if (eleccion1 == 1 && eleccion2 == 2) {
            System.out.println("Has perdido. Tenia Papel" + "(" + eleccion2 + ")");


        } else if (eleccion1 == 1 && eleccion2 == 3) {
            System.out.println("Has ganado. Tenia Tijera" + "(" + eleccion2 + ")");


        } else if (eleccion1 == 2 && eleccion2 == 1) {
            System.out.println("Has ganado. Tenia Piedra" + "(" + eleccion2 + ")");


        } else if (eleccion1 == 2 && eleccion2 == 3) {
            System.out.println("Has perdido. Tenia Tijera" + "(" + eleccion2 + ")");


        } else if (eleccion1 == 3 && eleccion2 == 1) {
            System.out.println("Has perdido. Tenia Piedra" + "(" + eleccion2 + ")");


        } else if (eleccion1 == 3 && eleccion2 == 2) {
            System.out.println("Has ganado. Tenia Papel" + "(" + eleccion2 + ")");


        } else {
            System.out.println("Empate!!.Jugamos otra vez." + "Tenía (" + eleccion2 + ")");

            
            return juegoinfantil(eleccion1, eleccion2);

        }
        System.out.println("Numero de intentos");
        return numpartidas;
    }
}
