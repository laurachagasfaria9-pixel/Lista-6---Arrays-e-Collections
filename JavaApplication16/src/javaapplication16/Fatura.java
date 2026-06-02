/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;


import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> itens;

    public Fatura() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for(Item item : itens) {
            total += item.calcularTotal();
        }

        return total;
    }

    public void exibirFatura() {

        if(itens.size() == 0) {
            System.out.println("Nenhuma compra realizada.");
            return;
        }

        System.out.println("\n===== FATURA =====");

        for(Item item : itens) {
            System.out.println(
                item.getProduto().getNome() +
                " | Quantidade: " + item.getQuantidade() +
                " | Total: R$" + item.calcularTotal()
            );
        }

        System.out.println("Valor Final: R$" + calcularTotal());
    }
} 
    }
}
