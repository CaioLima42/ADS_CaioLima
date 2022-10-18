package buider.pizzaria;

import buider.carro.FreioABS;
import buider.carro.Porta;

public class Pizza {
	
	private Integer size = 0;
	private Boolean flagCheese = false;
	private Boolean flagPepperoni = false;
			

private void validarTamanho() {
    if(this.size == null) {
         throw new IllegalStateException("O carro deve ter um motor");
         }   
    }

public Pizza() {
//	validarIngredientes();
	validarTamanho();
}
public Integer getsize() {
	return size;
}
public void setSize(Integer size) {
	this.size = size;
}
public Integer getSize() {
    return this.size;
}
public Boolean getflagCheese() {
	return this.flagCheese;
}
public void setflagCheese(Boolean flagCheese) {
	this.flagCheese = flagCheese;
}
public Boolean getflagPepperoni() {
	return this.flagPepperoni;
}
public void setflagPepperoni(Boolean flagPepperoni) {
	this.flagPepperoni = flagPepperoni;
}

}