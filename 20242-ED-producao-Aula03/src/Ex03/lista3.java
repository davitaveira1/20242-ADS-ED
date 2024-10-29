/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex03;

import java.util.ArrayList;

/**
 *
 * @author Davi
 */
public class lista3 {
    
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        
        for(String fruta : frutas){
            System.out.println(fruta);
        }
    }
    
}
