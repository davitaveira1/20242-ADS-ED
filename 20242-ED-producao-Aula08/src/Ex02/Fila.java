/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Davi
 */
public class Fila {
    
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        
        fila.add(1);
        fila.add(2);
        fila.add(3);
        
        System.out.println(fila);
        
        System.out.println("Elemento que será atendido: "+fila.peek());
    }
    
}
