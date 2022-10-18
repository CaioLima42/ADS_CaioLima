package strategy.frete;

public class ServicoFreteSedex implements Fretavel{
    //sedex 
    @Override
    public double calculaValor(double pesoEmKg) {
        if(pesoEmKg < 20.00) {
            return 100.00;
        }
        else {
            return 120.00;
        }
        
    }

}
