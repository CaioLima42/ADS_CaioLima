package buider.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuidaeFluenteTest {

	package buider.carro;

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;

	class CarroBuiderTest {

		@Test
		void daveConstruirUmCarroPeloBuider() {
			//partes
			Porta portaMotorista = new Porta();
			Porta portaPassageiro = new Porta();
			Porta[] portas = {portaMotorista, portaPassageiro};
			Motor motorVTEC = new Motor();
			ComputadorBordo computadorSiemens = new ComputadorBordo();
			FreioABS freioBosch = new FreioABS();
			
			//buider
			CarroBuider carroBuider = new CarroBuiderFluente()
						.buidPortas(portas)
						.buidMotor(motorVTEC)
						.buidComputadorBordo(computadorSiemens)
						.buidFreioABS(freioBosch);
		
			//teste o carro construido
			
			Carro carroConstruido = carroBuider.getCarro();
			
			assertNotNull(carroConstruido);
			assertNotNull(carroConstruido.getPortas());
			assertNotNull(carroConstruido.getMotor());
			assertNotNull(carroConstruido.getComputadorBordo());
			assertNotNull(carroConstruido.getFreioABS());
			assertEquals(carroConstruido.getPortas().length,2);
		}

	}

}
