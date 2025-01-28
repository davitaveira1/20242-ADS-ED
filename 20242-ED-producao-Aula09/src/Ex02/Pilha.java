/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

import java.util.Stack;

/**
 *
 * @author Davi
 */
public class Pilha {
    
    public static void main(String[] args) {
        Stack<Aluno> pilhaAlunos = new Stack<>();
        
        Aluno a1 = new Aluno("Lucas");
        
        pilhaAlunos.push(new Aluno("Davi"));
        pilhaAlunos.push(a1);
        
        System.out.println(pilhaAlunos);
        
        System.out.println(pilhaAlunos.pop());
        System.out.println("====");
        System.out.println(pilhaAlunos);
    }
    
}
