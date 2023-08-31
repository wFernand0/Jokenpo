package domain;

public class Lagarto implements Algoritmo {

    @Override
    public void executar(TipoAlgoritmo tipo) {
        // TODO Auto-generated method stub
        
        switch(tipo){
            case PAPEL:
                System.out.println("Ganhou! Lagarto come papel");
                break;
            case PEDRA:
                System.out.println("Perdeu! Pedra esmaga lagarto");
                break;
            case SPOCK:
                System.out.println("Ganhou! Lagarto envenena Spock");
                break;
            case TESOURA:
                System.out.println("Perdeu! Tesoura decapita Lagarto");
            default:
                System.out.println("Empatou!");
        }
    }
    
}
