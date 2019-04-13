package assignment1;

public class DoublyNode<E> {

    private E element;
    private DoublyNode<E> previous;
    private DoublyNode<E> next;


    public DoublyNode(){}

    public DoublyNode(E element){
        this.element = element;
    }


    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public DoublyNode<E> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode<E> previous) {
        this.previous = previous;
    }

    public DoublyNode<E> getNext() {
        return next;
    }

    public void setNext(DoublyNode<E> next) {
        this.next = next;
    }
}
