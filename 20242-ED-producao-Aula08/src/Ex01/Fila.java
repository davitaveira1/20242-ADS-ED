/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Davi
 */
public class Fila {

    public static void main(String[] args) {

        Queue<Cliente> fila = new LinkedList<>();

        fila.add(new Cliente("Davi"));
        fila.add(new Cliente("lucas"));
        fila.add(new Cliente("Marcos"));

        System.out.println("/////////IMPRESSÃO DA LISTA/////////");
        for(Cliente c : fila){
            System.out.println(c.nome);
        }
        System.out.println("/////////FIM DA IMPRESSÃO DA LISTA/////////");

        System.out.println("Próximo cliente a ser atendido: " + fila.peek().nome);

        System.out.println("Cliente atendido: " + fila.remove().nome);

        System.out.println("/////////IMPRESSÃO DA LISTA/////////");
        for(Cliente c : fila){
            System.out.println(c.nome);
        }
        System.out.println("/////////FIM DA IMPRESSÃO DA LISTA/////////");

    }

}
