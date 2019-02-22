public class SpecialStackDriver {
    public static void main(String[] args) {
        SpecialStack specialStack=new SpecialStack();
        specialStack.push(15);
        specialStack.push(11);
        specialStack.push(18);
        if(specialStack.getMin()!=null)
        System.out.println("Minimum element of stack is: "+specialStack.getMin());
        specialStack.pop();
        specialStack.pop();
        specialStack.push(7);
        specialStack.push(10);
        System.out.println("Minimum element of stack is: "+specialStack.getMin());

    }
}
