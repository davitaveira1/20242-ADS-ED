/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author Davi
 */
public class Principal {

    public static void main(String[] args) {
        int[] idade = {10, 20, 30, 40};
        boolean flag = false, flagNome = false;

        for (int i = 0; i < idade.length; i++) {
            if (idade[i] == 60) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Encontrou");
        } else {
            System.out.println("Não encontrou");
        }

        //nomes
        String[] nomes = {"davi", "daniel"};

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("davi")) {
                flagNome = true;
            }
        }
        if (flagNome) {
            System.out.println("Encontrou");
        } else {
            System.out.println("Não encontrou");
        }

    }

}
