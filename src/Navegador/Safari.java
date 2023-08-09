package Navegador;

public class Safari implements NavegadorInternet{

    @Override
    public void acessarPagina(String site) {
       System.out.println("Acessando pagina " + site + " no navegador Safari");
    }
    
}
