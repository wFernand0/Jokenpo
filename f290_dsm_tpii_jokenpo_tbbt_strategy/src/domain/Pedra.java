package domain;

public class Pedra implements Algoritmo {

    @Override
    public void executar(TipoAlgoritmo tipo) {
        // TODO Auto-generated method stub
        
        switch(tipo){
            case PAPEL:
                System.out.println("Perdeu! Papel embrulha pedra");
                break;
            case TESOURA:
                System.out.println("Ganhou! Pedra quebra Tesoura");
                break;
            case SPOCK:
                System.out.println("Perdeu! Spock vaporiza pedra");
                break;
            case LAGARTO:
                System.out.println("Ganhou! Pedra esmaga Lagarto");
            default:
                System.out.println("Empatou!");
        }
    }
    
}
