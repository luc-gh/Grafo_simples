public class Aresta<TipoGenerico> {
    private Integer peso;
    private Vertice<TipoGenerico> origem;
    private Vertice<TipoGenerico> destino;
    
    public Aresta(Integer peso, Vertice<TipoGenerico> inicio, Vertice<TipoGenerico> fim){
        this.peso = peso;
        this.origem = inicio;
        this.destino = fim;
    }
    
    //Getters e setters
    public Integer getPeso() {
        return peso;
    }
    
    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    public Vertice<TipoGenerico> getOrigem() {
        return origem;
    }
    
    public void setOrigem(Vertice<TipoGenerico> origem) {
        this.origem = origem;
    }
    
    public Vertice<TipoGenerico> getDestino() {
        return destino;
    }
    
    public void setDestino(Vertice<TipoGenerico> destino) {
        this.destino = destino;
    }
}