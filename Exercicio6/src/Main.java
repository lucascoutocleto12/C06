public class Main{
    public static void main(String args[]){

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "do Hamilton";
        kart2.nome = "do Max Verstapen";

        kart1.motor.cilindradas = "150";
        kart1.motor.velocidadeMaxima = 100f;

        kart2.motor.cilindradas = "50";
        kart2.motor.velocidadeMaxima = 90f;

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto1.nome = "da Ferrari";
        piloto2.nome = "da Mercedes";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        kart1.fazerDrift();
        kart1.motor.mostraInfo();

        kart2.soltarTurbo();
        kart2.motor.mostraInfo();
    }
}