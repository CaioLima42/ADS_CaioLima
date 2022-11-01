package templatemethod.relatorio.intro;

import org.junit.jupiter.api.Test;

class GeradorRelatorioVendasMensaisTest {

    @Test
    void GeradorRelatorioVendasMensais() {
        
        GeradorRelatorioVendasMensais gerador = new GeradorRelatorioVendasMensais();
        
        String pagina = gerador.criaPagina(2022, 10);
        
        System.out.println(pagina);
    }

}
