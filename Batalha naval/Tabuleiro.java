public class Tabuleiro {

    private char[][] matriz;

    public Tabuleiro() {
        matriz = new char[8][8];
        inicializar();
    }

    private void inicializar() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = '~';
            }
        }
    }

    public void mostrar(boolean esconderArmas) {
        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i = 0; i < 8; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < 8; j++) {
                char v = matriz[i][j];
                if (esconderArmas && (v == 's' || v == 'c' || v == 'p'))
                    System.out.print("~ ");
                else
                    System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public boolean posicionar(int l, int c, char tipo) {
        if (matriz[l][c] == '~') {
            matriz[l][c] = tipo;
            return true;
        }
        return false;
    }

    public boolean receberTiro(int l, int c) {
        if (matriz[l][c] != '~' && matriz[l][c] != 'X') {
            matriz[l][c] = 'X';
            return true;
        }
        return false;
    }

    public void marcarTiro(int l, int c, boolean acerto) {
        matriz[l][c] = acerto ? 'X' : 'O';
    }

    public boolean temArmas() {
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if (matriz[i][j] == 's' || matriz[i][j] == 'c' || matriz[i][j] == 'p')
                    return true;
        return false;
    }
}
