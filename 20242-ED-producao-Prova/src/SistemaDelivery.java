
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Davi
 */
public class SistemaDelivery {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<ItemPedido> listaItensDisponiveis;
        listaItensDisponiveis = new ArrayList<>();
        
        ItemPedido item1 = new ItemPedido(1, "pizza", 2, 40);
        ItemPedido item2 = new ItemPedido(2, "refri", 1, 10);
        ItemPedido item3 = new ItemPedido(3, "suco", 1, 5);
        
        listaItensDisponiveis.add(item1);
        listaItensDisponiveis.add(item2);
        listaItensDisponiveis.add(item3);
        
        System.out.println("Id: ");
        int idPedido = entrada.nextInt();
        
        System.out.println("Descrição: ");
        entrada.nextLine();
        String descricaoPedido = entrada.nextLine();
        
        System.out.println("Tx entrega: ");
        double txEntregaPedido = entrada.nextDouble();
        
        System.out.println("Desconto: ");
        double descontoPedido = entrada.nextDouble();
        
        Pedido p1 = new Pedido(idPedido, descricaoPedido, txEntregaPedido, descontoPedido);
        
        //adicionar item por id
        int opcao=-1;
        do {    
            System.out.println("==Menu==");
            System.out.println("1 - Adicionar");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Informe o id do item: ");
                    int idItem = entrada.nextInt();
                    p1.adicionarItemPorId(idItem, listaItensDisponiveis);                    
                    break;
                case 0:
                    System.out.println("Obrigado!");
                    break;                
            }
        } while (opcao!=0);

        System.out.println("Valor total: "+p1.valorTotal());
        
    }   
    
}
