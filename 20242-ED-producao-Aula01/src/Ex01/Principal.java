/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class Principal {

    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5};
        //for
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]:" + vetor[i]);
        }
        //for-each
        //System.out.println("\n");
        for (int numero : vetor) {
            System.out.println(numero);
        }

        //while
        int i = 0;
        while (i < vetor.length) {
            System.out.println("vetor[" + i + "]:" + vetor[i]);
            i++;
        }

    }

}
