/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Davi
 */
public class ItemPedido {
    
    int id;
    String nome;
    int qtd;
    double vUnitario;
    double vTotal;

    public ItemPedido(int id, String nome, int qtd, double vUnitario) {
        this.id = id;
        this.nome = nome;
        this.qtd = qtd;
        this.vUnitario = vUnitario;
        this.vTotal = this.qtd * this.vUnitario;
    }
    
    
            
    
}
