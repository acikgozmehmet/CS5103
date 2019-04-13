package assignment1;

public class SinglyLinkedListQueue<E> {

    private int size;
    private Node<E> front;
    private Node<E> rear;


    public int size(){
        return size;
    }

    public boolean isEmpty(){ return size() == 0; }

    public void enqueue(E element){

        Node newNode = new Node(element);

        if (rear == null){
            newNode.setNext(null);
            rear = front = newNode;
        }
        else{
            rear.setNext(newNode);
            rear = newNode;
        }

        size++;
    }


    public E dequeue(){

        if (front == null){
            throw new RuntimeException("Queue Empty Exception");
        }

        E element = front.getElement();
        front = front.getNext();
        size--;

        if (front == null)
            rear = null;

        return element;


    }


    public E first(){
        if (front == null)
            throw new RuntimeException("Queue Empty Exception");
        else{
            E element = front.getElement();
            return element;
        }
    }


    public static void main(String [] args){

        SinglyLinkedListQueue<Integer> queue = new SinglyLinkedListQueue<>();
        System.out.println("IsEmpty : "+ queue.isEmpty());
        System.out.println("Enqueued element : 4");
        queue.enqueue(4);
        System.out.println("First element : " + queue.first());
        System.out.println("IsEmpty : "+ queue.isEmpty());
        System.out.println("Enqueued element : 8");
        queue.enqueue(8);
        System.out.println("Number of elements in the queue : " + queue.size());
        System.out.println("Dequeued  element : "+ queue.dequeue());
        System.out.println("Number of elements in the queue : " + queue.size());
    }
}
