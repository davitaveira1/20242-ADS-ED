/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2;

import java.util.Scanner;

/**
 *
 * @author Davi
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();

        while (true) {
            // Entrada de dados
            System.out.print("Digite o número do paciente (ou 0 para sair): ");
            int numero = scanner.nextInt();

            // Condição de parada
            if (numero == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.print("Digite a cor do cartão (A para amarelo ou V para verde): ");
            char cor = scanner.next().toUpperCase().charAt(0);

            // Inserção do paciente
            lista.inserir(numero, cor);

            // Exibição da lista após inserção
            System.out.print("Lista após a inserção: ");
            lista.imprimirLista();
        }

        scanner.close();
    }
}
