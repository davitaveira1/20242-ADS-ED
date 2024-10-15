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
        v.qtdElementosLista();
        if(v.verificarSeAlunoExiste(a3)){
            System.out.println("Aluno existe!");
        }else{
            System.out.println("Aluno não existe!");
        }
    }

}
