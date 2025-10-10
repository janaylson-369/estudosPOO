public class Helicoptero {
    // Atributos encapsulados
    private boolean ligado;
    private int altitude;
    private int capacidade;
    private int pessoas;

    // Construtor
    public Helicoptero(int capacidade) {
        this.capacidade = capacidade;
        this.ligado = false;
        this.altitude = 0;
        this.pessoas = 0;
    }

    // Métodos de ação
    public boolean entra() {
        if (this.pessoas < this.capacidade) {
            this.pessoas++;
            return true;
        }
        return false;
    }

    public boolean sai() {
        if (this.pessoas > 0) {
            this.pessoas--;
            return true;
        }
        return false;
    }

    public boolean ligar() {
        if (!this.ligado) {
            this.ligado = true;
            return true;
        }
        return false;
    }

    public boolean decolar(int altitudeDestino) {
        if (this.ligado && this.altitude == 0 && altitudeDestino > 0) {
            this.altitude = altitudeDestino;
            return true;
        }
        return false;
    }

    public boolean aterrissar() {
        if (this.ligado && this.altitude > 0) {
            this.altitude = 0;
            return true;
        }
        return false;
    }

    public boolean desligar() {
        if (this.ligado && this.altitude == 0) {
            this.ligado = false;
            return true;
        }
        return false;
    }

    // Getters e Setters
    public boolean isLigado() { return ligado; }
    public void setLigado(boolean ligado) { this.ligado = ligado; }

    public int getAltitude() { return altitude; }
    public void setAltitude(int altitude) { this.altitude = altitude; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public int getPessoas() { return pessoas; }
    public void setPessoas(int pessoas) { this.pessoas = pessoas; }

    // toString
    @Override
    public String toString() {
        return "Helicoptero { ligado=" + ligado +
                ", altitude=" + altitude +
                ", capacidade=" + capacidade +
                ", pessoas=" + pessoas + " }";
    }
}