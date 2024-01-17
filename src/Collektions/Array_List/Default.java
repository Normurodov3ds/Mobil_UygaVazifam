package Collektions.Array_List;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public interface Default extends List {
    @Override
    default int size() {
        return 0;
    }

    @Override
    default boolean isEmpty() {
        return false;
    }

    @Override
    default boolean contains(Object o) {
        return false;
    }

    @Override
    default Iterator iterator() {
        return null;
    }

    @Override
    default Object[] toArray() {
        return new Object[0];
    }

    @Override
    default Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    default boolean add(Object o) {
        return false;
    }

    @Override
    default boolean remove(Object o) {
        return false;
    }

    @Override
    default boolean containsAll(Collection c) {
        return false;
    }

    @Override
    default boolean addAll(Collection c) {
        return false;
    }

    @Override
    default boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    default boolean removeAll(Collection c) {
        return false;
    }

    @Override
    default boolean retainAll(Collection c) {
        return false;
    }

    @Override
    default void clear() {

    }



    @Override
    default Object get(int index) {
        return null;
    }

    @Override
    default Object set(int index, Object element) {
        return null;
    }

    @Override
    default void add(int index, Object element) {

    }

    @Override
    default Object remove(int index) {
        return null;
    }

    @Override
    default int indexOf(Object o) {
        return 0;
    }

    @Override
    default int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    default ListIterator listIterator() {
        return null;
    }

    @Override
    default ListIterator listIterator(int index) {
        return null;
    }

    @Override
    default List subList(int fromIndex, int toIndex) {
        return null;
    }

    default int fun(){
        return 0;
    }

}
