/**
 * Name: GenericStack.java
 * Purpose: A generic stack implementation using ArrayList.
 * Programmer: Alex Kurcan
 * Date: 01/29/2026
 */

import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E> {

    // Return the number of elements in the stack
    public int getSize() {
        return this.size();
    }

    // Look at the top element without removing it
    public E peek() {
        return this.get(getSize() - 1);
    }

    // Add an element to the top of the stack
    public void push(E o) {
        this.add(o);
    }

    // Remove and return the top element
    public E pop() {
        E o = this.get(getSize() - 1);
        this.remove(getSize() - 1);
        return o;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}

