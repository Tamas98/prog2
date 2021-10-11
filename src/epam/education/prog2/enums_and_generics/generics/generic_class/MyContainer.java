package epam.education.prog2.enums_and_generics.generics.generic_class;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * TODO docme.
 */
// Type parameters usually named T
public class MyContainer<T> {

    private T[] container;
    private int index = 0;
    private final int size;
    private final Class<T> type;

    public MyContainer(Class<T> type, int size) {
        this.type = type;
        this.size = size;
        container = (T[]) Array.newInstance(type, size);
    }

    public void add(T element) {
        if(index < container.length) {
            container[index] = element;
            index++;
        }
    }

    public void delete(T element) {
        int indexOfElement = findElement(element);
        if(0 <= indexOfElement) {
            container[indexOfElement] = null;
        }
        reRenderArray();
    }

    public int findElement(T element) {
        for(int i = 0; i < index; i++) {
            if(container[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int elementCount() {
        return index;
    }

    private void reRenderArray() {
        T[] newArray = (T[]) Array.newInstance(type, size);
        int newIndex = 0;
        for(int i = 0; i < index; i++) {
            if(container[i] != null) {
                newArray[newIndex] = container[i];
                newIndex++;
            }
        }

        container = newArray;
        index = newIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for(T element: container) {
            if(element != null) {
                sb.append("Hero: ");
                sb.append(element.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
