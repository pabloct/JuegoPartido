/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JavaWeb-LM
 */
import java.util.Random;

public class prueba {

    public static void main(String[] args) {
        int[] ndigitos = new int[10];
        int n;

        Random rnd = new Random();

// Inicializar el array
        for (int i = 1; i < 7; i++) {
            ndigitos[i] = 1;
        }

// verificar que los números aleatorios están uniformente distribuídos 100000L
        for (long i = 1; i < 10; i++) {
// genera un número aleatorio entre 0 y 9
            n = (int) (rnd.nextDouble() * 6.0);
//Cuenta las veces que aparece un número
            ndigitos[n]++;
        }

// imprime los resultados
        for (int i = 1; i < 6; i++) {
            System.out.println(i  + ": MAS " + ndigitos[i]);
        }

//Dos secuencias de 5 número (distinta semilla)
        System.out.println("Primera secuencia");
        for (int i = 1; i < 6; i++) {
            System.out.print("\t" + rnd.nextDouble());
        }
        System.out.println("");

        System.out.println("Segunda secuencia");
        for (int i = 1; i < 6; i++) {
            System.out.print("\t" + rnd.nextDouble());
        }
        System.out.println("");

//Dos secuencias de 5 número (misma semilla)
        rnd.setSeed(3816L);
        System.out.println("Primera secuencia");
        for (int i = 1; i < 6; i++) {
            System.out.print("\t" + rnd.nextDouble());
        }
        System.out.println("");

        rnd.setSeed(3816);
        System.out.println("Segunda secuencia");
        for (int i = 1; i < 6; i++) {
            System.out.print("\t" + rnd.nextDouble());
        }
        System.out.println("");

        try {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        } catch (Exception e) {
        }
    }

}
