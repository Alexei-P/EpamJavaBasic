package by.epam.tr.lesson9;

import java.util.NoSuchElementException;

public class MyLinkedList<E> {
	Node<E> firstItem;
	Node<E> lastItem;
	private int size = 0;

	public MyLinkedList() {
		firstItem = lastItem = null;
	}

	public void addFirst(E e) {

		if (firstItem == null && lastItem == null) {
			Node<E> temp = new Node<E>(e, null);
			firstItem = temp;
			lastItem = temp;
		} else {
			Node<E> temp = new Node<E>(e, firstItem);
			firstItem = temp;
		}
		size++;
	}

	public void addLast(E e) {
		if (firstItem == null && lastItem == null) {
			Node<E> temp = new Node<E>(e, null);
			firstItem = temp;
			lastItem = temp;
		} else if (firstItem == lastItem && firstItem != null) {
			lastItem.next = new Node<E>(e, null);
			lastItem = lastItem.next;
			firstItem.next = lastItem;
		} else {
			lastItem.next = new Node<E>(e, null);
			lastItem = lastItem.next;
		}
		size++;
	}

	public void add(int index, E e) {
		if (index > size)
			throw new IndexOutOfBoundsException();
		else if (index == 0) {
			addFirst(e);
			return;
		} else if (index == size) {
			addLast(e);
			return;
		} else {
			Node<E> iter = this.firstItem;
			Node<E> temp1 = null, temp2 = null;
			int counter = 0;
			while (iter.next != null && counter != index) {
				temp1 = iter.next;
				counter++;
			}
			temp2 = temp1.next;
			temp1.next = new Node<E>(e, temp2);

		}
		size++;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("MyLinkedList [ ");
		Node<E> iter = this.firstItem;
		while (iter != null) {
			builder.append(iter.toString());
			iter = iter.next;
		}
		builder.append(" ]");
		return builder.toString();
	}

	public int getSize() {
		return size;
	}

	// TODO: correct removal
	public void remove(E e) {
		Node<E> iter = firstItem;
		if (size == 0) {
			throw new NoSuchElementException();
		} else if (size == 1 && iter.item.equals(e)) {
			firstItem = null;
			lastItem = null;
			size--;
			return;
		} else if (size == 2 && iter.item.equals(e)) {
			firstItem = lastItem;
			firstItem.next = null;
			size--;
			return;
		} else if (size == 2 && lastItem.item.equals(e)) {
			lastItem = firstItem;
			firstItem.next = null;
			size--;
			return;
		} else if (firstItem.item.equals(e)) {
			firstItem = firstItem.next;
			size--;
			return;
		}

		while (iter.next != null) {
			if (iter.next.item.equals(e)) {
				iter.next = iter.next.next;
				if (iter.next == null)
					lastItem = iter.next;
				size--;
				return;
			}
			iter = iter.next;
		}
	}

	public boolean contains(E e) {
		Node<E> iter = firstItem;
		Node<E> temp;
		while (iter.next != null) {
			temp = iter.next;
			if (temp.item.equals(e)) {
				return true;
			}
		}
		return false;
	}

}
