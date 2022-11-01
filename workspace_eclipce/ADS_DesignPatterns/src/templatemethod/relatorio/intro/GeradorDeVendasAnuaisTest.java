package templatemethod.relatorio.intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeradorDeVendasAnuaisTest {

    @Test
    void DeveGerarVendasAnuais() {
        
        GeradorRelatorioDeVendasAnuais gerador = new GeradorRelatorioDeVendasAnuais();
        
        String pagina = gerador.criaPagina(2022);
        
        System.out.println(pagina);
    }

}
