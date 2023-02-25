import java.util.ArrayList;

public class Grafo<TipoGenerico> {  //classe Grafo: cria novo grafo
    private ArrayList<Vertice<TipoGenerico>> vertices;  //Vértices do Grafo
    private ArrayList<Aresta<TipoGenerico>> arestas;    //Arestas do Grafo
    
    public Grafo(){  //construtor da classe
        this.vertices = new ArrayList<Vertice<TipoGenerico>>();  //Lista de vertices vazia inicializada
        this.arestas = new ArrayList<Aresta<TipoGenerico>>();   //Lista de arestas vazia inicializada
    }
    
    public void adicionarVertice(TipoGenerico dado){  //Vértices simples
        Vertice<TipoGenerico> novoVertice = new Vertice<TipoGenerico>(dado);  //criação do vértice
        this.vertices.add(novoVertice);
    }
    
    public void adicionarAresta(Integer peso, TipoGenerico dadoOrigem, TipoGenerico dadoDestino){  //Arestas ponderadas
        Vertice<TipoGenerico> origem = this.buscaVertice(dadoOrigem);
        Vertice<TipoGenerico> destino = this.buscaVertice(dadoDestino);
        //É preciso buscar os vértices de origem e destino pelos dados porque não possuímos as suas referências
        
        Aresta<TipoGenerico> aresta = new Aresta<TipoGenerico>(peso, origem, destino);
        origem.AdicionarArestaSaida(aresta);     //adiciona aresta criada ao vértice de origem
        destino.AdicionarArestaEntrada(aresta);  //adiciona a mesma também ao vértice de destino
        this.arestas.add(aresta);                //adiciona a aresta ao Grafo
    }
    
    public Vertice<TipoGenerico> buscaVertice(TipoGenerico dado){
        Vertice<TipoGenerico> vertice = null;
        for(int i = 0; i < this.vertices.size(); i++){
            if(this.vertices.get(i).getDado().equals(dado)){
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }
    
    public void BuscaEmLargura(){  //passa por cada filho de um elemento para seguir adiante
        ArrayList<Vertice<TipoGenerico>> marcados = new ArrayList<>();  //elementos que já foram visitados
        ArrayList<Vertice<TipoGenerico>> fila = new ArrayList<>();  //elementos que não foram visitados
        Vertice<TipoGenerico> atual = this.vertices.get(4);  //busca começa a partir do QUARTO elemento adicionado
        //OBS: a escolha do quarto elemento é só um exemplo que resulta na impressão de todos os nomes
        
        marcados.add(atual);  //adiciona elemento atual na lista de marcados
        System.out.println(atual.getDado());  //imprime o valor de tal elemento
        fila.add(atual);  //adiciona-o à fila
        
        while(fila.size() > 0){
            Vertice<TipoGenerico> visitado = fila.get(0);  //pega o orimeiro vértice da fila
            for(int i = 0; i < visitado.getArestasSaida().size(); i++){  //percorre as saídas do vértice
                Vertice<TipoGenerico> proximo = visitado.getArestasSaida().get(i).getDestino();  //pega os próximos elementos
                if(!marcados.contains(proximo)){  //se o próximo não foi marcados (não foi impresso ainda)
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }
}
