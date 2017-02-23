package by.epam.tr.lesson8;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MySet<E> implements Cloneable {
	private Object[] set;
	private static final int DEFAULT_SIZE = 4;
	private int size;
	private int elementsCounter;

	public MySet() {
		size = DEFAULT_SIZE;
		set = new Object[size];
		elementsCounter = 0;
	}

	public boolean add(E e) {
		if (e.equals(null)) {
			throw new NullPointerException();
		}
		if (elementsCounter == size) {
			int newSize = size * 2;
			Object[] temp = new Object[newSize];
			temp = Arrays.copyOfRange(set, 0, newSize);
			set = temp;
			size = newSize;
		}
		for (int i = 0; i < elementsCounter; i++) {
			if (set[i] != null) {
				E temp = (E) set[i];
				if (temp.equals(e))
					return false;
			}
		}
		set[elementsCounter] = e;
		elementsCounter++;
		return true;
	}

	public boolean contains(E e) {

		if (e.equals(null)) {
			if (set.length > elementsCounter)
				return true;
			else
				return false;
		}

		for (int i = 0; i < size(); i++) {
			E temp = (E) set[i];
			if (temp.equals(e))
				return true;
		}

		return false;
	}

	public int size() {
		return elementsCounter;
	}

	public void clear() {
		set = new Object[DEFAULT_SIZE];
		elementsCounter = 0;
	}

	
	public Object clone() {
		try {
			MySet<E> newSet = (MySet<E>) super.clone();
			newSet.set = Arrays.copyOf(set, size);
			return newSet;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e);
		}

	}

	public boolean isEmpty() {
		if (elementsCounter == 0)
			return true;
		else
			return false;
	}

	
	public boolean remove(E e) {
		int setIndex = 0;
		if (!this.contains(e)){
			throw new NoSuchElementException();
		}
			

		for (int i = 0; i < size(); i++) {
			E temp = (E) set[i];
			if (temp.equals(e)) {
				setIndex = i;
			}
		}

		if (setIndex == size() - 1) {
			set[setIndex] = null;
			elementsCounter--;
			return true;
		} else {
			for (int i = setIndex + 1; i < elementsCounter; i++) {
				set[i - 1] = set[i];
			}
			set = Arrays.copyOf(set, size()-1);
			elementsCounter--;
			return true;
		}
	}

	@Override
	public String toString() {
		return "MySet [set=" + Arrays.toString(set) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + elementsCounter;
		result = prime * result + Arrays.hashCode(set);
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MySet other = (MySet) obj;
		if (elementsCounter != other.elementsCounter)
			return false;
		if (!Arrays.equals(set, other.set))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

}
