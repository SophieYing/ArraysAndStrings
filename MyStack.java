public class MyStack<T> {

    private static class StackNode<T> {

        private T val;
        private StackNode<T> next = null;

        public StackNode(T value) {
            val = value;
        }
    }
    private StackNode<T> top;

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T item = top.val;
        top = top.next;
        return item;
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.val;
    }

    public void push(T value) {
        StackNode<T> t = new StackNode<T>(value);
        t.next = top;
        top = t;
    }

    public boolean isEmpty() {
        return top == null;
    }
}