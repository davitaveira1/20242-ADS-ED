import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int opcao = 0;
        Scanner entrada = new Scanner(System.in);

        ListaSimples lista = new ListaSimples();

        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);

        do{
            System.out.println("1 - Adicionar no início da lista: ");
            System.out.println("2 - Adicionar no final da lista: ");
            System.out.println("3 - Exibir lista");
            System.out.println("4 - Somar valores\n");
            System.out.print("Informe a opção: ");
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Informe o valor do nó: ");
                    int valor = entrada.nextInt();
                    No n = new No(valor);
                    lista.adicionarNoInicio(n);
                    break;
                case 2:

                case 3:

                case 4:

                default:
            }

        }while(opcao!=10);

    }

}
