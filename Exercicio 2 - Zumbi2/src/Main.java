//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 100;
        zumbi2.vida = 50;

        zumbi1.mostraVida();
        zumbi2.mostraVida();

        zumbi2.transfereVida(zumbi1, 20);
        zumbi1.transfereVida(zumbi2, 45);

        zumbi1.transfereVida(zumbi1, 25);    //permitido

        System.out.println(zumbi1.mostraVida());
        System.out.println(zumbi2.mostraVida());

    }
}