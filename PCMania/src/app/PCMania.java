package app;

import java.util.Scanner;
import model.Hardware;
import model.SistemaOperacional;
import model.Computador;
import model.Cliente;
import service.ProcessarPedido;

public class PCMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua matrícula (apenas números):");
        int matricula;
        try {
            matricula = Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            System.out.println("Matrícula inválida. Encerrando.");
            sc.close();
            return;
        }

        int price1 = matricula;
        int price2 = matricula + 1234;
        int price3 = matricula + 5678;

        Hardware p1Proc = new Hardware("Processador Core i3", 2200);
        Hardware p1Mem = new Hardware("Memória RAM", 8);
        Hardware p1HD = new Hardware("HD", 500);
        SistemaOperacional so1 = new SistemaOperacional("macOS Sequoia", 64);
        Hardware acc1 = new Hardware("Pen-drive", 16);
        Computador promo1 = new Computador("Apple", price1, p1Proc, p1Mem, p1HD, so1, acc1);

        Hardware p2Proc = new Hardware("Processador Core i5", 3370);
        Hardware p2Mem = new Hardware("Memória RAM", 16);
        Hardware p2HD = new Hardware("HD", 1000);
        SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
        Hardware acc2 = new Hardware("Pen-drive", 32);
        Computador promo2 = new Computador("Samsung", price2, p2Proc, p2Mem, p2HD, so2, acc2);

        Hardware p3Proc = new Hardware("Processador Core i7", 4500);
        Hardware p3Mem = new Hardware("Memória RAM", 32);
        Hardware p3HD = new Hardware("HD", 2000);
        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);
        Hardware acc3 = new Hardware("HD Externo", 1000);
        Computador promo3 = new Computador("Dell", price3, p3Proc, p3Mem, p3HD, so3, acc3);

        System.out.println("\n--- COMPUTADORES DISPONÍVEIS ---");
        System.out.println("Código 1:");
        System.out.println(promo1.toString());
        System.out.println("Código 2:");
        System.out.println(promo2.toString());
        System.out.println("Código 3:");
        System.out.println(promo3.toString());
        System.out.println("-------------------------------\n");

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite seu CPF:");
        String cpf = sc.nextLine();
        Cliente cliente = new Cliente(nome, cpf);

        while (true) {
            System.out.println("Escolha o código do PC que deseja comprar (1,2,3) ou 0 para encerrar:");
            String line = sc.nextLine();
            int code;
            try {
                code = Integer.parseInt(line.trim());
            } catch (Exception e) {
                System.out.println("Entrada inválida");
                continue;
            }
            if (code == 0) break;
            switch (code) {
                case 1:
                    cliente.addCompra(promo1);
                    System.out.println("Promoção 1 adicionada ao carrinho.");
                    break;
                case 2:
                    cliente.addCompra(promo2);
                    System.out.println("Promoção 2 adicionada ao carrinho.");
                    break;
                case 3:
                    cliente.addCompra(promo3);
                    System.out.println("Promoção 3 adicionada ao carrinho.");
                    break;
                default:
                    System.out.println("Código inválido.");
                    break;
            }
        }

        Computador[] compras = cliente.getCompras();
        System.out.println("\n----- RESUMO DA COMPRA -----");
        System.out.println(cliente.toString());
        for (int i = 0; i < compras.length; i++) {
            System.out.println("== PC " + (i + 1) + " ==");
            System.out.println(compras[i].toString());
        }
        System.out.println("Total da compra: R$" + cliente.totalCompra());
        ProcessarPedido.processar(compras);
        sc.close();
    }
}