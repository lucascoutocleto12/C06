public class Zumbi {

    String nome;
    double energia = 50;
    boolean saciado = true;

    void comer(double pontos) {
        if (saciado) {
            System.out.println("Já estou alimentado");
        } else {
            System.out.println("Achei comida");
            this.energia += pontos;
            System.out.println("Comi: " + pontos + " pontos de energia");
            System.out.println("Estou com: " + this.energia + " pontos de energia");
            if (this.energia >= 100)
                saciado = true;
        }
    }

    void sofrerDano(double pontos) {
        this.energia -= pontos;
        if (this.energia < 100)
            saciado = false;
    }
}
