package model;

public class Hardware {
    private String nome;
    private int capacidade;

    public Hardware(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String toString() {
        return nome + " - " + capacidade;
    }
}
