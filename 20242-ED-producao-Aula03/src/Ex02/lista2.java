/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

import java.util.ArrayList;

/**
 *
 * @author Davi
 */
public class lista2 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        
        System.out.println("Lista: "+listaNumeros);
        
        System.out.println("Tamanho: "+listaNumeros.size());
        //utilizando for tradicional
        for(int i=0;i<listaNumeros.size();i++){
            System.out.println("Elem: "+listaNumeros.get(i));
        }
        
        //for-each
        
        
    }
    
}
