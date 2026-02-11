import java.util.Scanner;

public class Jogador {

    private String nome;
    private Tabuleiro meuJogo;
    private Tabuleiro jogoDoAdversario;

    public Jogador(String nome ) {
        this.nome = nome;
        this.meuJogo = new Tabuleiro();
        this.jogoDoAdversario = new Tabuleiro();
    }

    public String getNome() {
        return nome;
    }

    public void posicionarArmas(Scanner sc) {
        System.out.println("\n" + nome + " - Posicione suas armas");

        colocar(sc, 's', 1);
        colocar(sc, 'c', 1);
        colocar(sc, 'p', 1);
    }

    private void colocar(Scanner sc, char tipo, int qtd) {
        for (int i = 0; i < qtd; i++) {
            boolean ok = false;
            while (!ok) {
                System.out.print("Posição para " + tipo + ": ");
                String pos = sc.next().toUpperCase();
                int l = pos.charAt(0) - 'A';
                int c = Integer.parseInt(pos.substring(1)) - 1;

                ok = meuJogo.posicionar(l, c, tipo);
                if (!ok) System.out.println("Posição inválida!");
            }
        }
    }

    public void atirar(Jogador adversario, Scanner sc) {
        System.out.println("\nVez de " + nome);
        jogoDoAdversario.mostrar(false);

        for (int i = 0; i < 2; i++) {
            System.out.print("Tiro: ");
            String pos = sc.next().toUpperCase();

            int l = pos.charAt(0) - 'A';
            int c = Integer.parseInt(pos.substring(1)) - 1;

            boolean acerto = adversario.meuJogo.receberTiro(l, c);
            jogoDoAdversario.marcarTiro(l, c, acerto);

            System.out.println(acerto ? "Acertou!" : "Água!");
        }
    }

    public boolean perdeu() {
        return !meuJogo.temArmas();
    }
}
