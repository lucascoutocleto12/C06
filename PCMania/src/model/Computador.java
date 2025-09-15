package model;

public class Computador {
    private String marca;
    private int preco;
    private Hardware processador;
    private Hardware memoria;
    private Hardware hd;
    private SistemaOperacional so;
    private Hardware acessorio;

    public Computador(String marca, int preco, Hardware processador, Hardware memoria, Hardware hd, SistemaOperacional so, Hardware acessorio) {
        this.marca = marca;
        this.preco = preco;
        this.processador = processador;
        this.memoria = memoria;
        this.hd = hd;
        this.so = so;
        this.acessorio = acessorio;
    }

    public int getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(marca).append("\n");
        sb.append("Preço: R$").append(preco).append("\n");
        sb.append("Processador: ").append(processador.getNome()).append(" - ").append(processador.getCapacidade()).append("\n");
        sb.append("Memória: ").append(memoria.getNome()).append(" - ").append(memoria.getCapacidade()).append("\n");
        sb.append("HD: ").append(hd.getNome()).append(" - ").append(hd.getCapacidade()).append("\n");
        sb.append("Sistema Operacional: ").append(so.getNome()).append(" (").append(so.getTipo()).append(" bits)\n");
        sb.append("Acessório: ").append(acessorio.getNome()).append(" - ").append(acessorio.getCapacidade()).append("\n");
        return sb.toString();
    }
}
