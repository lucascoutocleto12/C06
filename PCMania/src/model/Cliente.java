package model;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] compras;
    private int contador;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.compras = new Computador[100];
        this.contador = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean addCompra(Computador c) {
        if (contador < compras.length) {
            compras[contador++] = c;
            return true;
        }
        return false;
    }

    public Computador[] getCompras() {
        Computador[] res = new Computador[contador];
        for (int i = 0; i < contador; i++) {
            res[i] = compras[i];
        }
        return res;
    }

    public int totalCompra() {
        int total = 0;
        for (int i = 0; i < contador; i++) {
            total += compras[i].getPreco();
        }
        return total;
    }

    public int getNumeroCompras() {
        return contador;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(nome).append("\n");
        sb.append("CPF: ").append(cpf).append("\n");
        sb.append("Quantidade de PCs adquiridos: ").append(contador).append("\n");
        return sb.toString();
    }
}
