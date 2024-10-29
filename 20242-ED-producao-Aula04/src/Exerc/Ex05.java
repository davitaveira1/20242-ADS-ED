/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exerc;

/**
 *
 * @author Davi
 */
public class Ex05 {
    
    public static void main(String[] args) {
        String situacao="em aberto";
        
        switch (situacao) {
            case "aprovado":
                System.out.println("Aluno aprovado!");
                break;
            case "recuperacao":
                System.out.println("Aluno de recuperação!");
                break;
            case "reprovado":
                System.out.println("Aluno reprovado!");
                break;
            default:
                System.out.println("Situação não avaliada!");
                break;
                
        }
    }
    
}
