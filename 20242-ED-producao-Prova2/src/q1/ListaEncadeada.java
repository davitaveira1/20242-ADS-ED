/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

/**
 *
 * @author Davi
 */
public class ListaEncadeada {
    
    No inicio,fim = null;
    
    
    void inserirNoInicio(No novoNo){
        if(inicio==null){
            inicio = novoNo;
            fim = novoNo;
        }else{
            
            novoNo.prox = inicio;
            inicio = novoNo;
            
        }
    }
    
    void inserirNoFim(No novoNo){
        if(inicio==null){
            inicio = novoNo;
            fim = novoNo;
        }else{
            fim.prox = novoNo;
            fim = novoNo;
        }
    }
    
    void imprimir(){
        
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }        
        No aux=inicio;
        while(aux != null){
            System.out.print(aux.valor);
            if(aux.prox != null)
                System.out.print("->");
            aux = aux.prox;
        }
        System.out.println();
    }
    
    int contarNos(){
        No aux=inicio;
        int cont=0;
        while(aux != null){
            cont++;
            aux = aux.prox;
        }
        return cont;        
    }
    
    void inserirEmPosicao(No novoNo,int pos){
        
        if(inicio==null){
            inserirNoInicio(novoNo);
        }else{
            //verificar pos
            if(pos==0){
                inserirNoInicio(novoNo);
            }else{
                //inserir no meio
                if(pos < contarNos()){
                    No aux=inicio;
                    int proximaPosicaoAux = 1;
                    while(pos != proximaPosicaoAux){
                        proximaPosicaoAux++;
                        aux = aux.prox;
                    }
                    novoNo.prox = aux.prox;
                    aux.prox = novoNo;
                }else{
                    if(pos==contarNos()){
                        inserirNoFim(novoNo);
                    }else{
                        System.out.println("Posição inválida!");
                    }
                }
            }
        }        
    }
    
}
