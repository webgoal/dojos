package observer;

public class Sirene implements Subject {

	
	private boolean gritando = false;

	@Override
	public void notify(int temperatura) {
		gritando = temperatura > 40;
	}

	public boolean gritando() {
		return gritando  ;
	}
	
	

}
