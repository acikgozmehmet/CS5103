package assignment1;

public class SinglyLinkedListStack<E> {

    private int size;
    private Node<E> top;

    public void push(E element) {
        Node newNode = new Node(element);
        if (top == null) {
            newNode.setNext(null);
            top = newNode;
        }
        else {
            newNode.setNext(top);
            top = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public E pop() {
        if (top == null)
            throw new RuntimeException("assignment1 Empty");
        else{
            E element = top.getElement();
            top = top.getNext();
            size--;
            return element;
        }
    }

    public E top() {
        return top.getElement();
    }

    public boolean isEmpty() {
        return (size == 0);
    }


    public static void main(String [] args){

        System.out.println("Stack methods");
        SinglyLinkedListStack<Integer> stack = new SinglyLinkedListStack<>();
        System.out.println("IsEmpty : "+ stack.isEmpty());

        stack.push(6);
        System.out.println("Pushed element :" + stack.top());
        stack.push(4);
        System.out.println("Pushed element :" + stack.top());

        System.out.println("IsEmpty : "+ stack.isEmpty());

        System.out.println("Number of elements in the stack : "+ stack.size());

        System.out.println("Popped element : "+ stack.pop());

        System.out.println("Number of elements in the stack : "+ stack.size());

    }
}
