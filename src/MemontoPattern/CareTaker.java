package MemontoPattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	List<Mememto> mementoList = new ArrayList<Mememto>();

	public void add(Mememto mememto) {
		mementoList.add(mememto);
	}

	public Mememto get(int index) {
		return mementoList.get(index);
	}
}
