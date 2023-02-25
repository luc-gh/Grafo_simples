import java.util.ArrayList;

public class Vertice<TipoGenerico> {
    private TipoGenerico dado;  //valor que pertence/está contido no vértice
    private ArrayList<Aresta<TipoGenerico>> arestasEntrada;  //array com arestas de entrada no vétice
    private ArrayList<Aresta<TipoGenerico>> arestasSaida;    //array com arestas de saída no vértice
    //Perceba que o tipo de dado do ArrayList é Aresta<Tipo>, pois a lista terá diversas instãncias da
    // classe Aresta como valores, e esta tem um tipo 'TipoGenerico'. Dados Generics no Java são tratados assim.
    
    public Vertice(TipoGenerico valor){  //construtor da classe (inicializa os vértices)
        this.dado = valor;  //na criação do vértice, deve seu passado seu valor/dado correspondente
        this.arestasEntrada = new ArrayList<Aresta<TipoGenerico>>();  //nº de arestas de entrada inicial é zero
        this.arestasSaida = new ArrayList<Aresta<TipoGenerico>>();    //nº de arestas de saída inicial é zero
    }
    
    public void AdicionarArestaEntrada(Aresta<TipoGenerico> aresta){
        this.arestasEntrada.add(aresta);
    }
    
    public void AdicionarArestaSaida(Aresta<TipoGenerico> aresta){
        this.arestasSaida.add(aresta);
    }
    
    //Getters e setters
    public TipoGenerico getDado(){
        return dado;
    }
    
    public void setDado(TipoGenerico dado){
        this.dado = dado;
    }
    
    public ArrayList<Aresta<TipoGenerico>> getArestasEntrada(){
        return arestasEntrada;
    }
    
    public void setArestasEntrada(ArrayList<Aresta<TipoGenerico>> arestasEntrada){
        this.arestasEntrada = arestasEntrada;
    }
    
    public ArrayList<Aresta<TipoGenerico>> getArestasSaida(){
        return arestasSaida;
    }
    
    public void setArestasSaida(ArrayList<Aresta<TipoGenerico>> arestasSaida){
        this.arestasSaida = arestasSaida;
    }
}