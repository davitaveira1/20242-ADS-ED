/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

import java.util.Stack;

/**
 *
 * @author Davi
 */
public class Pilha {
    
    public static void main(String[] args) {
        Stack<Integer> pilhaInteiros = new Stack<>();
        
        pilhaInteiros.push(10);
        pilhaInteiros.push(20);
        pilhaInteiros.push(30);
        pilhaInteiros.push(40);
        
        System.out.println("Pilha: "+pilhaInteiros);
        
        System.out.println(pilhaInteiros.pop());
        
        System.out.println("Consultando topo da pilha: "+pilhaInteiros.peek());
        
        pilhaInteiros.clear();
        if(pilhaInteiros.isEmpty()){
            System.out.println("Pilha vazia!");
        }else{
            System.out.println(pilhaInteiros);
        }
    }
    
}
