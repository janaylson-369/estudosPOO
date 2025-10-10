public class Programa {
    public static void main(String[] args) {
        // Criar helicópteros
        Helicoptero h1 = new Helicoptero(4);
        Helicoptero h2 = new Helicoptero(6);

        System.out.println("Estado inicial:");
        System.out.println(h1);
        System.out.println(h2);
        System.out.println("--------------");

        // Entrar pessoas
        h1.entra();
        h1.entra();
        h1.entra();

        h2.entra();
        h2.entra();

        System.out.println("Após embarque:");
        System.out.println(h1);
        System.out.println(h2);
        System.out.println("--------------");

        // Ligar
        h1.ligar();
        h2.ligar();

        // Decolar
        h1.decolar(1200);
        h2.decolar(800);

        System.out.println("Após decolagem:");
        System.out.println(h1);
        System.out.println(h2);
        System.out.println("--------------");

        // Aterrissar
        h1.aterrissar();
        h2.aterrissar();

        // Desligar
        h1.desligar();
        h2.desligar();

        // Sair pessoas
        h1.sai();
        h1.sai();

        h2.sai();

        System.out.println("Estados finais:");
        System.out.println(h1);
        System.out.println(h2);
    }
}