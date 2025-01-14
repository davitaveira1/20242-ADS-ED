/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

import java.util.Scanner;

/**
 *
 * @author Davi
 */
public class Principal {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Scanner entrada = new Scanner(System.in);

        while (true) {
            
            int tamanho = lista.contarNos();
            System.out.print("\nDigite um valor (-1 para sair): ");
            int valor = entrada.nextInt();

            if (valor == -1) {
                
                break;
            }
            
            System.out.print("Escolha a posição (entre 0 e "+tamanho+")");
            int pos = entrada.nextInt();
            
            System.out.println("Lista antes da inserção: ");
            lista.imprimir();
            
            lista.inserirEmPosicao(new No(valor), pos);
            System.out.println("Lista após a inserção: ");            
            lista.imprimir();            

        }
        System.out.println("Programa encerrado!");
    } 
}
