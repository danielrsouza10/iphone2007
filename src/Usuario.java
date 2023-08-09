import Musica.ReprodutorDeMusica;
import Musica.iPod;
import Navegador.NavegadorInternet;
import Navegador.Safari;
import Telefone.AparelhoTelefonico;
import Telefone.Celular;

public class Usuario {
    public static void main(String[] args) throws Exception {
        Safari navegador = new Safari();
        Celular celular = new Celular();
        iPod ipod = new iPod();
        Iphone iphone = new Iphone();

        navegador.acessarPagina("UOL");
        ipod.tocarMusica();
        ipod.pausarMusica();
        celular.ligarNumero(98745691);

        iphone.acessarPagina("Globo.com");
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.ligarNumero(98787771);
        
    }

 
}
