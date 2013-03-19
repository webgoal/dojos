package observer;

public class Luz implements Subject {

	private boolean acesa = false;

	public boolean acesa() {
		return acesa ;
	}

	@Override
	public void notify(int temperatura) {
		acesa = temperatura > 30;
	}
	
}
