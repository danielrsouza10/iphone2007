import Musica.ReprodutorDeMusica;
import Navegador.NavegadorInternet;
import Telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorDeMusica {

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica no reprodutor musical do Iphone");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada no reprodutor musical do Iphone");
    }

    @Override
    public void proximaMusica() {
        System.out.println("Tocando proxima no reprodutor musical do Iphone");
    }

    @Override
    public void ligarNumero(int numeroTelefone){
        System.out.println("Ligando para o numero: " + numeroTelefone + " aparelho telefonico do Iphone");
    }

    @Override
    public void acessarPagina(String site) {
        System.out.println("Acessando a pagina " + site + " no navegador de internet do Iphone");
    }
  
}
