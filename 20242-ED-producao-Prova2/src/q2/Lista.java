/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2;

/**
 *
 * @author Davi
 */
public class Lista {
private No inicio;

    public Lista() {
        this.inicio = null;
    }

    // Método para inserir no final da lista (para cartões verdes)
    public void inserirFim(No no) {
        if (inicio == null) {
            inicio = no;
        } else {
            No aux = inicio;
            while (aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = no;
        }
    }

    // Método para inserir no final da subfila de cartões amarelos
    public void inserirPrioridade(No no) {
        if (inicio == null || inicio.cor == 'V') {
            // Insere no início se a lista estiver vazia ou se o primeiro for verde
            no.prox = inicio;
            inicio = no;
        } else {
            // Percorre até o último nó amarelo
            No aux = inicio;
            while (aux.prox != null && aux.prox.cor == 'A') {
                aux = aux.prox;
            }
            no.prox = aux.prox;
            aux.prox = no;
        }
    }

    // Método principal de inserção
    public void inserir(int numero, char cor) {
        No no = new No(numero, cor);

        if (cor == 'A') {
            inserirPrioridade(no);
        } else if (cor == 'V') {
            inserirFim(no);
        } else {
            System.out.println("Cor inválida! Utilize 'A' para amarelo ou 'V' para verde.");
        }
    }

    // Método para imprimir a lista
    public void imprimirLista() {
        No aux = inicio;
        while (aux != null) {
            System.out.print(aux.numero + "-" + aux.cor + " -> ");
            aux = aux.prox;
        }
        System.out.println("null");
    }    
}
