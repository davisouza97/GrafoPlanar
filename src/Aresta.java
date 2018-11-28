
public class Aresta {

    Vertice a;
    Vertice b;

    public Aresta() {
    }

    public Aresta(Vertice a, Vertice b) {
        this.a = a;
        this.b = b;
    }

    String criaStringOrientado() {
        String x = a.nome + "--" + b.nome + ";";
        return x;

    }

}
