
import java.util.ArrayList;

public class Grafo {
    
    ArrayList<Vertice> vertices = new ArrayList<>();
    ArrayList<Aresta> arestas = new ArrayList<>();

    public Grafo() {
    }
    
    public void addAresta(String a,String b){
        Vertice va = new Vertice();
        Vertice vb = new Vertice();
        for (Vertice v1 : vertices) {
            if (v1.equals(a)) {
                va = v1;
                break;
            }
        }
        for (Vertice v2 : vertices) {
            if (v2.equals(b)) {
                vb = v2;
                break;
            }
        }
    this.arestas.add(new Aresta(va,vb));
    }
    
    public void addVertice(String nome){
    this.vertices.add(new Vertice(nome));
    }
    
}
