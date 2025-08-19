
public class Main {

    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "...";
        zumbi1.vida = 100;
        zumbi2.nome = "...";
        zumbi2.vida = 200;

        zumbi1.seAlimentar();
        zumbi2.seAlimentar();
    }

}