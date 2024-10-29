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
public class Ex02 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num,soma=0;
        
        do {            
            
            System.out.print("Informe um numero: ");
            num = entrada.nextInt();
            
            if(num < 0){
                System.out.println("Numero inválido!");
            }else{
                soma += num;
                System.out.println("Pontuação acumulada: "+soma);
            }
            
            
        } while (num != 0);
        
        System.out.println("Pontuação final: "+soma);    
    }
    
}
