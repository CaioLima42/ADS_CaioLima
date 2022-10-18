package buider.carro;

public class CarroBuiderFluente {
	
	private Carro carro;
	
	public CarroBuiderFluente() {
		carro = new Carro();
	}
	
	public CarroBuiderFluente buildPorta(Porta[] portas) {
		carro.setPortas(portas);
		return this;
	}
	
	
	public CarroBuiderFluente buidMotor(Motor m) {
		carro.setMotor(m);
		return this;
	}
	
	public  CarroBuiderFluente buidComputadorBordo (ComputadorBordo cb) {
		carro.setComputadorBordo(cb);
		return this;
	}
	
	public  CarroBuiderFluente buidFreioABS(FreioABS f) {
		carro.setFreioABS(f);
		return this;
	}

	public Carro getCarro() {
		validarPortas();
		validarMotor();
		return carro;
	}

	private void validarPortas() {
		if (carro.getPortas() == null) {
			throw new IllegalStateException("carro deve ter portas");
		}
		int numeroDePortas = carro.getPortas().length;
		if(numeroDePortas != 2 && numeroDePortas != 4) {
			throw new IllegalStateException("Numero de portas invalido" + numeroDePortas);
		}
		
	}
	
	private void validarMotor() {
		if(carro.getMotor() == null) {
			throw new IllegalStateException("O carro deve ter um motor");
			}	
	}



	}
	

}
