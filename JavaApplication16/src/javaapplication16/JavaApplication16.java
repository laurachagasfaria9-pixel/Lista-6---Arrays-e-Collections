package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto("Caneta", 1, 2.50);
        Produto p2 = new Produto("Caderno", 2, 15.00);
        Produto p3 = new Produto("Borracha", 3, 1.50);

        Produto[] produtos = {p1, p2, p3};

        Fatura fatura = new Fatura();

        int opcao;

        do {

            System.out.println("\n1 - Comprar");
            System.out.println("2 - Ver Fatura");
            System.out.println("3 - Encerrar");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("\nProdutos:");

                    for (Produto p : produtos) {
                        p.exibirProduto();
                    }

                    System.out.print("Código do produto: ");
                    int codigo = sc.nextInt();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();

                    for (Produto p : produtos) {

                        if (p.getCodigo() == codigo) {
                            Item item = new Item(p, quantidade);
                            fatura.adicionarItem(item);
                            System.out.println("Compra realizada!");
                        }
                    }

                    break;

                case 2:
                    fatura.exibirFatura();
                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);

        sc.close();
    }
}