import java.util.Stack;

public class SpecialStack extends Stack<Integer> {
   private Stack<Integer>minStack=new Stack<Integer>();
   public void push(int element)
   {
       //push element in main stack
       //if stack is empty push the element in minStack too
       if(isEmpty())
       {
           super.push(element);
           minStack.push(element);
       }
       /*
       * Check with current minimum element
       * 1. if currentMinium < new item to be inserted-->push new item to minimum stack
       * 2. if currentMinimum>new item to be inserted-->push current minimum again
       * (so that when we pop element,current minimum will still be maintained,unless and util
       * we actually pop the currentMinimum element. Any other element popping will just remove one occurrence
       * of current minimum value from the stack.)
       * */
       else
       {
           super.push(element);
           int minEle=minStack.peek();//obtain the current minimum element present in stack
           if(element<minEle)
               minStack.push(element);
           else
               minStack.push(minEle);
       }
   }
   public Integer pop()
   {
       Integer poppedElement=null;
       //to avoid EmptyStackException
       if(!isEmpty())
       poppedElement=super.pop();
       if(minStack.isEmpty()==false)
        minStack.pop();
       return poppedElement;
   }
   public Integer getMin()
   {
       //if original stack remains empty, there will be no minimum element too
       if(isEmpty())
           return null;
       return minStack.peek();
   }

}
