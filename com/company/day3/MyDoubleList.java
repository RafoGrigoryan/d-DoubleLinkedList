package com.company.day3;

public interface MyDoubleList<T>{
    T get(int index);
    void addLast(T obj);
    void addFirst(T obj);
    int indexOf(T obj);
    int size();
    void removeObj(T obj);
    String toString();
}
