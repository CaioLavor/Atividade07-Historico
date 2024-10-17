import java.text.SimpleDateFormat;
public class Historico {
    Pagina topo;
    int tamanho;

    public Historico(){
        this.topo = null;
        this.tamanho = 0;
    }

    public void push(String URL, String titulo){
        Pagina e = new Pagina(URL, titulo);
        e.proximo = topo;
        topo = e;
        tamanho++;
    }
    public String pop(){
        if(isEmpty()){
            System.out.println("Não há páginas no histórico.");
        }
        Pagina e = topo;
        String URL = e.URL;
        topo = topo.proximo;
        tamanho--;
        return URL;        
    }

    public void size(){
        System.out.println("Há "+tamanho+" páginas no histórico.");
    }

    private boolean isEmpty(){
        if(tamanho == 0){
        return true;
    } else {
        return false;
    }
    }

    public void imprimirPilha(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        if(isEmpty()){
            System.out.println("Não há páginas no histórico.");
            return;
        }
        Pagina atual = topo;
        while(atual != null){
            System.out.print(atual.URL +" | "+atual.titulo+" | "+sdf.format(atual.datahora.getTime()));
            if(atual.proximo != null){
                System.out.println(" ");
            }
            atual = atual.proximo;
        }
        System.out.println();
    }
    public void top() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        if (isEmpty()) {
        System.out.println("Não há páginas no histórico.");
        return;
        }else{
        System.out.print(topo.URL +" | "+topo.titulo+" | "+sdf.format(topo.datahora.getTime()));
        System.out.println();
        }
    }
}
