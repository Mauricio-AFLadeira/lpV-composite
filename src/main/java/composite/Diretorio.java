package composite;

import java.util.ArrayList;
import java.util.List;

public class Diretorio extends Componente{
    
    private List<Componente> componentes;

    public Diretorio(String descricao) {
        super(descricao);
        this.componentes = new ArrayList<Componente>();
    }

    public void addComponente(Componente Componente) {
        this.componentes.add(Componente);
    }

    public String getComponente() {
        String saida = "";
        saida = "Diretório: " + this.getDescricao() + "\n";
        for (Componente componente : componentes) {
            saida += componente.getComponente();
        }
        return saida;
    }
}
