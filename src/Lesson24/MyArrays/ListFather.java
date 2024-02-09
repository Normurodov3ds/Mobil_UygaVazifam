package Lesson24.MyArrays;

import Lesson24.MyArrays.AbstractList.ArrayLists.My_ArrayList;



public interface ListFather<E> {

    int size();

    boolean isEmpty();

    boolean contains(E o);

    E[] toArray();

    Object[] toArrays();

    boolean add(E o);

    boolean remove(E o);

    boolean addAll(E[] c);

    E get(int index);

    E set(int index, E element);

    void add(int index, E element);

    E remove(int index);

    int indexOf(E o);

    boolean removeAll(My_ArrayList<E> s);

}
