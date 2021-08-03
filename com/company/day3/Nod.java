package com.company.day3;

public class Nod <T>{
    T value;
    Nod <T> next;
    Nod <T> prev;

    public Nod(T value) {
        this.value = value;
    }
}
