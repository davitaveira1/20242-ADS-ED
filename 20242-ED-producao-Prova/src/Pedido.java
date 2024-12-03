
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Davi
 */
public class Pedido {
    
    int id;
    String descricao;
    ArrayList<ItemPedido> itens;
    double txEntrega;
    double desconto;

    public Pedido(int id, String descricao, double txEntrega, double desconto) {
        this.id = id;
        this.descricao = descricao;        
        this.txEntrega = txEntrega;
        this.desconto = desconto;
        this.itens = new ArrayList<>();
    }
    
    void adicionarItemPorId(int id, ArrayList<ItemPedido> listaItens){
        for(ItemPedido item : listaItens){
            if(id == item.id){
                itens.add(item);
                return;
            }            
        }
        System.out.println("Item não encontrado!");
    }
    
    double valorTotal(){
        double valorTotalPedido=0;
        for(ItemPedido itens : itens){
            valorTotalPedido = valorTotalPedido + itens.vTotal;
        }
        return valorTotalPedido+txEntrega-desconto;
    }
    
    
            
    
}
