package by.epam.tr.lesson7;

import java.util.Comparator;

public class CompareByDate implements Comparator<Work>{
	@Override
	public int compare(Work o1, Work o2) {
		return o1.getDateOfPublishing().compareTo(o2.getDateOfPublishing());
	}

}
