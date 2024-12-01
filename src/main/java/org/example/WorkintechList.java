package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {

    @Override
    public boolean add(T element) {
        if (!this.contains(element)) {
            return super.add(element);
        }
        return false;  // Tekrar eden eleman eklenmez
    }

    public void sort() {
        Collections.sort(this);
    }

    public boolean remove(Object element) {
        super.remove(element);
        this.sort();  
        return false;
    }
}
