package buider.pizzaria;

public class PizzaBuilder {
	
	private Pizza pizza;
	
	public PizzaBuilder(){
		this.pizza = new Pizza();
	}
	
	public PizzaBuilder setSize(Integer size) {
	   pizza.setSize(size);
	   return this;
	}
    public PizzaBuilder setFlagCheesse(Boolean flagCheese) {
        pizza.setflagCheese(flagCheese);
        return this;
    }
    
    public PizzaBuilder setFlagPepperoni(Boolean flagPepperoni) {
        pizza.setflagCheese(flagPepperoni);
        return this;
    }
    public Pizza getPizza() {
        return pizza;
    }
    
	}

