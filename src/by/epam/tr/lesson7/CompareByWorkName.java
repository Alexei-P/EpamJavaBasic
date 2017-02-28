package by.epam.tr.lesson7;

import java.util.Comparator;

public class CompareByWorkName implements Comparator<Work>{

	@Override
	public int compare(Work o1, Work o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
