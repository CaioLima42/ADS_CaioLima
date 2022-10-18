package strategy.frete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import buider.pizzaria.Pizza;
import buider.pizzaria.PizzaBuilder;

class CalculadoraFreteTest {

    @Test
    void deveCalcularFreteParaDHL() {
        try {
            CalculadoraFrete calculadora = new CalculadoraFrete();
            double valorObtido = calculadora.calcular("dhl",100.00);
            double valorEsperado = 100.00;
            assertEquals(valorObtido, valorEsperado);
      
        }catch(IllegalStateException e) {
            e.printStackTrace();
        }
      
        
    }
    void deveCalcularFreteParaSedex()
    {
        try {
            CalculadoraFrete calculadora = new CalculadoraFrete();
            double valorObtido = calculadora.calcular("sedex",10.00);
            double valorEsperado = 70.00;
            assertEquals(valorObtido, valorEsperado);
      
        }catch(IllegalStateException e) {
            e.printStackTrace();
        }
        
        
    }
    void deveCalcularFreteParaJadLog()
    {
        try {
            CalculadoraFrete calculadora = new CalculadoraFrete();
            double valorObtido = calculadora.calcular("jadLog",40.00);
            double valorEsperado = 150.00;
            assertEquals(valorObtido, valorEsperado);
      
        }catch(IllegalStateException e) {
            e.printStackTrace();
        }
        
        
    }
}
