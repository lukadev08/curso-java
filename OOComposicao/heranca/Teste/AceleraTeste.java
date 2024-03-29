package OOComposicao.heranca.Teste;

import OOComposicao.heranca.DesafioHeranca.Carro;
import OOComposicao.heranca.DesafioHeranca.Lamborghini;
import OOComposicao.heranca.DesafioHeranca.Twingo;

public class AceleraTeste {
    public static void main(String[] args) {
        
        Carro c1 = new Twingo(); //pode usar a classe generice Carro

        c1.acelerar();
        System.out.println(c1);
       
        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);
        
        System.out.println();

        Lamborghini c2 = new Lamborghini(400); // ou a classe especifica por heranca
        c2.ligarTurbo();
        c2.desligarAr();

        c2.acelerar();
        System.out.println(c2);
       
        c2.acelerar();
        System.out.println(c2);
       
        c2.acelerar();
        c2.frear();
        System.out.println(c2);
    }
}
