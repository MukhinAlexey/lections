package com.samples.collections.collection;

public class ArraycopyCheck {

    public static void main(String[] args) {
        int size = 5000;
        for (int count = 0; count < 50; count++) {
            size = size * 2;
            long start, end;
            Integer[] integers = new Integer[size];
            Integer[] systemCopy = new Integer[size];

            start = System.currentTimeMillis();
            System.arraycopy(integers, 0, systemCopy, 0, size);
            end = System.currentTimeMillis();
            System.out.printf("%s %s%n", size, end - start);
        }
    }
}
