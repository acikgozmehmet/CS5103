import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 *
 * @author Mehmet Acikgoz
 */
public class LinkedStackTest {


   @Test
   public void test_push() {
      Stack<Integer> stack = new LinkedStack<Integer>();
      stack.push(10);

      assertThat(stack.top(), equalTo(10));
   }

   @Test
   public void test_pop() {
      Stack<Integer> stack = new LinkedStack<Integer>();
      stack.push(20);

      assertThat(stack.pop(), equalTo(20));
   }

   @Test
   public void test_IsEmpty() {
      Stack<Integer> stack = new LinkedStack<Integer>();
      assertThat(stack.isEmpty(), is(true));
   }

   @Test
   public void test_size() {
      Stack<Integer> stack = new LinkedStack<Integer>();
      stack.push(10);

      assertThat(stack.size(), is(equalTo(1)));
   }

   @Test
   public void test_top() {
      Stack<Integer> stack = new LinkedStack<Integer>();
      stack.push(10);
      stack.push(25);
      stack.push(50);

      assertThat(stack.top(), is(equalTo(50)));
   }

}
