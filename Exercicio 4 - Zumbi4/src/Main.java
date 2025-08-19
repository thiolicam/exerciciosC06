public class Main {

    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 50;

        System.out.println("z1: " + z1.mostraVida());
        System.out.println("z2: " + z2.mostraVida());

        boolean tranferenciaRealizada = z1.transfereVida(z2, 30);
        System.out.println("Transferência de 30 z1 para z2: " + tranferenciaRealizada);

        tranferenciaRealizada = z2.transfereVida(z1, 100);
        System.out.println("Transferência de z2 para z1: " + tranferenciaRealizada);

        System.out.println("z1: " + z1.mostraVida());
        System.out.println("z2: " + z2.mostraVida());
    }
}