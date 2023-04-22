package composite;

public class Pasta {
    private Componente conteudo;

    public void setConteudo(Componente conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        if (this.conteudo == null) {
            throw new NullPointerException("Pasta sem conteudo");
        }
        return this.conteudo.getComponente();
    }
}
