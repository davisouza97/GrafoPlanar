
import edu.ifet.grafos.graphview.GraphView;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Imprimir {

    public void imprimir(Grafo grafo) throws IOException {
        String g = "graph graphname {";
        String arquivo = "Grafo";
        for (Aresta v : grafo.arestas) {
            String a = v.criaStringOrientado();
            g = g + a;
        }
        g = g + "}";
        GraphView gv = new GraphView();
        //Lendo verticeOrigem String 
        gv.readString(g);
        //Imprimindo verticeOrigem grafo em texto
        System.out.println(gv.getDotSource());
        //Gerando uma imagem com verticeB nome out.png 
        File ImagemGrafo = new File(arquivo + ".png");
        gv.writeGraphToFile(ImagemGrafo);
        System.out.println(arquivo + ".png FOI GRAVADO");
    }
}
