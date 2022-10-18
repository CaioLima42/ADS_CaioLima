package buider.pizzaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaBuilderTest {

    @Test
    void deveInvalidarPizzaComTamanhoErrado() {
        try {
            Pizza pizza = new PizzaBuilder()
                .setSize(9)
                .setFlagCheesse(false)
                .setFlagPepperoni(false)
                .getPizza();
               
            fail("Devia ter lancado uma exception");
            
        }catch(IllegalStateException e) {
            e.printStackTrace();
        }
      
        
    }
    void deveInvalidarPizzaSemIngrediente()
    {
        try {
            Pizza pizza = new PizzaBuilder()
                    .setSize(3)
                    .getPizza();
            
            fail("Deia lancar uma exception");
            
        }catch(IllegalStateException e) {
            e.printStackTrace();
        }
        
        
    }
}
