import org.junit.Assert;
import org.junit.Test;
import assignment1.*;

public class DoublyLinkedListTest {

    @Test
    public void isEmptyTest(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();

        Assert.assertTrue(linkedList.size() == 0  );
    }


    @Test
    public void pushFrontTest_whenEmpty(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushFront(5);
        Assert.assertTrue(linkedList.size() == 1  );
    }

    @Test
    public void pushFrontTest_whenNotEmpty(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushFront(5);
        linkedList.pushFront(6);
        Assert.assertTrue(linkedList.size() == 2  );
    }


    @Test
    public void pushBackTest_whenEmpty(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushBack(5);

        Assert.assertTrue(linkedList.size() == 1  );
    }
    @Test
    public void pushBackTest_whenNotEmpty(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushBack(2);
        linkedList.pushBack(5);

        Assert.assertTrue(linkedList.size() == 2  );
    }

    @Test(expected = RuntimeException.class)
    public void popFront_whenEmpty(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.popFront();
    }

    @Test
    public void popFront_whenOnlyOneElement(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushBack(2);
        Assert.assertEquals(linkedList.popFront(), new Integer(2));
    }


    @Test
    public void popFront_whenMoreThanOneElement(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushBack(2);
        linkedList.pushBack(1);
        linkedList.pushBack(21);
        Assert.assertEquals(linkedList.popFront(), new Integer(2));
    }


    @Test(expected = RuntimeException.class)
    public void popBackTest_whenEmpty(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.popBack();
    }

    @Test
    public void popBackTest_whenOnlyOneElement(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushBack(2);
        Assert.assertEquals(linkedList.popBack(), new Integer(2));
    }


    @Test
    public void popBackTest_whenMoreThanOneElement(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushBack(2);
        linkedList.pushBack(1);
        linkedList.pushBack(21);
        Assert.assertEquals(linkedList.popBack(), new Integer(21));
    }

    @Test(expected = RuntimeException.class)
    public void getBackTest_whenEmpty(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        Assert.assertTrue(linkedList.size() ==0);
        linkedList.getBack();
    }

    @Test
    public void getBackTest_whenMoreThanOneElement(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushBack(2);
        linkedList.pushBack(1);
        linkedList.pushBack(21);
        Assert.assertEquals(linkedList.getBack(), new Integer(21));
        Assert.assertTrue(linkedList.size() ==3);
    }


    @Test(expected = RuntimeException.class)
    public void getFrontTest_whenEmpty(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        Assert.assertTrue(linkedList.size() ==0);
        linkedList.getFront();
    }

    @Test
    public void getFrontTest_whenMoreThanOneElement(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushBack(2);
        linkedList.pushBack(1);
        linkedList.pushBack(21);
        Assert.assertEquals(linkedList.getFront(), new Integer(2));
        Assert.assertTrue(linkedList.size() ==3);
    }

    @Test(expected = RuntimeException.class)
    public void getAtIndexTest_whenEmpty(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.getAtIndex(2);
    }

    @Test(expected = RuntimeException.class)
    public void getAtIndexTest_whenInvalidIndex(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushFront(3);
        linkedList.getAtIndex(1);
    }

    @Test
    public void getAtIndexTest_whenMoreELements(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushFront(3);
        linkedList.pushFront(4);
        linkedList.pushFront(9);
        Assert.assertEquals( new Integer(3), linkedList.getAtIndex(2));
    }


    @Test
    public void insertAtIndexTest_whenMoreELements(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushFront(3);
        linkedList.pushFront(4);
        linkedList.pushFront(9);
        linkedList.insertAtIndex(2,1);
        Assert.assertEquals( new Integer(2), linkedList.getAtIndex(1));
    }


    @Test
    public void insertAtIndexTest_whenEmpty(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.insertAtIndex(2,0);
        Assert.assertEquals( new Integer(2), linkedList.getAtIndex(0));
    }


    @Test
    public void insertAtIndexTest_whenIndexEqSize(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushFront(3);
        linkedList.pushFront(4);
        linkedList.pushFront(9);
        linkedList.insertAtIndex(21,3);
        Assert.assertEquals( new Integer(21), linkedList.getAtIndex(3));
    }


    @Test
    public void removeAtIndexTest_whenMoreELements(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushFront(3);
        linkedList.pushFront(4);
        linkedList.pushFront(9);
        linkedList.removeAtIndex(2);
        Assert.assertTrue(linkedList.size() == 2 );
    }


    @Test
    public void removeAtIndexTest_whenIndex0(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushBack(2);
        linkedList.removeAtIndex(0);
        Assert.assertTrue(linkedList.size() == 0 );
    }


    @Test(expected = RuntimeException.class)
    public void removeAtIndexTest_whenIndexEqSizeMinus1(){
        DoublyLinkedList<Integer> linkedList =  new DoublyLinkedList<Integer>();
        linkedList.pushFront(3);
        linkedList.pushFront(4);
        linkedList.pushFront(9);
        linkedList.removeAtIndex(3);
    }



}
