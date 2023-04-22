package composite;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


class PastaTest {
    @Test
    void deveRetornarPeriodoPasta() {
        Diretorio Diretorio1 = new Diretorio("Recursos Humano");

        Diretorio Diretorio2 = new Diretorio("Prog Inteira");
        Arquivo Arquivo21 = new Arquivo("Problema da mochila - simplex", "Problema da mochila ");
        Diretorio2.addComponente(Arquivo21);

        Diretorio Diretorio3 = new Diretorio("Lp V");
        Arquivo Arquivo31 = new Arquivo(" exemplo de carro para padrao builder", "Builder ");
        Arquivo Arquivo32 = new Arquivo(" exemplo de administrador para padrao singleton", "Singleton ");
        Diretorio3.addComponente(Arquivo31);
        Diretorio3.addComponente(Arquivo32);

        Diretorio periodo = new Diretorio("7 periodo - BSI");
        periodo.addComponente(Diretorio1);
        periodo.addComponente(Diretorio2);
        periodo.addComponente(Diretorio3);

        Pasta Pasta = new Pasta();
        Pasta.setConteudo(periodo);

        assertEquals("Diretório: 7 periodo - BSI\n" +
                "Diretório: Recursos Humano\n" +
                "Diretório: Prog Inteira\n" +
                "Diretório (nome): Problema da mochila descricao:Problema da mochila - simplex\n" +
                "Diretório: Lp V\n" +
                "Diretório (nome): Builder descricao: exemplo de carro para padrao builder\n" +
                "Diretório (nome): Singleton descricao: exemplo de administrador para padrao singleton\n", Pasta.getConteudo());
    }

    @Test
    void deveRetornarExecacaoPastaSemPeriodo() {
        try {
            Pasta pasta = new Pasta();
            pasta.getConteudo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Pasta sem conteudo", e.getMessage());
        }
    }
}