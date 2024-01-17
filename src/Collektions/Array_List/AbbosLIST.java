package Collektions.Array_List;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class AbbosLIST<E> extends AbstractList<E> {

    List<Object> list = new ArrayList<>();
    @Override
    public boolean add(E e) {
        return list.add(e);
    }

    @Override
    public E get(int index) {
        return (E) list.get(index);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return ""+ list;
    }
}
