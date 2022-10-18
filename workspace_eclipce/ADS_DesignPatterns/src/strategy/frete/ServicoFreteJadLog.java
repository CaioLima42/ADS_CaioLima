package strategy.frete;

public class ServicoFreteJadLog implements Fretavel{
    //jadLog
    @Override
    public double calculaValor(double pesoEmKg) {
        if(pesoEmKg < 30.00) {
            return 0.00;
        }
        else {
            return 150.00;
        }
    }
}
