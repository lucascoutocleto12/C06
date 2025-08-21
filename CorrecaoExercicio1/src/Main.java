public class Main {
    public static void main(String[] args) {

        Zumbi zumbi = new Zumbi();
        zumbi.nome = "Jucelino";
        zumbi.vida = 100;

        Zumbi zumbi2 = new Zumbi();
        zumbi2.nome = "Creuza";

        zumbi.seAlimentar();
        zumbi.correr();

        zumbi2.correr();

    }
}
