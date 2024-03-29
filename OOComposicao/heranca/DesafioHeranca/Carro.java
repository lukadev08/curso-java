package OOComposicao.heranca.DesafioHeranca;

public class Carro {
    
    //parte do desafio
    final int VELOCIDADE_MAXIMA;
    int velAtual;
    private int delta = 5;

    //parte desafio
    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
 /* 
    Carro(){
        this.VELOCIDADE_MAXIMA = velAtual;
    }
*/

    public void acelerar(){
        if(velAtual + getDelta() > VELOCIDADE_MAXIMA){
            velAtual = VELOCIDADE_MAXIMA;
        } else{
            velAtual += getDelta(); //!!!!!
        }
    }

    public void frear(){ // nao pode gerar valor negativo
        if (velAtual >= 5) { // 5 - 5 = 0, nao pode ser 4 por ex pois se torna negativo
            velAtual -= 5;
        }else{
            velAtual -= 0;
        }
    }

    public String toString(){ //descreve no metodo main
        return "Velocidade atual e: " + velAtual + " km/h";
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    
}
