public class Zumbi {
    double vida;
    String nome;

    double mostraVida() {
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia) {
        if (quantia <= 0) {
            return false;
        }
        if (vida >= quantia) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;

        } else {
            return false;
        }
    }
}