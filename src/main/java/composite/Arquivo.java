package composite;

public class Arquivo extends Componente {
    private String nome;

    public Arquivo(String descricao, String nome) {
        super(descricao);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComponente() {
        return "Diretório (nome): " + this.nome + "descricao:"  + this.getDescricao() + "\n";
    }
}
