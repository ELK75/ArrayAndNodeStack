
import java.lang.UnsupportedOperationException;

public class ArrayStack<T> implements Stack<T> {

    private Object[] list;
    private int elements;

    public ArrayStack() {
        this.list = new Object[10];
        this.elements = 0;
    }
    
    public void push(Object newObj) {
        if (elements > list.length-1) {
            Object[] newList = new Object[list.length*2 + 1];
            System.arraycopy(list, 0, newList, 0, elements);
            this.list = newList;
        }
        list[elements] = newObj;
        elements++;
    }

    public boolean isEmpty() {
        return elements == 0;
    }

    public T pop() {
        if (elements == 0) {
            throw new UnsupportedOperationException();
        } else {
            elements--;
            return (T)list[elements];
        }
    }

    public T peek() {
        if (elements == 0) {
            throw new UnsupportedOperationException();
        } else {
            return (T)list[elements-1];
        }
    }
}