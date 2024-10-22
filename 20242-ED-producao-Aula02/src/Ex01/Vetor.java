/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class Vetor {

    Aluno[] alunos = new Aluno[5];
    int qtdAlunosLista=0;

    void inserirFimLista(Aluno a) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = a;
                break;
            }
        }
    }
    
    void inserirFimListaV2(Aluno a){
        alunos[qtdAlunosLista]=a;
        qtdAlunosLista++;
    }

    void imprimirLista() {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.println("Nome: " + alunos[i].nome);
            }
        }
    }
    
    void imprimirV2(){
        if(qtdAlunosLista==0){
            System.out.println("Lista vazia!");
        }else{
            for(int i=0;i<qtdAlunosLista;i++){
                System.out.println(alunos[i].nome);
            }
        }
    }
    
    void qtdElementosLista(){
        System.out.println("Qtd Elementos da Lista: "+qtdAlunosLista);
    }
    
    boolean verificarSeAlunoExiste(Aluno a){
        for(int i=0;i<qtdAlunosLista;i++){
            if(alunos[i].equals(a)){
                return true;
            }            
        }
        return false;
    }
    
    boolean validarPosicao(int pos){
        return pos >=0 && pos < qtdAlunosLista;
    }
    
    Aluno buscarAlunoPorPosicao(int pos){
        if(validarPosicao(pos)){
            return alunos[pos];
        }else{
            throw new IllegalArgumentException("Posição inválida!!");
        }
    }
    
    boolean validarPosicaoAdicionarAluno(int pos){
        if(pos < 0 || pos > qtdAlunosLista || qtdAlunosLista >= alunos.length){
            return false;
        }else{
            return true;
        }
    }
    
    void adicionarAlunoPorPosicao(Aluno a, int pos){
        if(validarPosicaoAdicionarAluno(pos)){
            //continuidade do método
            //System.out.println("OK! Pronto para inserir");
            
            for(int i=qtdAlunosLista;i>pos;i--){
                alunos[i]=alunos[i-1];
            }
            alunos[pos]=a;
            qtdAlunosLista++;
            
        }else{           
            throw new IllegalArgumentException("Posição inválida!");
        }
    }
    
    boolean validarPosicaoRemoverAluno(int pos){
        if(pos >= 0 && pos < qtdAlunosLista - 1){
            return true;
        }else{
            return false;
        }
    }
    
    void removerAlunoPorPosicao(int pos){
        if(validarPosicaoRemoverAluno(pos)){
           //dar continuidade na remoção do aluno 
           //1-laço de repetição
           
           //2-anular última posição da iteração
           
        }else{
           throw new IllegalArgumentException("Posição inválida!"); 
        }
    }

    public static void main(String[] args) {
        Vetor v = new Vetor();
        Aluno a1 = new Aluno("Davi");
        Aluno a2 = new Aluno("Daniel");
        Aluno a3 = new Aluno("Lucas");
        //v.inserirFimLista(a);
        //v.imprimirLista();
        v.inserirFimListaV2(a1);
        v.inserirFimListaV2(a2);
        
        v.imprimirV2();
        /*
        v.qtdElementosLista();
        if(v.verificarSeAlunoExiste(a3)){
            System.out.println("Aluno existe!");
        }else{
            System.out.println("Aluno não existe!");
        }
        */
        System.out.println("======");
        /*
        try {
           System.out.println(v.buscarAlunoPorPosicao(-1).nome); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        */
        
        v.adicionarAlunoPorPosicao(a3, 1);
        v.imprimirV2();
        
    }

}
