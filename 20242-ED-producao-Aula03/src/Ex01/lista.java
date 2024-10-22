/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

import java.util.ArrayList;

/**
 *
 * @author Davi
 */
public class lista {
    
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        
        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(30);
        listaNumeros.add(40);
        
        System.out.println("Lista: "+listaNumeros);
        //adicionar por posição
        listaNumeros.add(1, 50);
        System.out.println("Lista: "+listaNumeros);
        listaNumeros.add(0, 50);
        System.out.println("Lista: "+listaNumeros);
        
        //buscar elemento por posicao
        int elem = listaNumeros.get(4);
        System.out.println("Elem: "+elem);
        
        //remover por posição
        listaNumeros.remove(3);
        System.out.println("Lista: "+listaNumeros);
        
        //tamanho lista
        System.out.println("Tamanho: "+listaNumeros.size());
        
        //limpar lista
        listaNumeros.clear();
        System.out.println("Lista: "+listaNumeros);
        
        
        
        
    }
    
}
