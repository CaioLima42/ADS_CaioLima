package templatemethod.relatorio.rafatorado;

import java.util.List;

public abstract class GeradorRelatorioTemplate {

    private String getCabecalho() {
        String cabecalho = "Empresa My" + '\n' + "-----------";
        return cabecalho;
    }
    

    public abstract List<String> getConteudo();
    
    private String getRodape() {
        String rodape = "------------------------------------" + '\n'
        + "* Propriedade particular - Uso confidencial";
        return rodape;
    }

    public String criaPagina() {
        String cabecalho = getCabecalho();
        List<String> conteudo = getConteudo(); // via polimorfismo sera invocado o da sub-classe
        String rodape = getRodape();
        
        StringBuffer bufferPagina = new StringBuffer();
        bufferPagina.append(cabecalho);
        
        for(String linha: conteudo) {
            bufferPagina.append('\n');
            bufferPagina.append(linha);
            }
        bufferPagina.append('\n');
        
        bufferPagina.append(rodape);
        
        return bufferPagina.toString();
    }

}
