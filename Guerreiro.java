package exercicios;
/*
 * Desenvolva o jogo Guerreiros da POO. Neste jogo os personagens são guerreiros, que possuem as seguintes características: código, nome e energia (0 a 5).
 *  Os guerreiros só sabem fazer duas coisas: lutar com outro guerreiro e se alimentar.
 * Construa uma classe em Java chamada Guerreiro com as seguintes especificações:
a) os atributos são privativos.

b) no construtor, o código e o nome são carregados por parâmetro e a energia é inicializada com o valor 5.

c) há um método de acesso para a energia.

d) há um método chamado incremento, que aumenta a energia em 1 ponto, mas esta não pode passar do máximo (5).

e) há um método chamado decremento que reduz em 1 ponto a energia do Guerreiro. Caso esta chegue a zero, uma mensagem será emitida dizendo que o mesmo está sem energia.

f) o método alimentar-se deve aumentar a energia em 1 ponto (use o método incremento do item d).

g) o método atacar consiste na geração e retorno de um número aleatório entre 0 e 1 (0 – sem sucesso, 1- com sucesso) .
 O método atacar só deve ser chamado dentro do método lutar do item h.

h) o método lutar recebe por parâmetro o guerreiro oponente e deve reduzir a energia de um guerreiro a cada ataque com sucesso de seu oponente 
(use o método decremento do item e). O método lutar deve chamar o método atacar de cada guerreiro e exibir o vencedor quando a energia de um dos guerreiros chegar a zero.

i) o método toString deve mostrar o “estado” do guerreiro.

 */
import java.util.Random;

public class Guerreiro {
    private int codigo, energia;
    private String nome;
    
    public Guerreiro (int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.energia = 5;
    }
    public int getcodigo (){
        return codigo;
    }
    public String getnome (){
        return nome;
    }

    public int getenergia (){
        return energia;
    }
    
    public int incremento(){

        if (energia <= 5){
            energia++;
        }
        else{
            System.out.println(" energia cheia");
        }
        return incremento();
    }

    public int dencremento(){
        energia--;
        if (energia == 0){
            System.out.println(" está sem energia.");
        }
        else{
            System.out.println(" está cheia");
        }
        //return energia;
        return dencremento();
    }
    //F
    public int alimentarse(){
        return incremento();
    }

    //G
    public int atacar(){
        Random gerador = new Random();
        return gerador.nextInt(2);
    }
    // H
    public int lutar (Guerreiro oponente){
        while(true){
            if (atacar() == 1){
                oponente.dencremento();
            }
            else{
                System.out.println(" oponete atacou!");
            }
            

            if (oponente == 0) {

            } 
        }
    }



}
