import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do Jogador 1: ");
        Jogador j1 = new Jogador(sc.nextLine());

        System.out.print("Nome do Jogador 2: ");
        Jogador j2 = new Jogador(sc.nextLine());

        j1.posicionarArmas(sc);
        j2.posicionarArmas(sc);

        while (true) {
            j1.atirar(j2, sc);
            if (j2.perdeu()) {
                System.out.println("\n" + j1.getNome() + " venceu!");
                break;
            }

            j2.atirar(j1, sc);
            if (j1.perdeu()) {
                System.out.println("\n" + j2.getNome() + " venceu!");
                break;
            }
        }

        sc.close();
    }
}
