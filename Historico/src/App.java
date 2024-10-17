public class App {
    public static void main(String[] args) throws Exception {
        Historico pilha = new Historico();

        pilha.push("arthur.com", "Site do Arthur");
        pilha.push("baltazar.com", "Site do Baltazar");
        pilha.push("bruno.com", "Site do Bruno");
        pilha.push("jorge.com", "Site do Jorge");
        pilha.push("fernando.com", "Site do Fernando");
        
        pilha.size();
        pilha.imprimirPilha();
        
        pilha.pop();

        pilha.imprimirPilha();
        pilha.size();

        pilha.top();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();

        pilha.imprimirPilha();
        pilha.size();

    }
}
