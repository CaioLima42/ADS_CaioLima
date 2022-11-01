package templatemethod.relatorio.rafatorado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeradorRelatorioVendasAnuaisTest {

    @Test
    void deveGerarRelatorioVendasAnuaisPeloTemplate() {
        GeradorRelatorioTemplate template = new GeradorRelatorioVendasAnuais(2022);
        
        String pagina = template.criaPagina();
        
        System.out.println(pagina);
    }
}
