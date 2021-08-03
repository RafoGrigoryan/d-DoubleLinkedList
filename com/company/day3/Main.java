package com.company.day3;
public class Main {
    public static void main(String[] args) {
        DoubleList<Integer> doubleList = new DoubleList<>();
        doubleList.addLast(1);
        doubleList.addLast(2);
        doubleList.addLast(null);
        doubleList.addLast(4);
        doubleList.addLast(5);
        doubleList.addLast(6);
      // doubleList.removeObj(1);
     // doubleList.removeObj(4);
    //   doubleList.removeObj(6);
        System.out.println(doubleList.indexOf(6));
        System.out.println(doubleList.toString());
    }
}
