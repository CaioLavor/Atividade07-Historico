import java.util.Calendar;

public class Pagina { 
    String titulo;
    String URL;
    Calendar datahora;
    Pagina proximo;

    public Pagina(String URL, String titulo){
        this.URL = URL;
        this.titulo = titulo;
        this.datahora = Calendar.getInstance();
        this.proximo = null;
    }
    
}
