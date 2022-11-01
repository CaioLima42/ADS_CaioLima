package templatemethod.relatorio.rafatorado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeradorRelatorioVendasMensaisTest {

    @Test
    void deveGerarRelatorioVendasMensaisPeloTemplate() {
        GeradorRelatorioTemplate template = new GeradorRelatorioVendasMensais(2022,10);
        
        String pagina = template.criaPagina();
        
        System.out.println(pagina);
    }

}
