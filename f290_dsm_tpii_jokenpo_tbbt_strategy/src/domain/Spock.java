package domain;

public class Spock implements Algoritmo {

    @Override
    public void executar(TipoAlgoritmo tipo) {
        // TODO Auto-generated method stub
        
        switch(tipo){
            case PAPEL:
                System.out.println("Perdeu! Papel refuta Spock");
                break;
            case PEDRA:
                System.out.println("Perdeu! Spock vaporiza pedra");
                break;
            case TESOURA:
                System.out.println("Perdeu! Spock esmaga tesoura");
                break;
            case LAGARTO:
                System.out.println("Perdeu! Lagarto envenena Spock");
            default:
                System.out.println("Empatou!");
        }
    }
    
}
