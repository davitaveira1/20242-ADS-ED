public class ListaSimples {

    No primeiro,ultimo;

    public ListaSimples() {
        primeiro=null;
        ultimo=null;
    }

    void adicionarNoInicio(No novoNo){
        if(primeiro==null){
            primeiro=novoNo;
            ultimo=novoNo;
        }else{
            novoNo.prox = primeiro;
            primeiro = novoNo;
        }
    }

    void adicionarNoFim(No novoNo){
        if(primeiro==null){
            primeiro=novoNo;
            ultimo=novoNo;
        }else{
            ultimo.prox=novoNo;
            ultimo=novoNo;
        }
    }

    void imprimir(){
        No aux = primeiro;
        while(aux!=null){
            System.out.println(aux.valor);
            aux = aux.prox;
        }
    }
}
