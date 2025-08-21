public class Main{

    public static void main(String args[]){
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();

        personagem1.vida = 90;
        personagem2.vida = 85;

        Arma arma1 = new Arma();
        Arma arma2 = new Arma();

        arma1.descricao = "AK47";
        arma2.descricao = "DesertEagle";

        arma1.resistencia = 100;
        arma2.resistencia = 90;

        personagem1.arma = arma1;
        personagem2.arma = arma2;

        System.out.println("Vida do Mario: " + personagem1.vida);

        personagem1.tomaDano();

        System.out.println("Vida do Mario apos dano: " + personagem1.vida);

        System.out.println("Info da Arma do Luigi");
        personagem2.arma.mostrarInfo();
        personagem2.usarArma();
        System.out.println("Usou a Arma");
        System.out.println("Nova Info");
        personagem2.arma.mostrarInfo();
    }
}