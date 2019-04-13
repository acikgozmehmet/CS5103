package assignment1;

public class DoublyLinkedList<E> {

    private DoublyNode<E> first;
    private DoublyNode<E> last;
    private int size;


    public void pushFront(E element){

        DoublyNode newNode = new DoublyNode(element);

        if (first == null){
            first = newNode;
            last =  newNode;
        }
        else {
            first.setPrevious(newNode);
            newNode.setNext(first);
            first = newNode;
        }
        size++;
    }


    public void pushBack(E element){

        DoublyNode newNode = new DoublyNode(element);

        if (last ==  null){
            last = newNode;
            first = newNode;
        }
        else{
            last.setNext(newNode);
            newNode.setPrevious(last);
//            newNode.setNext(null);  // default is null
            last = newNode;
        }
        size++;

    }


    public E popFront(){
        E element ;
        if (first == null)
            throw new RuntimeException("DoublyLinkedListEmpty Exception");
        else if (first == last){
            element = first.getElement();
            first = null;
            last = null;
//            return  element;
        }
        else {
            DoublyNode<E> second = first.getNext();
            first.setNext(null);
            element = first.getElement();
            first = second;
            first.setPrevious(null);
//            return element;
        }

        size--;
        return element;

    }


    public E popBack(){
        E element;
        if (last ==  null)
            throw new RuntimeException("DoublyLinkedList Empty Exception");
        else if (last == first){
            element = last.getElement();
            first = null;
            last = null;
//            return element;
        }else {
            element = last.getElement();
            DoublyNode<E> secondToLast = last.getPrevious();
            last.setPrevious(null);
            secondToLast.setNext(null);
            last = secondToLast;
//            return element;
        }
        size--;
        return element;
    }

    public E getBack(){
        if (last ==null)
            throw new RuntimeException("DoublyLinkedList Empty Exception");
        else{
            E element = last.getElement();
            return element;
        }
    }

    public E getFront(){
        if (first ==null)
            throw new RuntimeException("DoublyLinkedList Empty Exception");
        else{
            E element = first.getElement();
            return element;
        }
    }



    public int size(){
        return size;
    }


    public E getAtIndex(int index){
        if (first == null){
            throw new RuntimeException("DoublyLinkedList Empty Exception");
        }
        else if (index < 0  || index > size())
            throw new RuntimeException("Index out of Boundary");
        else{
            DoublyNode<E> current =  first;
            for (int i = 0; i < index; i++){
                current= current.getNext();
            }
            return current.getElement();
        }
    }



    public void insertAtIndex(E element, int index){

        if (index == 0){
            pushFront(element);
        }
        else if (index == size()){
            pushBack(element);
        }
        else if (index < 0 || index > size()){
            throw new RuntimeException("Index out of Boundary");
        }
        else {
            DoublyNode<E> before = first;

            for (int i = 0; i < index-1; i++){
                before = before.getNext();
            }

            DoublyNode<E> after = before.getNext();

            DoublyNode<E> newNode = new DoublyNode(element);

            before.setNext(newNode);
            newNode.setPrevious(before);
            after.setPrevious(newNode);
            newNode.setNext(after);
            size++;
        }
    }


    public void removeAtIndex(int index){
        if (index == 0 ){
            popFront();
        }
        else if (index == size()-1){
            popBack();
        }
        else if (index < 0 || index >= size()){
            throw new RuntimeException("Index out of Boundary");
        }
        else
        {
            DoublyNode current = first;

            for (int i = 0; i < index; i++){
                current = current.getNext();
            }

            DoublyNode before= current.getPrevious();
            DoublyNode after = current.getNext();

            before.setNext(after);
            after.setPrevious(before);

            size--;

        }
    }

    public boolean isEmpty(){
        return (size() == 0);
    }

    public void traverse(){
        System.out.print("Traversing ...: ");
        for (int i = 0; i < size(); i++)
            System.out.print(getAtIndex(i)+" ");
        System.out.println();
    }


    public static void main(String[] args){
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>();
        System.out.println("IsEmpty: " + linkedList.isEmpty());
        System.out.println("Pushing front 3 and 2 in order");
        linkedList.pushFront(3);
        linkedList.pushFront(2);
        System.out.println("IsEmpty: " + linkedList.isEmpty());

        linkedList.traverse();
        System.out.println("Pushing front 4 and 5 and 6 in order");
        linkedList.pushBack(4);
        linkedList.pushBack(5);
        linkedList.pushBack(6);
        linkedList.traverse();

        System.out.println("Deleting the first element");
        linkedList.popFront();
        linkedList.traverse();

        System.out.println("Deleting the last element");
        linkedList.popBack();
        linkedList.traverse();

        System.out.println("Deleting index 1 element");
        linkedList.removeAtIndex(1);
        linkedList.traverse();

        System.out.println("printing index 1 element");
        System.out.println(linkedList.getAtIndex(1));

        System.out.println("printing the first element");
        System.out.println(linkedList.getFront());

        System.out.println("printing the last element");
        System.out.println(linkedList.getBack());

        System.out.println("inserting 7 at index 1");
        linkedList.insertAtIndex( 7, 1);
        linkedList.traverse();


        System.out.println("printing number of elements");
        System.out.println(linkedList.size());


    }

}
