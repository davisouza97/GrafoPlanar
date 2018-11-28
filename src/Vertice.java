
import java.util.Objects;

public class Vertice {

    String nome;

    public Vertice() {
    }

    public Vertice(String nome) {
        this.nome = nome;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj instanceof String) {
            if (this.nome.equalsIgnoreCase((String)obj)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nome);
        return hash;
    }

}
