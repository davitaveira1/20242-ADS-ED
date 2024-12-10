/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        No n1 = new No(1);
        No n2 = new No(2);
        No n3 = new No(3);
        
        ListaSimples lista = new ListaSimples();
        
        lista.adicionarNoFim(n1);
        lista.adicionarNoFim(n2);
        lista.adicionarNoFim(n3);
        
        lista.imprimirLista();
    }
    
}
