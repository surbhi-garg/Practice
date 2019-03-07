package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhanendra Kumar
 */
public class StackImpl {

    private List<String> stack;

    public StackImpl() {
        stack = new ArrayList<String>();
    }

    public void push(String item) {
        stack.add(item);
    }

    public String pop() {
        int index = stack.size() - 1;
        String item = stack.get(index);
        stack.remove(index);
        return item;
    }

    public List<String> getStack() {
        return stack;
    }
}
