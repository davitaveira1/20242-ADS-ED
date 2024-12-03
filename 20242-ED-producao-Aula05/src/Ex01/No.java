/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class No {

    int valor;
    No prox;

    No(int valor) {
        this.valor = valor;
        prox = null;
    }

    public static void main(String[] args) {

        No n1 = new No(1);
        No n2 = new No(2);
        No n3 = new No(3);

        n1.prox = n2;
        n2.prox = n3;
        
        System.out.println("n1.valor: "+n1.valor);
        System.out.println("n2.valor: "+n2.valor);
        System.out.println("n3.valor: "+n3.valor);
        
        System.out.println("===Imprimindo a lista===");
        No aux = n1;
        while(aux!=null){
            System.out.println("aux.valor: "+aux.valor);
            aux = aux.prox;
        }



    }

}
