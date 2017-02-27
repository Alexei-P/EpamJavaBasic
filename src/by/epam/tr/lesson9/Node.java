package by.epam.tr.lesson9;

public class Node<E> {
		E item;
		Node<E> next;
		Node(E element, Node<E> next) {
			item = element;
			this.next = next;
		}
		
		@Override
		public String toString() {
			return "Node [item=" + item + "]";
		}
		
		
}
