public class Televisor {
    //atributos Defina uma classe Televisor com os atributos: canal, volume e ligado.
    private int canal;
    private int vol;
    private boolean ligado;

    //construtor
    /*Inclua na classe um construtor, os métodos ligar, desligar, aumentarVolume, diminuirVolume, trocarCanal e o método toString() 
    para retornar a representação textual do objeto./*
     * 
     */
    public Televisor (int canal, int vol, boolean ligado){
        this.canal= canal;
        this.vol= vol;
        this.ligado= ligado;

    }
    public boolean ligar(){
        if (this.ligado == false){
            this.ligado = true;
            return true;
        }
        return false;

    }
    public boolean desligar(){
        if (!this.ligado){
            this.ligado = false;
            return false;
        }
        return true;
    }
    public int aumentarVolume (volmais){
        volmais++;
        if(){
            
        }
    }
}
    
