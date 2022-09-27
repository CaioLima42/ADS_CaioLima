package buider.carro;

public class CarroBuider {
	
	private Carro carro;
	
	public CarroBuider() {
		carro = new Carro();
	}
	
	public void buidPortas(Porta[] portas) {
		carro.setPortas(portas);
	}
	
	public void buidMotor(Motor m) {
		carro.setMotor(m);
	}
	
	public void buidComputadorBordo (ComputadorBordo cb) {
		carro.setComputadorBordo(cb);
	}
	
	public void buidFreioABS(FreioABS f) {
		carro.setFreioABS(f);
	}

	public Carro getCarro() {
		valudarPortas();
		return carro;
	}

	private void valudarPortas() {
		if (carro.getPortas() == null) {
			throw new IllegalStateException("carro deve ter portas");
		}
		int numeroDePortas = carro.getPortas().length;
		if(numeroDePortas != 2 && numeroDePortas != 4) {
			throw new IllegalStateException("Numero de portas invalido" + numeroDePortas);
		}
		
	}
	
	
	

}
