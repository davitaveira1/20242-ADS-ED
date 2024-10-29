/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exerc;

import java.util.Scanner;

/**
 *
 * @author Davi
 */
public class Ex06 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcao;
        
        do {    
            
            System.out.println("==MENU==");
            System.out.println("1 - ADD");
            System.out.println("2 - Remover");
            System.out.println("0 - SAIR");
            System.out.println("");
            System.out.print("Informe a opção: ");
            
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Adicionar");                    
                    break;
                case 2:
                    System.out.println("Remover");                    
                    break;       
                case 0:
                    System.out.println("Saindo da aplicação!");                    
                    break;                        
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            
            
        } while (opcao != 0);
        
    }
    
}
