import assignment1.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 *
 * @author Mehmet Acikgoz
 */
public class SinglyLinkedListQueueTest {


   @Test
   public void test_enqueue() {
      SinglyLinkedListQueue<Integer> stack = new SinglyLinkedListQueue<Integer>();
      stack.enqueue(10);

      assertThat(stack.size(), equalTo(1));
   }

   @Test
   public void test_dequeue() {
      SinglyLinkedListQueue<Integer> stack = new SinglyLinkedListQueue<Integer>();
      stack.enqueue(20);

      assertThat(stack.dequeue(), equalTo(20));
   }

   @Test
   public void test_IsEmpty() {
      SinglyLinkedListQueue<Integer> stack = new SinglyLinkedListQueue<Integer>();
      assertThat(stack.isEmpty(), is(true));
   }

   @Test
   public void test_size() {
      SinglyLinkedListQueue<Integer> stack = new SinglyLinkedListQueue<Integer>();
      stack.enqueue(10);

      assertThat(stack.size(), is(equalTo(1)));
   }

   @Test
   public void test_first() {
      SinglyLinkedListQueue<Integer> stack = new SinglyLinkedListQueue<Integer>();
      stack.enqueue(10);
      stack.enqueue(25);
      stack.enqueue(50);

      assertThat(stack.first(), is(equalTo(10)));
   }

}
