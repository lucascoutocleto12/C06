/* Voce e seus amigos querem criar um software para modelar zumbis.
* crie uma classe que representa um zumbi. O que um zumbi sabe sobre
* si? E o que ele sabe fazer?
*
* Depois crie uma classe Principal (App/Main) que use o zumbi e invoque
* suas acoes.
*
* As acoes podem ser mostradas via System.out.println();*/

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Zumbi z = new Zumbi();
        z.nome = "Joao";

        z.comer(30);
        z.sofrerDano(40);
        z.comer(30);
        System.out.println(z.saciado);


    }

}