package OOComposicao;

public class Motor {
    
    boolean ligado = false;
    double fatorInjecao = 1; //alusao a entrada de combustivel

    int giros(){
        if(!ligado){
            return 0;
        } else{
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}