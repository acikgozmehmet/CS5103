import assignment1.SinglyLinkedListStack;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 *
 * @author Mehmet Acikgoz
 */
public class SinglyLinkedListStackTest {


   @Test
   public void test_push() {
      SinglyLinkedListStack<Integer> stack = new SinglyLinkedListStack<Integer>();
      stack.push(10);

      assertThat(stack.size(), equalTo(1));
   }

   @Test
   public void test_pop() {
      SinglyLinkedListStack<Integer> stack = new SinglyLinkedListStack<Integer>();
      stack.push(20);

      assertThat(stack.pop(), equalTo(20));
   }

   @Test
   public void test_IsEmpty() {
      SinglyLinkedListStack<Integer> stack = new SinglyLinkedListStack<Integer>();
      assertThat(stack.isEmpty(), is(true));
   }

   @Test
   public void test_size() {
      SinglyLinkedListStack<Integer> stack = new SinglyLinkedListStack<Integer>();
      stack.push(10);

      assertThat(stack.size(), is(equalTo(1)));
   }

   @Test
   public void test_top() {
      SinglyLinkedListStack<Integer> stack = new SinglyLinkedListStack<Integer>();
      stack.push(10);
      stack.push(25);
      stack.push(50);

      assertThat(stack.top(), is(equalTo(50)));
   }

}
