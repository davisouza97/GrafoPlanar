
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Grafo grafo = new Grafo();
        grafo.addVertice("A");
        grafo.addVertice("B");
        grafo.addVertice("C");
        grafo.addVertice("D");
        grafo.addVertice("E");
        grafo.addVertice("F");
        
        grafo.addAresta("A", "D");
        grafo.addAresta("A", "E");
        grafo.addAresta("A", "F");
        grafo.addAresta("B", "D");
        grafo.addAresta("B", "E");
        grafo.addAresta("B", "F");
        grafo.addAresta("C", "D");
        grafo.addAresta("C", "E");
        grafo.addAresta("C", "F");
        
        Imprimir i = new Imprimir();
        
        i.imprimir(grafo);
    }

}
