/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Davi
 */
public class ListaSimples {

    //índices da lista
    No primeiro;
    No ultimo;

    public ListaSimples() {
        primeiro = null;
        ultimo = null;
    }

    void adicionarNoFim(No novoNo) {
        //verificar se lista é vazia
        if (primeiro == null) {
            primeiro = novoNo;    
            ultimo = novoNo;
        } else {
            ultimo.prox = novoNo; 
            ultimo = novoNo;
        }        
    }
    
    void adicionarNoInicio(No novoNo){
        
    }
    
    void imprimirLista(){
        No aux=primeiro;
        while(aux!=null){
            System.out.println(aux.valor);
            aux=aux.prox;
        }
    }

}
