package observer.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import observer.Luz;
import observer.Sensor;
import observer.Sirene;

import org.junit.Test;

public class TestObserver {

	@Test
	public void testObserver() {
		Luz luizinha = new Luz();
		Sensor termometro = new Sensor();
		Sirene buzininha = new Sirene();
		
		termometro.attach(luizinha);
		termometro.attach(buzininha);
		
		assertFalse(luizinha.acesa());
		assertFalse(buzininha.gritando());
		
		termometro.setTemperatura(50);
		assertTrue(luizinha.acesa());	
		assertTrue(buzininha.gritando());
	}
	
}
