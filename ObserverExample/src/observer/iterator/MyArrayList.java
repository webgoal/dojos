package observer.iterator;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {

	private static final long serialVersionUID = -4665452698721155717L;

	public void each(MyIterator<T> iteracao) {
		for(T item : this)
			iteracao.run(item);
	}

}
