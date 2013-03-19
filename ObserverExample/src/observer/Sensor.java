package observer;

import observer.iterator.MyArrayList;
import observer.iterator.MyIterator;


public class Sensor implements Publisher {

	private MyArrayList<Subject> subjs = new MyArrayList<Subject>();
	private int temperatura = 20;

	@Override
	public void attach(Subject subj) {
		this.subjs.add(subj);
	}

	public void setTemperatura(int temperatura) {
		this.temperatura  = temperatura;
		
		//for(Subject subj : subjs)
		//	subj.notify(this.temperatura);
		
		// substituindo o for avançado do java por um each com classe anonima:
		subjs.each(new MyIterator<Subject>() { public void run(Subject subj) {
			subj.notify(Sensor.this.temperatura);
		}});
	}

}

