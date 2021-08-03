package com.company.day3;

public class DoubleList<T> implements MyDoubleList<T> {
    Nod<T> first;
    Nod<T> last;
    int size;
    Nod<T> current;
    @Override
    public T get(int index) {
        checkIndex(index);
        if(index < size/2){
           current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.value;
        }else {
            current = last;
            for (int i = size; i > index; i--) {
                current = current.prev;
            }
        }
        return current.value;
    }

    @Override
    public void addLast(T obj) {
        Nod<T> nod = new Nod<>(obj);
        if(first == null){
            first = nod;
            last = nod;
            size++;
            return;
        }
        last.next = nod;
       nod.prev = last;
       last = nod;
        size++;
    }

    @Override
    public void addFirst(T obj){
        Nod<T> nod = new Nod<>(obj);
        if(first == null){
            first = nod;
            last = nod;
            size++;
            return;
        }
        first.prev = nod;
        nod.next = first;
        first = nod;
        size++;
    }

    @Override
    public int indexOf(T obj) {
        current = first;
        for (int i = 0; i < size; i++) {
            if(current.value == null){
                if(obj == null){
                    return i;
                }
                current = current.next;
                i++;
            }
            if(current.value.equals(obj)){
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public void removeObj(T obj) {
        current = first;
        if(first.value == null){
            first = first.next;
            first.prev = null;
            size--;
            return;
        }else {
        if(first.value.equals(obj)){
            first = first.next;
            first.prev = null;
            size--;
            return;
        }
        }
        for (int i = 0; i < size; i++) {
            if (current.next.value==null){
                if(obj==null){
                current.next.next.prev = current.next.prev;
                current.next = current.next.next;

                if(current.next == null){
                    last = current;
                }
                size--;
                return;
                }
                current = current.next;
            }
            if(current.next.value.equals(obj)){
                current.next.next.prev = current.next.prev;
                current.next = current.next.next;

                if(current.next == null){
                    last = current;
                }
                size--;
                return;
            }
            current = current.next;
        }
    }
    public void checkIndex(int index){
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder rez = new StringBuilder("[");
        current = first;
        for (int i = 0; i < size; i++) {
            rez.append(current.value);
            current = current.next;
            if(i < size-1){
                rez.append("; ");
            }
        }
        rez.append("]");
        return rez.toString();
    }
}
