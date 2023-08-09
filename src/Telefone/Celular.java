package Telefone;

public class Celular implements AparelhoTelefonico {

    @Override
    public void ligarNumero(int numeroTelefone) {
        System.out.println("Ligando para o numero " + numeroTelefone + " no celular");
    }
    
}
