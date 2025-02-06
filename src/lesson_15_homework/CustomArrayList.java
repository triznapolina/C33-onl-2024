package lesson_15_homework;

import java.util.Arrays;

// Task *. Let's imagine that Java doesn't have an ArrayList collection. Create your own class that simulates
//the work of a dynamic collection class, i.e. create your own custom collection. The
//collection will be based on an array. A custom collection should store elements of different
//classes (i.e. it is generic).
//Provide for operations(methods):
//1. Adding an element
//2. Deleting an element
//3. Getting an item by index
//4. checking if an item is in the collection
//5. Cleaning the entire collection
//Provide a constructor without parameters - creates an array
//with the default size. Provide a constructor with the specified size of the internal
//array. Provide for the possibility of automatically expanding the collection when
//adding an item in the case when the collection is already full.
public class CustomArrayList<T> {

    private Object[] elements;
    private int size;
    private static final int capacity = 3;

    public CustomArrayList() {
        this.elements = new Object[capacity];
        this.size = 0;
    }

    public CustomArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        this.elements = new Object[initialCapacity];
        this.size = 0;
    }

    public void add(T element) {
        if (size >= elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) elements[index];
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
