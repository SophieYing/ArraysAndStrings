//MyQueue
public class MyQueue {

        private class QueueNode<T> {

            private T data;
            private QueueNode next;

            public QueueNode(T data) {
                this.data = data;
            }
        }
        private QueueNode first;
        private QueueNode last;

        public void add(T data) {
            QueueNode<T> q = new QueueNode<T>(data);
            if (last != null) {
                last.next = q;
            }
            last = q;
            if (first == null) {
                first = last;
            }
        }

        public T remove() {
            if (first == null) {
                throw new NoSuchElementException();
            }
            T data = first.data;
            first = first.next;
            if (first == null) {
                last = null;
            }
            return data;
        }

        public T peek() {
            if (first == null) {
                throw new NoSuchElementException();
            }
            return first.data;
        }

        public boolean isEmpty() {
            return first == null;
        }
    }