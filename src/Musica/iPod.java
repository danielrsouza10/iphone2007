package Musica;

public class iPod implements ReprodutorDeMusica {

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica no iPod");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica no iPod");
    }

    @Override
    public void proximaMusica() {
      System.out.println("Tocando proxima musica no iPod");
    }
    
}
