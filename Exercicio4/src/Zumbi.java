public class Zumbi {

    double vida;
    String nome;

    double mostraVida(){
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        if(vida < quantia) {
            System.out.println("Nao consegue ne");
        }
        else {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
        }
    }
}
