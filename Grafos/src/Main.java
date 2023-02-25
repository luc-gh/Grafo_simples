import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        
        grafo.adicionarVertice("João");
        grafo.adicionarVertice("Maria");
        grafo.adicionarVertice("Cláudia");
        grafo.adicionarVertice("Cléber");
        grafo.adicionarVertice("Sofia");
        
        grafo.adicionarAresta(2, "João", "Maria");
        grafo.adicionarAresta(3, "Maria", "Cléber");
        grafo.adicionarAresta(1, "Cléber", "Cláudia");
        grafo.adicionarAresta(1, "João", "Cláudia");
        grafo.adicionarAresta(2, "Sofia", "Maria");
        grafo.adicionarAresta(3, "Sofia", "João");
        
        grafo.BuscaEmLargura();
    }
}